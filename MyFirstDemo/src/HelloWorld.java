
public class HelloWorld {

	public static void main(String[] args) {
		 System.out.println("Hello World!!");
		 System.out.println("length"+args.length);
		 int sum=0;
		 for(int i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
		 }
		 System.out.println("Addition : "+sum);
		 long j=23;
		 float f=j;
		 short x=23;
		 byte y=(byte)x;
		 
		 
		 
	}

}
