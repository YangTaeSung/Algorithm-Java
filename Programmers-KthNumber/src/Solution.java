import java.util.Arrays;

public class Solution {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp;
        
        for(int i=0; i < commands.length; i++) {
        	// copyOfRange : (배열, 시작, 끝) 으로 배열 나누기 
        	temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
}
