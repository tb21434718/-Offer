package ��ָOffer;

public class ��ֵ�������η� {

	/**
	 * ������Ҫ���ǵ��Ǵ�����������߽���ԣ�
	 * x^y  x=����0����   yҲ����Ϊ����0����
	 * x^0=1, 0^��=0,0^����Ч
	 * double�ĵ���������ж���0���ȽϷ�Χ n��0.0�Ƿ���ĳ��0.000000000000000001��Χ��
	 *�����ж���ż����ʹ��x^y=x^y/2 * x^y/2
	 *x^y=x^y-1/2 * x^y-1/2 *x
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Power2(3,-2));
	}
	 public static double Power(double base, int exponent) {
	        
		 int n=Math.abs(exponent);
	        if(n==0)
	            return 1;
	        if(n==1)
	            return base;
	        double  result=Power(base,n>>1);
	        result*=result;
	        if((n&1)==1)
	            result*=base;
	        if(exponent<0)
	            result=1/result;
	        return result;       
	  }
	 public static double Power2(double base, int exponent) {
	        
		 int n=exponent;//Math.abs(exponent);
	        if(n==0)
	            return 1;
	        if(n==1)
	            return base;
	        double  result=Power(base,n>>1);
	        result*=result;
	        if((n&1)==1)
	            result*=base;
	       // if(exponent<0)
	       //     result=1/result;
	        return result;       
	  }

}
