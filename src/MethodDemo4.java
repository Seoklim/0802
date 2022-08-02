
public class MethodDemo4 {
	public static void main(String[] args) {
		int original = 5;
		System.out.println("Before calling method, original = " + original);
		mymethod(original);
		System.out.println("After calling method, original = " + original);
	}

	static void mymethod(int target) {  //주소가 넘어오면 주소로 받는다 call by reference
		System.out.println("in method, target = " + target);
		target = 100;
		System.out.println("in method, target = " + target);
	}

//	static void mymethod(int su, double weight, char grade, String str) {

}
