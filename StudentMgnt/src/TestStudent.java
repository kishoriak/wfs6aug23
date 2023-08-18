import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student(12,"Kishori","Khadilkar",99,98,98);
		System.out.println(s); 
		//display data in csv format
		System.out.println(s.getSid()+","+s.getFname()+"  "+s.getlname()+","+s.getM1()+","+s.getM2()+","+s.getM3());
		Student s1=new Student();
		s1.setSid(12);
		s1.setFname("Rajan");
		s1.setLname("Khadilkar");
		s1.setM1(95);
		s1.setM2(97);
		s1.setM3(96);
		
		System.out.println(s1);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter fname");
		String fnm=sc.next();
		System.out.println("enter lname");
		String lnm=sc.next();
		System.out.println("enter m1");
		float m1=sc.nextFloat();
		System.out.println("enter m2");
		float m2=sc.nextFloat();
		System.out.println("enter m3");
		float m3=sc.nextFloat();
		Student s2=new Student(sid,fnm,lnm,m1,m2,m3);
		System.out.println(s2);
	}

}
