import java.util.Scanner;

public class Input {
	static void input(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : "); student.name = sc.nextLine();
		System.out.println("학번 : "); student.hakbun = sc.nextLine();
		System.out.println("국어 : "); student.kor = sc.nextInt();
		System.out.println("영어 : "); student.eng = sc.nextInt();
		System.out.println("수학 : "); student.mat = sc.nextInt();
	}
}
