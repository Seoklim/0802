
public class MethodDemo3 {
	public static void main(String[] args) {
//		System.out.println(mymethod(5));

	}

	static Student mymethod() { // 객체 넘기기, 리턴타입 = Student
		Student jimin = new Student();
		jimin.name = "한지민";
		jimin.age = 26;
		return jimin;
	}
//	static int [] mymethod() {           //리턴타입은 int [], 여러개보낼땐 배열
//		return new int[]{5,9,34,24,42,1};		
//	}
}
//	static String mymethod(int su) {  //리턴은 하나만
//	if(su % 2 == 0) return "Hello";
//	else return "World";
//	}
