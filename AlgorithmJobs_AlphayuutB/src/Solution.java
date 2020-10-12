import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution{
  
  private static boolean isFinished = false;
  
    public static void main(String[] args){
      
      int[] arr;

      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      
      arr = new int[n];
      for(int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      
      List<Integer> list = new ArrayList<>();
      list.add(0);
      int score = 5;

      for(int i = 1; i < 22; i++) {
        if(i==5) {
          list.add(50);
          score += 5;
          continue;
        } else if(i == 10) {
          list.add(100);
          score += 5;
          continue;
        } else if(i == 15) {
          list.add(75);
          score += 5;
          continue;
        } else if(i == 20) {
          list.add(500);
          score += 5;
          continue;
        } else if(i == 21) {
          list.add(1000);
          score += 5;
          continue;
        } else {
          list.add(score);
          score += 5;
        }
      }
      
      int jump = 0;
      for(int i = 0; i < n; i++) {
        if(isFinished) break;
        jump += arr[i];
        if(jump >= 21) {
          jump = 21;
          isFinished = true;
        }
        System.out.print(list.get(jump) + " ");
      }
      
    }
}