
public class Study {
	public static void main(String[] args) {
		int[][] jungdap = { { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 }, { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 },
				{ 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 }, { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 }, { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 } };
		int[][] array = { { 1, 2, 2, 4, 2, 2, 3, 4, 1, 2 }, { 1, 2, 3, 4, 1, 1, 1, 4, 1, 1 },
				{ 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 }, { 1, 3, 3, 3, 3, 3, 3, 3, 1, 2 }, { 1, 2, 3, 4, 1, 2, 3, 1, 1, 2 } };
		int score = 0;
		int count = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				System.out.print("한지민 : ");
				break;
			case 1:
				System.out.print("박지민 : ");
				break;
			case 2:
				System.out.print("홍지민 : ");
				break;
			case 3:
				System.out.print("신지민 : ");
				break;
			case 4:
				System.out.print("김지민 : ");
				break;
			}
			for (int j = 0; j < 10; j++) {
				if (array[i][j] == jungdap[i][j]) {
					System.out.print("o ");
					score += 10;
					count++;
				} else {
					System.out.print("x ");
					count++;
				}
				if (count == 10) {
					System.out.print("(" + score + "점)");
				}
			}
			System.out.println();
			score = 0;
			count = 0;
		}

	}
}
