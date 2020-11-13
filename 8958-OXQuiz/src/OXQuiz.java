import java.io.*;

public class OXQuiz {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("start");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] testcase = {"OOXXOXXOOO", "OOXXOOXXOO", "OXOXOXOXOXOXOX", "OOOOOOOOOO", "OOOOXOOOOXOOOOX"};
		
		for(int i = 0; i < testcase.length; i++) {
			bw.write(score(testcase[i]) + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
	
	public static int score(String ox) {
		
		char before = ox.charAt(0);
		int accum = 0;
		int sum = 0;
		
		if(before == 'O') {
			sum += 1;
		}
		
		for(int i= 1; i < ox.length(); i++) {	
			
			if(ox.charAt(i) == 'O') {
				sum += 1;
			
				if((before == 'O') && ox.charAt(i) == 'O') {
					accum += 1;
				}
				
				sum += accum;
			} else {
				accum = 0;
			}
			
			
			before = ox.charAt(i);
		}
		
		return sum;
		
	}

}