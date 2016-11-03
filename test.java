# zdf
import java.util.Scanner;
class panduan 
{
	public static void main(String[] args) 
	{
		while(true){
			int n;
			Scanner s=new Scanner(System.in);
			n=s.nextInt();
			if(n%4==0&&n%100!=0)
				System.out.println("今年是闰年！");
			else if(n%4==0&&n%100==0)
				System.out.println("今年是闰年！");
			else
				System.out.println("很抱歉，今年不是闰年！");
		}

	}
}
