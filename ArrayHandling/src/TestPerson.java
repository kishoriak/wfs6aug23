import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1. Add new Person\n2. display all\n3. display with age> given value\n");
		System.out.println("4. search by name\n5. search by id\n6. exit\nchoice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			PersonService.addNewPerson();
			break;
		case 2:
			Person[] perarr=PersonService.getAllPersons();
			for(Person p:perarr) {
				if(p==null)
					break;
				System.out.println(p);
			}
			break;
		case 5:
			System.out.println("enetr id for search");
			int id=sc.nextInt();
			Person p=PersonService.searchById(id);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("Not found : "+id);
			}
			break;
		case 6:
			sc.close();
			System.out.println("Thank you for using the application....");
			//System.exit(0);
			break;
		default:
			System.out.println("wrong choice");
		}
		}while(choice!=6);
	}

}
