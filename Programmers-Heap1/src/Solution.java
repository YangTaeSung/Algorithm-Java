import java.util.PriorityQueue;

public class Solution {
	public int solution(int[] scoville, int K) {
        int answer = -1;
        int result = 0;
        int iter = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i : scoville) {
        	heap.offer(i);
        }
        
        while(heap.size() > 1) {
        	int a = heap.poll();
        	int b = heap.poll();
        	result = a + b*2;
        	
        	heap.offer(result);
        	
        	if(result > K) {
        		answer = iter;
        		break;
        	}
        	iter++;
        }
        
        return answer;
    }
}
