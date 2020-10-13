/*
 * 속도 문제로 결과 안나옴. 중복 검사 for문 지우면 정상 작동.
 * 
 */

import java.util.Scanner;

public class Main{
  
  private static int[][] map = {
    {0,5,10,15,20,50,
    30,35,40,45,100,
    55,60,65,70,75,
    80,85,90,95,500,1000},
    {50,275,250,300,150,175,75,80,85,90,95,500,1000},
    {100,150,125,300,350,400,500,1000},
    {300,350,400,500,1000}
  };
  private static int n;
  private static int[] list;
  private static int[] player;
  private static int[] current;
  private static int[] currentRoute;
  private static boolean[] isFinished;
  
    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);
      
      n = scanner.nextInt();
      isFinished = new boolean[4];
      list = new int[n];
      player = new int[n];
      for(int i = 0; i < n; i++) list[i] = scanner.nextInt();
      for(int i = 0; i < n; i++) player[i] = scanner.nextInt();
      
      current = new int[4];
      currentRoute = new int[4];
      for(int i = 0; i < 4; i++) {
        current[i] = 0;
        currentRoute[i] = 0;
      }
    
      Main m = new Main();
      m.getResult(n, list, player);
      
    }
    
    public void getResult(int n, int[] list, int[] player) {
      
      for(int i = 0; i < n; i++) {
        
        int presentList = list[i];
        int presentPlayer = player[i]-1;
        
        if(current[presentPlayer] + presentList >= map[currentRoute[presentPlayer]].length-1) {
          current[presentPlayer] = map[currentRoute[presentPlayer]].length - 1;
          isFinished[presentPlayer] = true;
        } else {
          current[presentPlayer] += presentList;
        }
      
        if(currentRoute[presentPlayer] == 0 & current[presentPlayer] == 5) {
          current[presentPlayer] = 0;
          currentRoute[presentPlayer] = 1;
        }
        if(currentRoute[presentPlayer] == 0 & current[presentPlayer] == 10) {
          current[presentPlayer] = 0;
          currentRoute[presentPlayer] = 2;
        }
        if(currentRoute[presentPlayer] == 1 & current[presentPlayer] == 3) {
          current[presentPlayer] = 0;
          currentRoute[presentPlayer] = 3;
        }
        
        if(isFinished[presentPlayer]) continue;
        
        for(int k = 0; k < 4; i++) { // 중복 검사 
          if(k != presentPlayer && map[currentRoute[presentPlayer]][current[presentPlayer]] == map[currentRoute[i]][current[i]]) {
              System.out.print(-1);
              return;
          }
        }
      }
      sum();
    }
    
    public void sum() {
      int result = 0;
      for(int i = 0; i < 4; i++) {
        result += map[currentRoute[i]][current[i]];
      }
      System.out.print(result);
    }
}