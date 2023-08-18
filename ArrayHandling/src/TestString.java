import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		String[] strarr=new String[4];
		String[] s1= {"xxx","yyy","zzz"};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<strarr.length;i++) {
			System.out.println("enter string");
			strarr[i]=sc.nextLine();
		}
		
		
		for(String s:strarr) {
			System.out.println(s);
		}
		
		System.out.println("enter number");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println("enetr name");
		String nm=sc.nextLine();
		
		System.out.println("Num: "+i+" Name : "+nm);

		
	}

}
