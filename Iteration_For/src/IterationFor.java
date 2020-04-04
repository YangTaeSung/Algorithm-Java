import java.util.Scanner;

public class IterationFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("N을 입력하세요");
		
		int n = scanner.nextInt();
		
		for(int i = 1; i < 10; i++) {
			
			System.out.println(n + " * " + i + " = " + (n * i));
			
		}

	}

}
