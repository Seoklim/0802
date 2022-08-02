
public class ArrayDemo1 {
	public static void main(String[] args) {
		int [][] array = null; //declaration
		array = new int[2][3]; //creation
		array[0][0]= (int)(Math.random()*10+1);  //Assignment
		array[0][1]= (int)(Math.random()*10+1);
		array[0][2]= (int)(Math.random()*10+1);
		array[1][0]= (int)(Math.random()*10+1);
		array[1][1]= (int)(Math.random()*10+1);
		array[1][2]= (int)(Math.random()*10+1);

		int [][] array;
		array = new int [][] {{3,4,5,6}, {7,8,9,10}};
		
		
		int [][] array = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		<Ragged(Jagged)Array> //각층의 열의개수는 다를수있다.
		int [][] array;
		array = new int[3][];
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[1];
		array[0][0] 
		---------------------------------------------------------------------------
		int [][] array;
		array = new int[3][];
		array[0] = new int[] = {3,4,5,6,7,8};
		array[1] = new int[] = {39,10};
		array[2] = new int[] = {39,10,12,123};
		----------------------------------------------------------------------------
		int[][]array = {
				{3,4,5,6},
				{7,8},
				{8,9,20,34,234,12}
		};
		
		for(int i = 0; i < array.length ; i++) {
			System.out.println(array[i]);
		}
		
				
				
				
				
		
		
	}
}
