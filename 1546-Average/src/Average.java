import java.util.ArrayList;
import java.io.*;

public class Average {

	//객체 생성하는 곳에서 Buffer 사용하지만 메인에서도 IOException
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Ave ave = new Ave();
		ave.cal(1,100,100,100);
		
	}

}

class Ave {
	
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int max;
	double ave; // 소수점 출력을 위한 double 선
	
	// 가변인자 사용
	// Buffer사용 -> IOException
	public void cal(int...subject) throws IOException {
		
		max = subject[0];
		int maxIndex = 0;
		double sum = 0; // sum을 int로 선언하면 결과 이상하게 나옴 
		
		for(int i = 1; i < subject.length; i++) {
			
			
			if(subject[i] > max) {
				
				max = subject[i];
				maxIndex = i;
				
			}
			
		}
		
		for(int i = 0; i < subject.length; i++) {
			
				sum += subject[i];
			
		}
		
		ave = sum/(subject.length);
		
		
		//String.format으로 소수점 6째자리까지 표현
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("result : " + String.format("%.6f", ave/max*100) + "\n");
		bw.flush();
		bw.close();
		
	}
	
}
