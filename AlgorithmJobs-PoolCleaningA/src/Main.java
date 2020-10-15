import java.util.Scanner;
public class Main{
  private static int k;
  private static int n;
  private static int arr[];
  private static String result;
  private static boolean isFinished;
  private static int count = 0;
  
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      n = scanner.nextInt();
      arr = new int[n];
      k = scanner.nextInt();
      
      Main m = new Main();
      m.rotation(0);
    }
    
    public void rotation(int index) {
        if(isFinished) return;
        
        if(index >= n) {
          count++;
          if(count == k) {
            isFinished = true;
            for(int i = 0; i < n; i++) {
              System.out.print(arr[i] + " ");
            }
          }
        } else {
          for(int i = 0; i <= 270; i+=90) {
            arr[index] = i;
            rotation(index + 1);
          }
        }
    }
}