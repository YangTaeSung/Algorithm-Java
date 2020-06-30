
public class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        int increase = 0;
        
        for(int i = 0; i < reserve.length; i++) {
        	for(int j = 0; j < lost.length; j++) {
        		if(lost[j]!=10) {
	        		if(reserve[i] == lost[j] || reserve[i]+1 == lost[j] || reserve[i]-1 == lost[j]) {
	        			increase++;
	        			lost[j] = -10; // Flag를 주고 이미 빌려준 사람은 -10으로 처리 
	        			break;
	        		}
        		}
        	}
        	if(increase == lost.length) break; // lost의 수만큼 빌려주었으면 더이상 반복을 진행하지 않음
        }
        
        answer += increase;
        return answer;
    }
}
