package 剑指Offer;

import java.util.Arrays;

public class 正数数组中奇偶数位置对换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={2,3,4,5,6,7,8};
reOrderArray2(a);
for(int i=0;i<a.length;i++)
	System.out.println(a[i]);
	}
	//冒泡排序，每一趟确定一个奇数在最前面
	 public static void reOrderArray(int [] array) {
		 for(int i= 0;i<array.length-1;i++){
	            for(int j=0;j<array.length-1-i;j++){
	                if(array[j]%2==0&&array[j+1]%2==1){
	                    int t = array[j];
	                    array[j]=array[j+1];
	                    array[j+1]=t;
	                }
	            }
	        }
	    }
	 //空间换时间
	 public static void reOrderArray2(int [] array) {
		 int temp[]=new int[array.length];
		 int count=0,jicount=0;
		 for(int i= 0;i<array.length-1;i++){
	           if(array[i]%2==1)
	        	   count++;
	        }
		 for(int i=0;i<array.length;i++){
			 if((array[i]&1)==1)
				 temp[jicount++]=array[i];
			 else 
				 temp[count++]=array[i];
		 }
		 for(int i=0;i<array.length;i++){
			 array[i]=temp[i];
		 }
		 
	    }

}
