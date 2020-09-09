import java.io.*;

public class Average {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(cal(5,50,50,70,80,100) + "\n");
		bw.write(cal(7,100,95,90,80,70,60,50) + "\n");
		bw.write(cal(3,70,90,80) + "\n");
		bw.write(cal(3,70,90,81) + "\n");
		bw.write(cal(9,100,99,98,97,96,95,94,93,91) + "\n");
		
		bw.flush();
		bw.close();

	}
	
	public static String cal(int testcase, int... score) {
		
		double sum = 0;
		double ave = 0;
		int winner = 0;
		double result = 0;
		
		for(int i = 0; i < testcase; i++) {
			
			sum += score[i];
			
		}
		
		ave = sum / testcase;
		
		for(int i = 0; i < testcase; i++) {
			
			if(ave < score[i]) {
				
				winner++;
				
			}
			
		}
		
		// winner나 testcase 중 하나라도 double이어야 해
		// 아니면 0이 나와버려
		result = (double)winner / testcase * 100;
		
		return String.format("%.3f", result);
		
	}

}
