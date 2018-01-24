package 剑指Offer;

public class 数值的整数次方 {

	/**
	 * 这题主要考虑的是代码的质量，边界测试，
	 * x^y  x=负，0，正   y也可以为负，0，正
	 * x^0=1, 0^正=0,0^负无效
	 * double的底数，如何判断是0，比较范围 n和0.0是否在某个0.000000000000000001范围内
	 *考虑判断奇偶数，使得x^y=x^y/2 * x^y/2
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
