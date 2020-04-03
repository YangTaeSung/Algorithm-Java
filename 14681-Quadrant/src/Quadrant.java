import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x좌표를 입력하세요");
		int x = scanner.nextInt();
		
		System.out.println("y좌표를 입력하세요");
		int y = scanner.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("Quadrant1");
		} else if(x < 0 && y > 0) {
			System.out.println("Quadrant2");
		} else if(x < 0 && y < 0) {
			System.out.println("Quadrant3");
		} else if(x > 0 && y < 0) {
			System.out.println("Quadrant4");
		} else
			System.out.println("Not including");
		
	}

}
