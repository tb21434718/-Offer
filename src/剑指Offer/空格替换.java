package ��ָOffer;

import java.util.*;

public class �ո��滻 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�ո��滻 t=new �ո��滻();
		System.out.println(t.replaceSpace(new StringBuffer("i am a")));
		}
	 public String replaceSpace(StringBuffer str) {
		 String sti = str.toString();
	        char[] strChar = sti.toCharArray();
	        StringBuffer stb = new StringBuffer();
	        for(int i=0;i<strChar.length;i++){
	            if(strChar[i]==' '){
	                stb.append("%20");
	            }else{
	                stb.append(strChar[i]);
	            }
	        }
	        return stb.toString();
	    }
	 /* c++����ô�ɵ�
	 ����1���滻�ַ���������ԭ�����ַ��������滻�������¿���һ���ַ������滻��
	 ����2���ڵ�ǰ�ַ����滻����ô�滻�Ÿ���Ч�ʣ�������java�����е�replace��������
	       ��ǰ�����滻��������ַ�Ҫ���������ƶ���Ҫ����ƶ�������Ч�ʵ���
	       �Ӻ���ǰ���ȼ�����Ҫ���ٿռ䣬Ȼ��Ӻ���ǰ�ƶ�����ÿ���ַ�ֻΪ�ƶ�һ�Σ�����Ч�ʸ���һ�㡣
	 */
	 public String replaceSpace1(StringBuffer str) {
	        int spacenum = 0;//spacenumΪ����ո���
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)==' ')
	                spacenum++;
	        }
	        int indexold = str.length()-1; //indexoldΪΪ�滻ǰ��str�±�
	        int newlength = str.length() + spacenum*2;//����ո�ת����%20֮���str����
	        int indexnew = newlength-1;//indexoldΪΪ�ѿո��滻Ϊ%20���str�±�
	        str.setLength(newlength);//ʹstr�ĳ�������ת����%20֮��ĳ���,��ֹ�±�Խ��
	        for(;indexold>=0 && indexold<newlength;--indexold){ 
	                if(str.charAt(indexold) == ' '){  //
	                str.setCharAt(indexnew--, '0');
	                str.setCharAt(indexnew--, '2');
	                str.setCharAt(indexnew--, '%');
	                }else{
	                    str.setCharAt(indexnew--, str.charAt(indexold));
	                }
	        }
	        return str.toString();
	    }

}
