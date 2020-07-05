import java.util.Arrays;

public class Solution {
	public int solution(int[] budgets, int M) {
        int answer = 0;
        
        Arrays.sort(budgets);
        int left = budgets[0];
        int right = budgets[budgets.length-1];
        int mid = 0;
        long sum = 0; // 요청한 금액이 총액의 최댓값을 넘길 수 있으므로 long으로 선언(효율성2번 문제 해결)
        
        for(int budget : budgets) {
        	sum += budget;
        }
        if(sum <= M) return budgets[budgets.length-1]; // sum이 M보다 작거나 같을경우 그대로 리턴 
        
        while(left <= right) {
        	mid = (left + right)/2;
        	
        	for(int budget : budgets) {
        		if(budget < mid) {
        			sum += budget;
        		} else {
        			sum += mid;
        		}
        	}
        	
        	if(left == right) break;
        	
        	if(sum > M) {
        		sum = 0;
        		right = mid - 1;
        	} else if(sum < M){
        		sum = 0;
        		left = mid + 1;
        	} else {
        		break;
        	}
        }
        
        answer = mid;
        
        return answer;
    }
}
