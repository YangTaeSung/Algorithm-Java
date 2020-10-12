/*
 * 
 * AlgorithmJobs - 알파윷A 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution{
  
	private static boolean isFinished;
	private static int k;
	private static int[] arr;
  	private static int count = 0; // k가 몇 번째인지 기록
  
    public static void main(String[] args) throws IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	arr = new int[10];
    	k = Integer.parseInt(br.readLine());
        int index = 0;
        
        Solution s = new Solution();
        s.getResult(index, k);

    }
    
    public void getResult(int idx, int k) {
      if(isFinished) return; // 찾았으면 뒤에 작업 못하게 하려고. 들어오자마자 return되버림. 
      
      if(idx >= 10) {
        count++;
        if(count == k) {
          isFinished = true;
          for(int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
          }
        }
      } else {
        for(int i = 1; i <= 4; i++) { // ABCD가 하나씩 들어갈 수 있게
          arr[idx] = i;
          getResult(idx + 1, k);
        }
      }
    }
}