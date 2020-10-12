import java.util.Scanner;

public class Solution{
    public static void main(String[] args){

      int[][] route = {{0,5,10,15,20,50,
                      30,35,40,55,100,
                      55,60,65,70,75,
                      80,85,90,95,500,1000},
                      {50,275,250,300,150,175,75,80,85,90,95,500,1000},
                      {100,150,125,300,350,400,500,1000},
                      {300,350,400,500,1000}};
      //int[] route2 = {50,275,250,300,150,175,75,80,85,90,95,500,1000};
      //int[] route3 = {100,150,125,300,350,400,500,1000};
      //int[] route4 = {300,350,400,500,1000};
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int current = 0;
      int currentRoute = 0;
      
      for(int i = 0; i < n; i++) {
        if(currentRoute == 0 && current == 5) {
          currentRoute = 1;
          current = 0;
        }
        if(currentRoute == 0 && current == 10) {
          currentRoute = 2;
          current = 0;
        } 
        if(currentRoute == 1 && current == 3) {
          currentRoute = 3;
          current = 0;
        } 
        
        int m = scanner.nextInt();
        current += m;
          
        if(current > route[currentRoute].length-1) current = route[currentRoute].length -1;
        System.out.print(route[currentRoute][current] + " ");
        if(current == route[currentRoute].length-1) break;
        
        }
    }
}