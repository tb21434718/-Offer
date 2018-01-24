package 剑指Offer;

public class 二维数组查找 {

	/**
	 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
	 * 判断数组中是否含有该整数。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
二维数组查找  t=new 二维数组查找 ();
System.out.println(t.Find1(7, a));
	}
	public boolean Find(int target, int [][] array) {
		for(int i=array.length-1;i>=0;i--)
		{
			for(int j=0;j<array[0].length;j++)
			{
				if(array[i][j]==target)
					return true;
				else if(array[i][j]<target)
					j++;
				else i--;
			}
		}
		return false;
    }
	
	public boolean Find1(int target, int [][] array) {
		int i=array.length-1,j=0;
		while(i>=0&&j<array[0].length)
		{
			if(array[i][j]==target)
				return true;
			else if(array[i][j]<target)
				j++;
			else i--;
		}
		return false;
    }
}
