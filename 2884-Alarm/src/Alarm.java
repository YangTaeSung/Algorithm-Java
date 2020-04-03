import java.util.Scanner;

// 입력한 시간의 45분 전 시간 출력

public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시간을 입력하세요");
		int h = scanner.nextInt();
		
		System.out.println("분을 입력하세요");
		int m = scanner.nextInt();
		
		if(m < 45) {
			if(h == 0) {
				h = 23;
			} else {
				h -= 1;
			}
			m = 60 - (45 - m);
		} else {
			m -= 45;
		}
		
		System.out.println(h + "시 " + m + "분");

	}

}
