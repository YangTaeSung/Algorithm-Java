public class Solution {
	
	int result = Integer.MAX_VALUE;
	int[] nnn;
	
	public int solution(int N, int number) {
	    result = -1;
	    nnn = new int[8];
	    for (int i = 0; i < 8; i++) {
	        nnn[i] = Integer.parseInt(Integer.toBinaryString((int) Math.pow(2, i + 1) - 1)) * N;

	    }
	    dfs(0, 0, number);
	    return result;   
	}
	
	public void dfs(int count, int num, int number) {
	    if (count > 8)
	        return;
	    if (num == number) {
	        if (count < result || result == -1) {
	            result = count;
	        }
	        return;
	    }

	    for (int i = 0; i < 8; i++) {
	        int NN = nnn[i]; // 5, 55, 555, 5555 ..
	        int countN = i + 1; // 1, 2, 3, 4 ....

	        // 0 +-*/ 5 -> ..... -> 0 +-*/ 55555555
	        // (0 + 5): 5 +-*/ 5 -> ..... -> 5 +-*/ 55555555
	        // (5 + 5): 10 +-*/ 5 -> ..... -> 10 +-*/ 55555555
	        // (5 / 5): 1 +-*/ 5 -> ..... -> 1 +-*/ 55555555
	        // ...........
	        dfs(count + countN, num + NN, number);
	        dfs(count + countN, num - NN, number);
	        dfs(count + countN, num * NN, number);
	        dfs(count + countN, num / NN, number);
	    }
	}
}
