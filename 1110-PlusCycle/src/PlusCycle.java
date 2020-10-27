/*
 * 
 * 백준 1110
 * BufferedReader br = new BufferedReader(InputStreamReader(System.in));
 * BufferedWriter bw = new BufferedWriter(OutputStreamWriter(System.out));
 * int n = Integer.parseInt(br.readLine());
 * bw.write();
 * bw.flush();
 * bw.close();
 * 
 */

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
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cycle = 0;
		
		int ten = n/10;
		int one = n%10;
		int res = ten + one;
		int newNum = one * 10 + res % 10;
		cycle++;
		bw.write(ten + " + " + one + " = " + res + " # new number : " + newNum + "\n");
		
		if(n >= 10) {
			
			while(n != newNum) {
				
				cycle++;
				ten = newNum / 10;
				one = newNum % 10;
				res = ten + one;
				newNum = one * 10 + res % 10;
				bw.write(ten + " + " + one + " = " + res + " # new number : " + newNum + "\n");
				
			}
			
		} else {
			
			do {
			
				cycle++;
				ten = newNum / 10;
				one = newNum % 10;
				res = ten + one;
				newNum = one * 10 + res % 10;
				bw.write(ten + " + " + one + " = " + res + " # new number : " + newNum + "\n");
			
			} while(n != newNum);
			
		}
		
		bw.write("총 사이클 수 : " + cycle);
		bw.flush();
		bw.close();
		
	}

}
