import java.util.Scanner;
public class GradeInputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int grade = scanner.nextInt();
		
		if(grade >= 90) {
			System.out.println("A");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("B");
		}else if(grade >= 70 && grade < 80) {
			System.out.println("C");
		}else if(grade >= 60 && grade < 70) {
			System.out.println("D");
		}else
			System.out.println("F");
		
	}

}
