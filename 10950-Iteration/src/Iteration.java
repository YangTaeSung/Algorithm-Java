/*
 * 
 * 백준 10950
 * Scanner sc = new Scanner(System.in);
 * BufferedReader br = new BufferedReader(InputStreamReader(System.in));
 * int n = Integer.parseInt(br.readLine());
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Iteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in); 
		// 되도록이면 스캐너 쓰지 말자!
		/* 
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		*/
		
		System.out.println("Test case input");
		int tc = scanner.nextInt();
		
		for(int i = 0; i < tc; i++) {
			
			System.out.println("input1");
			int i1 = scanner.nextInt();
			System.out.println("input2");
			int i2 = scanner.nextInt();
			
			System.out.println(i1 + " + " + i2 + " = " + (i1 + i2));
				
		}

	}

}
