/*
 * 
 * 해결 안됨 
 * 
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  
  private static int[] map= {
    0,5,10,15,20,50,
    30,35,40,45,100,
    55,60,65,70,75,
    80,85,90,95,500,1000,
    275,250,300,150,175,
    150,125,0,350,400
  };
  
  private static int[][] moving;
  private static int[][] temp = {
    {5,22,23,24,25,26},
    {10,27,28,24,30,31},
    {22,23,24,25,26,15},
    {23,24,25,26,15,16},
    {24,30,31,20,21,21},
    {25,26,15,16,17,18},
    {26,15,16,17,18,19},
    {27,28,24,30,31,20},
    {28,24,30,31,20,21},
    {30,31,20,21,21,21},
    {31,20,21,21,21,21}
  };
  private static int[] current = {0,0,0,0};
  private static int[][] cercum;
  private static int score = 0;
  private static int[] playerScore = {0,0,0,0};
  private static boolean[] isFinished = {false,false,false,false};
  private static List<Integer> scoreResult;
  
    public static void main(String[] args){
      
      moving = new int[32][6];
      for(int i = 0; i < 11; i++) {
        for(int j = 1; j < 6; j++) {
          moving[temp[i][0]][j] = temp[i][j];
        }
      }
      
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      
      cercum = new int[n][10];
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < 10; j++)
        cercum[i][j] = scanner.nextInt();
      }
      
      Main m = new Main();
      for(int i = 0; i < n; i++) {
        scoreResult = new ArrayList<>();
        int repeatCount = 0;
        m.getResult(i, 0 /*player number*/, repeatCount);
        int max = 0;
        for(int result : scoreResult) {
          if(max < result) max = result;
        }
        System.out.println("#" + (i+1) + " " + max);
        
        for(int j = 0; j < 4; j++) { // initialization
          current[j] = 0;
          playerScore[j] = 0;
          isFinished[j] = false;
        }
      }
    }
    
    public void getResult(int repeat, int playerNum, int repeatCount) {
      
      if(isFinished[playerNum]) return;
      if(repeatCount == 10) {
        int result = 0;
        for(int i = 0; i < 4; i++) {
          result += map[current[i]];
        }
        scoreResult.add(result);
        return;
      }
      
      int beforeCurrent = current[playerNum];
      int plusCurrent = cercum[repeat][repeatCount];
      
      boolean isMoving = false;
      for(int i = 0; i < 11; i++) {
        if(current[playerNum] == temp[i][0]) {
          isMoving = true;
          break;
        }
      }
      
      if(isMoving) {
        current[playerNum] = moving[current[playerNum]][cercum[repeat][repeatCount]];
      } else {
        current[playerNum] += plusCurrent;
        
        if(current[playerNum] >= 21) {
          current[playerNum] = 21;
          isFinished[playerNum] = true;  
        }
      }
      
      for(int i = 0; i < 4; i++) {
        if(i != playerNum && current[playerNum] == current[i] && !isFinished[i]) {
          current[playerNum] = beforeCurrent;
          return;
        }
      }
      
      getResult(repeat, 0, repeatCount + 1);
      getResult(repeat, 1, repeatCount + 1);
      getResult(repeat, 2, repeatCount + 1);
      getResult(repeat, 3, repeatCount + 1);
      
    }
}