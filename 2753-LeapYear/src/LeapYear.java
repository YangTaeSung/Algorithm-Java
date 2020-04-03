import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = scanner.nextInt();
		
		if(((year % 100) == 0) && ((year % 4) == 0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		

	}

}
