/*
 * 
 * 백준 10818
 * ArrayList<Integer> arrayList = new ArrayList<>();
 * Random random = new Random();
 * random.nextInt();
 * Integer값(arraylist)은 그냥 int 변수에 담을 수 있음. 
 * 
 */

import java.util.ArrayList;
import java.util.Random;

// 연습용 작업 
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
	
		for(int i = 0; i < 5; i++) {
			
			arrayList.add(random.nextInt());
			System.out.println(arrayList.get(i));
		
		}
		
		
		int max = arrayList.get(0); // Integer 값을 int 변수에 담음. 
		int min = arrayList.get(1);
		
		for(int i = 0; i < 5; i++) {
			
			if(max < arrayList.get(i)) {
				
				max = arrayList.get(i);
				
			}
			
			if(min > arrayList.get(i)) {
				
				min = arrayList.get(i);
				
			}
			
		}
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		
	}

}

// 백준 제출용 작업
/*
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] arrS = new String[n];
		int[] arrI = new int[n];
		arrS = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			arrI[i] = Integer.parseInt(arrS[i]);
		}
		
		int max = arrI[0];
		int min = arrI[0];
		for(int i = 0; i < n; i++) {
			if(max < arrI[i]) max = arrI[i];
			if(min > arrI[i]) min = arrI[i];
		}
		
		bw.write(min + " " + max);
		bw.flush();
		bw.close();
	}
}
*/