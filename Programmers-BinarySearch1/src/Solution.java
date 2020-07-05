import java.util.Arrays;

public class Solution {
	public int solution(int[] budgets, int M) {
        int answer = 0;
        
        Arrays.sort(budgets);
        /*
         * left값을 0으로 잡지 않고 budgets 내에서 가장 작은 값으로 잡은 결과 테스트 하나 오류뜸
         * left는 0으로 잡기! 
         */
        // int left = budgets[0];
        int left = 0;
        int right = budgets[budgets.length-1];
        int mid = 0;
        int preMid = 0;
        long sum = 0; // 요청한 금액이 총액의 최댓값을 넘길 수 있으므로 long으로 선언(효율성2번 문제 해결)
        
        for(int budget : budgets) {
        	sum += budget;
        }
        if(sum <= M) return budgets[budgets.length-1]; // sum이 M보다 작거나 같을경우 그대로 리턴 
        
        /*
        *
        * 나는 while문을 돌릴 때 조건을 left <= right 로 했는데 값이 정답과 다르게 출력됨.
        * 또한 시간도 10초 이상걸림.
        * 조건을 true로 바꾸고 loop의 제동을 중간값 변동여부로 걸어둠.
        * 속도 및 결과 모두 충족  
        * 
        */
        while(true) {
        	sum = 0;
        	mid = (left + right)/2;
        	
        	if(preMid==mid){ // 중간값 변동이 없다면 종료
        		answer=mid;
                break;
            }
        	
        	for(int budget : budgets) {
        		if(budget < mid) sum += budget;
        		else sum += mid;
        	}
        	
        	/*
        	 * right와 left값을 재설정할 때 right or left = (mid +- 1)로 하던지 그냥 right or left = (mid)로하던지 상관없음
        	 */
        	if(sum > M) right = mid - 1; // right = mid 로 해도 무방 
        	else left = mid + 1; // left = mid 로 해도 무방 
        	preMid = mid;
        }
        
        return answer;
    }
}
