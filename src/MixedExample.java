import java.util.Arrays;

public class MixedExample {
	
	static int x =0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {5,2,3,4,1};
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}		
	}
}
