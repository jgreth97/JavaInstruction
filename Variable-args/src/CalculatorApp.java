
public class CalculatorApp {

	public static void main(String[] args) {

		System.out.println("welcome to the calc");
		System.out.println(sum(2,4));
		System.out.println(sum(2,4,6));
		System.out.println(sum(2,4,6,8));
		System.out.println(sum(2,4,6,8,10));
		System.out.println(sum(5,8,2,5,6,7,8,12,15,17,19));
		System.out.println(sum(9000000,9999999,1000000000));
		
		System.out.println("bye");

	}
private static int sum(int a, int b) {
	return a + b;
}
private static int sum(int a, int b, int c) {
	return a + b + c;
}
private static int sum(int a, int b, int c, int d) {
	return a + b + c + d;
}
//variable # of args
private static int sum(int...n) {
	int sum =0;
	for (int a: n) {
		sum += a;
	}
	return sum;
}
}
