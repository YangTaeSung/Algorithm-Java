import java.io.*;
import java.util.Random;


public class NumberFinding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("숫자 세 개를 입력해주세요");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int result = a * b * c;
		//br.close();
		
		bw.write(a + " * " + b + " * " + c + " = " + result + "\n");
		
		
		String resultStr = Integer.toString(result);
		int[] num = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 0; i < resultStr.length(); i++) {
			
			System.out.println(resultStr.charAt(i));
			
			switch(resultStr.charAt(i)) {
			
				case '0' :
					num[0] = num[0] + 1;
				break;
				case '1' :
					num[1]++;
				break;
				case '2' :
					num[2]++;
				break;
				case '3' :
					num[3]++;
				break;
				case '4' :
					num[4]++;
				break;
				case '5' :
					num[5]++;
				break;
				case '6' :
					num[6]++;
				break;
				case '7' :
					num[7]++;
				break;
				case '8' :
					num[8]++;
				break;
				case '9' :
					num[9]++;
				break;
			
			}
			
		}
		
		for(int i = 0; i < num.length; i++) {
			
			bw.write(i + "의 개수 = " + num[i] + "\n");
			
		}
		
		bw.flush();
		bw.close();
		
	}

}
