import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;

public class PersonService {
	private static Person[] perarr;
	private static int cnt;
	static{
		perarr=new Person[50];
		perarr[0]=new Person(12,"Rajan",new Date(),22);
		perarr[1]=new Person(13,"Revati",new Date(),26);
		perarr[2]=new Person(12,"Atharva",new Date(),26);
		perarr[3]=new Person(12,"Ashish",new Date(),25);
		cnt=4;
	}
	public static void addNewPerson() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enetr name");
		String nm=sc.nextLine();
		System.out.println("enetr birthdate(dd/MM/yy");
		String dt=sc.next();
		Date dt1=null;
		try {
		   dt1=sdf.parse(dt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println("enetr age");
		int age=sc.nextInt();
		perarr[cnt]=new Person(id,nm,dt1,age);
		cnt++;
	}
	
	public static Person[] getAllPersons() {
		return perarr;
	}

	public static Person searchById(int id) {
		for(Person p:perarr) {
			if(p==null) {
				return null;
			}
			else {
				if(p.getPid()==id) {
					return p;
				}
		}
		}
		return null;
	}

}
