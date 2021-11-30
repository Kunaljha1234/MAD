public class Kunal{
	public static void swapF(int a, int b){
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.print("a = " +a+ " b = " +b);
	}
	public static void main(String[] args) {
		int a = 5,b = 6;
		System.out.println("a = " +a+ " b = " +b);
		swapF(a,b);
	}
}