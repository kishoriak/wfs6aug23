class HelloWorld{
   public static void main(String[] args){
       System.out.println("Hello world!!");
	   System.out.println("length"+args.length);
	   int sum=0;
	   for(int i=0;i<args.length;i++){
		   sum=sum+Integer.parseInt(args[i]);
	   }
	   System.out.println("Addition: "+sum);
   }
   

}