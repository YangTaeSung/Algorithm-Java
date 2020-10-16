import java.util.Scanner;
public class Main{
  
  private static int[][] map;
  private static int[][] temp;
  private static int valNum;  //상 우 하 좌 
  private static int[] dirY = {-1,0,1,0}; // 상으로 쏘기 (dirY[0],dirX[0]) 상 -> y = -1만큼, x = 그대로 
  private static int[] dirX = {0,1,0,-1};
  private static int[][] dir = {
   //상 우하 좌
    {0,0,0,0},
    {1,0,0,0}, // 1번 수도꼭지
    {1,0,1,0}, // 2번 수도꼭지
    {1,1,0,0},
    {1,1,0,1},
    {1,1,1,1}
  };
  
  private static int[] rotates = new int[15];
  private static int v; // vertical
  private static int h; // horizontal
  private static int openingValue;
  private static int result;
  private static int zeroCnt;
  
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    
    Main m = new Main();
    
    for(int i = 0; i < n; i++) {
      valNum = 0;
      result = 0;
      zeroCnt = 0;
      
      v = scanner.nextInt(); // vertical
      h = scanner.nextInt(); // horizontal
      map = new int[v][h];
      temp = new int[v][h];
      
      for(int j = 0; j < v; j++) {
        for(int k = 0; k < h; k++) {
          map[j][k] = scanner.nextInt();
          
          if(map[j][k] >= 1 && map[j][k] < 6) {
            valNum++;
          }
          
          if(map[j][k] == 0) zeroCnt++;
        }
      }
      
      m.getResult(0);
      System.out.println("#" + (i+1) + " " + (zeroCnt-result));
    }
  }
  
  public void getResult(int idx) {
    
    if(idx >= valNum) {
      int myValueIndex = 0;
      openingValue = 0;
      
      for(int i = 0; i < v; i++) {
        for(int j = 0; j < h; j++) {
          temp[i][j] = map[i][j];
        }
      }
      
      for(int i = 0; i < v; i++) {
        for(int j = 0; j < h; j++) {
          if(map[i][j] >= 1 && map[i][j] < 6) {
            opening(i,j,rotates[myValueIndex]);
            myValueIndex++;
          }
        }
      }
      
      for(int i = 0; i < v; i++) {
        for(int j = 0; j < h; j++) {
        map[i][j] = temp[i][j];
        }
      }
      
      if(openingValue > result) result = openingValue;
      
    } else {
      for(int i = 0; i < 4; i++) { // 상하좌우 회전 4방향씩
       rotates[idx] = i;
       getResult(idx + 1);
      }
    }
    
    
  }
  
  public void opening(int y, int x, int rotate) {
    int valueIndex = map[y][x];
    int[] myDir = new int[4];
    
    for(int i = 0; i < 4; i++) myDir[i] = dir[valueIndex][i];
    
    for(int i = 0; i < rotate; i++) {
      int temp = myDir[3];
      for(int j = 3; j >= 1; j--) myDir[j] = myDir[j-1];
      myDir[0] = temp;
    }
    
    for(int i = 0; i < 4; i++) {
      if(myDir[i] == 1) {
        int curY = y;
        int curX = x;
        
        while(true) {
          curY = curY + dirY[i];
          curX = curX + dirX[i];
          
          if(!(curX >= 0 && curX < h && curY >= 0 && curY < v)) break; // 범위 밖이면 break
          
          if(map[curY][curX] == 0) {
            openingValue++;
            map[curY][curX] = 8; // 물 쏜거는 8로 업데이트
          } else if(map[curY][curX] == 6) break; // 장애물이면 break;
        }
      }
    }
  }
}