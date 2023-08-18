import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayService {
	//accept data in the array
	public static void acceptdata(int[] intarr) {
    	Scanner sc=new Scanner(System.in);
		for(int i=0;i<intarr.length;i++) {
			System.out.println("enetr value at"+i+" posiiton");
			intarr[i]=sc.nextInt();
		}
    }
	//display data from the array
    public static void displaydata(int[] arr) {
    	//java 1.5 
    			for(int i=0;i<arr.length;i++) {
    				System.out.println(arr[i]);
    			}
    			//java 1.7
    			for(int num:arr) {
    				System.out.println(num);
    			}
    			System.out.println("+++++++++++++++++++");
    			//java 1.8
    			IntStream sint=Arrays.stream(arr);
    			sint.forEach(num->System.out.println(num));
    			Integer[] intarr2= {1,2,3,4,5,12,11,1};
    			Stream.of(intarr2).forEach(num->System.out.println(num));
    }
    
    public static void accept2Darr(int[][] arr) {
    	   	Scanner sc=new Scanner(System.in);
    	   	//rows counter
    		for(int i=0;i<arr.length;i++) {
    			//allocate memory for every row if it is a dynamic array
    			//loop for column counter
    			for(int j=0;j<arr[i].length;j++) {
    			System.out.println("enetr value at"+i+" row"+j+" column");
    			arr[i][j]=sc.nextInt();
    			}
    		}
        
    }

    public static void display2Ddata(int[][] arr) {
	//java 1.5 
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;i++) {
			System.out.print(arr[i]+"\t");
		}
	    System.out.println();
		
		}
    }

    public static int addEvenNumbers(int[][] arr) {
    	int evensum=0;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;i++) {
    			if(arr[i][j]%2==0) {
    				evensum+=arr[i][j];
    			}
    		}
    	}
    	return evensum;
	
    }
	public static int[] getRowsum(int[][] arr) {
		int[] rowsum=new int[arr.length];
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[i].length;j++) {
    			  rowsum[i]=rowsum[i]+arr[i][j];
    				
    		}
    	}
    	return rowsum;
	}
	
	public static int[] getColumnSum(int[][] arr) {
		int[] colsum=new int[arr[0].length];
		for(int j=0;j<arr[0].length;j++) {
    		for(int i=0;i<arr.length;i++)  {
    			  colsum[j]=colsum[j]+arr[i][j];
    				
    		}
    	}
    	return colsum;
	}

}
