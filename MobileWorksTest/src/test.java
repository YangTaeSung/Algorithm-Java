import java.io.*;
import java.util.*;

public class test {
	
	static int[] dirX = {0,1,0,-1};
	static int[] dirY = {-1,0,1,0};
	static int[][] arr; // way
	static int[] present = {0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // Array's size
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
			// Way T/F
			}
		}
		
		dfs(n);
	
	}
	
	public static void dfs(int n) {
		if(present[0] == n && present[1] == n) {
			return;
		}
		
		
	}
}
