package ��ָOffer;

import java.util.Arrays;

public class ��ת������С����nlgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� һ�����֣�2������
		//�������û����ת
		//10111��01111���֣�11101��01111�� �����м�����ǰָ���Ӧ������ȣ��޷��ж������Ǹ������ƶ���ֻ�ܱ���һ��
		��ת������С����nlgn t=new ��ת������С����nlgn ();
		int a1[]={0,1,1,1,1};
		int a[]={6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
	System.out.println(	t.minNumberInRotateArray(a)+" "+a.length);
	System.out.println(minNumberInRotateArray2(a1));
	}
	 public int minNumberInRotateArray(int [] array) {
		 if(array.length==0)
			 return 0;
		 if(array.length<=2)
			 return array[0]<array[array.length-1]?array[0]:array[array.length-1];//���õȺ��Ƿ�ֹ��δ��ת�������������
			 
		 int mid=(0+array.length-1)/2;
		 if(array[mid]<array[mid-1]&&array[mid]<array[mid+1])
				return array[mid];
		 
		 int index1=0,index2=array.length-1;
		 mid=index1;//����ת��ԭ������ͬʱ�򣬵�һ��������С��
		 while(array[index1]>=array[index2])
		 {//��ת��������
			 if(index2-index1==1)
			 {
				 mid=index2;
				 break;
			 }
			 mid=(index1+index2)/2;
			 if(array[index1]==array[mid]&&array[index2]==array[mid])
				 {
				 Arrays.sort(array, index1, index2+1);
				 return array[index1];
				 }
			 if(array[index1]<=array[mid])
				 index1=mid;
			 if(array[index2]>=array[mid])
				 index2=mid;
			 
		 }
		return array[mid];
	    }
	 public static int minNumberInRotateArray2(int[] array) {
	        if (array.length == 0)
	            return 0;
	        int left = 0;
	        int right = array.length - 1;
	        int middle = -1;
	        while (array[left]>=array[right]) {
	            if(right-left==1){
	                middle = right;
	                break;
	            }
	            middle = left + (right - left) / 2;
	            if (array[middle] >= array[left]) {
	                left = middle;
	            }
	            if (array[middle] <= array[right]) {
	                right = middle;
	            }
	        }
	        return array[middle];
	    }
	
}
