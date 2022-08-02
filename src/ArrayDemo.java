import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {4,6,2,3,4,2,1,6,7,6,6,6};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After Ascding Sorting");
		System.out.println(Arrays.toString(array));
		System.out.println("After Descding Sorting");
		System.out.print("[");
		for(int i = array.length-1; i >=0; i--) {

			System.out.print(array[i]);
			
		}
		System.out.print("]");
	}
}
