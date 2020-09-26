/*
 * Programmers - 힙_더 맵게 
 * 
 * PriorityQueue
 * - MinHeap 구조
 * Queue
 * - 사이즈가 가변적이다. 
 * - FIFO
 */
import java.util.PriorityQueue;

public class Solution {
	public int solution(int[] scoville, int K) {
        int answer = -1;
        int result = 0;
        int iter = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int i : scoville) {
        	heap.offer(i); // add data in queue
        }
        
        while(heap.size() > 1) {
        	int a = heap.poll(); // poll 할 때 숫자가 낮은 순서로 빠져나옴(PriorityQueue)
        	int b = heap.poll(); // poll은 빠져나오고 data 삭제, peak는 데이터 뽑기만
        	result = a + b*2;
        	
        	heap.offer(result);
        	
            iter++;
            
            int c = heap.peek();
            
        	if(c > K) {
        		answer = iter;
        		break;
        	}
        }
        
        return answer;
    }
}
