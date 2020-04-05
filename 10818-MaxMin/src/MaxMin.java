import java.util.ArrayList;
import java.util.Random;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
	
		for(int i = 0; i < 5; i++) {
			
			arrayList.add(random.nextInt());
			System.out.println(arrayList.get(i));
		
		}
		
		
		int max = arrayList.get(0);
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
