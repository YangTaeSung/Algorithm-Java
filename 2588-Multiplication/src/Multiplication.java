
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 472;
		int b = 385;
		
		int result3 = a * (b % 10);
		int result4 = a * ((b % 100) / 10);
		int result5 = a * (b / 100);
		int result6 = a * b;
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
	}

}
