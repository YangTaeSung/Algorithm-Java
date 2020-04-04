import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PlusCycle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("0~99 중의 숫자를 입력하세요");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cycle = 0;
		
		int ten = n/10;
		int one = n%10;
		int res = ten + one;
		int newNum = one * 10 + res % 10;
		cycle++;
		System.out.println(ten + " + " + one + " = " + res + " # new number : " + newNum);
		
		if(n >= 10) {
			
			while(n != newNum) {
				
				cycle++;
				ten = newNum / 10;
				one = newNum % 10;
				res = ten + one;
				newNum = one * 10 + res % 10;
				System.out.println(ten + " + " + one + " = " + res + " # new number : " + newNum);
				
			}
			
		} else {
			
			do {
			
				cycle++;
				ten = newNum / 10;
				one = newNum % 10;
				res = ten + one;
				newNum = one * 10 + res % 10;
				System.out.println(ten + " + " + one + " = " + res + " # new number : " + newNum);
			
			} while(n != newNum);
			
		}
		
		System.out.println("총 사이클 수 : " + cycle);
		
	}

}
