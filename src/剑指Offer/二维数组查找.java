package ��ָOffer;

public class ��ά������� {

	/**
	 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
	 * �ж��������Ƿ��и�������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
��ά�������  t=new ��ά������� ();
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
