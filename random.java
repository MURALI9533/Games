import java.util.concurrent.ThreadLocalRandom;
public class random
{
	public static void s(String xxx)
	{
		StringBuffer m=new StringBuffer(xxx);
		int length=m.length();
		int xx=length;
		StringBuffer s=new StringBuffer();
		for(int i=0;i<length;i++)
		{
			int x=ThreadLocalRandom.current().nextInt(0, xx);
			xx-=1;
			s.append(m.charAt(x));
			m.deleteCharAt(x);
		}
		System.out.println(s);
	}

	public static void o(String xxx)
	{
		StringBuffer m=new StringBuffer(xxx);
		int length=m.length();
		int xx=length;
		for(int i=0;i<length/2;i++)
		{
			int x=ThreadLocalRandom.current().nextInt(0, xx);
			xx-=1;
			m.replace(x,x+1,"*");
			
		}
		System.out.println(m);
	}
}