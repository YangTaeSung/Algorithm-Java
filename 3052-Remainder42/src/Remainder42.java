import java.util.ArrayList;

public class Remainder42 {

	int[] num = {0,0,0,0,0,0,0,0,0,0};
	
	public Remainder42(int a, int b, int c, int d, int e, int f, int g, int h, int j, int k) {
		
		num[0] = a;
		num[1] = b;
		num[2] = c;
		num[3] = d;
		num[4] = e;
		num[5] = f;
		num[6] = g;
		num[7] = h;
		num[8] = j;
		num[9] = k;
		
	}
	
	public int result() {
		
		int result = 0;
		
		ArrayList stack = new ArrayList<>();
		
		for(int i = 0; i < num.length; i++) {
			
			 if(!stack.contains(num[i]%42)) {
				 
				 stack.add(num[i]%42);
				 
			 }
			
		}
		
		result = stack.size();
		
		return result;
		
	}


}
