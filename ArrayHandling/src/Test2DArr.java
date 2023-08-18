
public class Test2DArr {

	public static void main(String[] args) {
		int[][] intarr=new int[3][4];
		ArrayService.accept2Darr(intarr);
		System.out.println("Addition : "+ArrayService.addEvenNumbers(intarr));
		int[] rowwisesum=ArrayService.getRowsum(intarr);
		int[] colsum=ArrayService.getColumnSum(intarr);
		for(int a:rowwisesum) {
			
			System.out.print("rowwise sum: "+a+"\t");
		}
		for(int a:colsum) {
			
			System.out.print("rowwise sum: "+a+"\t");
		}
	}

}
