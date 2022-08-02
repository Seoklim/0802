
public class MethodDemo {

	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo md = new MethodDemo();
		md.makeSum();
		md.makeSum();
		System.out.println("Program is Over");
	}

	void makeSum() { // 이름, 괄호, 복귀타입(return type)    //Call by Name
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("Method is Over");
	}
}
