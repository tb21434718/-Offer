package 剑指Offer;

public class 正数二进制中的1个数 {

		//最优解
		public static int NumberOf1(int n) {
			int count = 0;
			while (n != 0) {
				++count;
				n = (n - 1) & n;
				}
			return count;
		}
		
		
		/**
		 * 首先判断n是不是负数，当n为负数的时候，直接用后面的while循环会导致死循环，因为负数
		 * 向左移位的话最高位补1 ！ 因此需要一点点特殊操作，可以将最高位的符号位1变成0，也就
		 * 是n & 0x7FFFFFFF，这样就把负数转化成正数了，唯一差别就是最高位由1变成0，因为少了
		 * 一个1，所以count加1。之后再按照while循环里处理正数的方法来操作就可以啦！
		 * @param args
		 */
		//处理正负
				public static int NumberOf1_(int n)
				{
					int count=0;
					if(n<0)
					{
						n=n&0x7FFFFFFF;//最大正数
						count++;
					}
					while(n!=0)
					{
						count+= n & 1;
						n=n>>1;
					}

					return count;
				}

				public static int NumberOf2(int n){
					//不是把n右移，而是声明一个flag=1,左移动
					int flag=1;
					int count=0;
					while(flag!=0){//复杂度太大，虽然树上说是移动int的位数
						if((flag&n)!=0)
							count++;
					}
					return count;
				}
		public static void main(String[] args) {
			int n = -10;
			System.out.println(n + "的二进制中1的个数：" + NumberOf1(n));
			System.out.println(Math.pow(0, -1));
 }
		}


