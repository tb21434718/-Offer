package 剑指Offer;

import java.util.Arrays;

public class 重建二叉树 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//思想就是选择根节点作为原来大树左右子节点
public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	if(pre.length==0||in.length==0)
		return null;
	TreeNode t=new TreeNode(pre[0]);
	for(int i=0;i<in.length;i++){
		if(pre[0]==in[i])
			{
			t.left= reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1),Arrays.copyOfRange(in, 0, i));
			t.right=reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length),Arrays.copyOfRange(in, i+1, in.length));
			}
	}
        return t;
        
    }

}
class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }