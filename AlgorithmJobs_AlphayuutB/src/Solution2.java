import java.util.Scanner;

public class Solution2{
  
    public static void main(String[] args){
      
      // solution에서는 list로 score 하나씩 for문에서 추가했는데 그럴필요 없이 그냥 선언하면됨 
      int[] list = {0,5,10,15,20,50,
    		  30,35,40,45,100,
    		  55,60,65,70,75,
    		  80,85,90,95,500,1000};
      int current = 0;
      

      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      
      for(int i = 0; i < n; i++) {
    	  
    	  int m = scanner.nextInt();
    	  current += m;
    	  
    	  if(current > 21) current = 21;
    	  
    	  System.out.print(list[current] + " ");
    	  
    	  if(current == 21) break;
      
      }
	}
}