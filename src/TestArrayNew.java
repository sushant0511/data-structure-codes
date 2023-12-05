import java.util.Arrays;
import java.util.Scanner;

public class TestArrayNew {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
		
//		for(int s:a)
//		{
//			System.out.println(s);
//		}
		
		
		
	}

}
