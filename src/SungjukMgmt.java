import java.util.Scanner;

//입력 연산 출력을 메소드에서
public class SungjukMgmt {
	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student jimin = new Student();
		Input.input(jimin);
		Calc.calc(jimin); // 계산
		Output.output(jimin); // 출력
		System.out.println("성적관리프로그램 끝");
	}

}
