import java.util.stream.Stream;
public class TestStringFunctions {
	public static void main(String[] args) {
	     		String str = "Studytonight \n is a \r technical \n portal"; 
				Stream<String> lines = str.lines();
		       // lines.forEach(System.out::println);	
		        lines.forEach(str1->System.out.println(str1));
		        String s1="";
		        System.out.println(s1.isBlank());
		        String s2="   this us test   ";
		        System.out.println("test "+s2+"trail");
		        System.out.println("test "+s2.strip()+"trail");
		        String S2="testing";
		        //System.out.println(s2.indexOf("st"));
		        System.out.println(s2.toUpperCase());
		        String ss1="Hello";
		        String ss2="Hello";
		        String ss3=new String("Hello");
		        System.out.println(ss1==ss2);
		        System.out.println(ss1==ss3);	
		        System.out.println(ss1.equals(ss3));
		        System.out.println(ss1.compareTo("best"));
			}        
		
}
