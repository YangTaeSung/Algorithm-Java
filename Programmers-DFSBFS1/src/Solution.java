
public class Solution {
	/* 50 ~ 52mb */
	static int answer = 0;
	public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0);
        return answer;
    }
    
    private void dfs(int[] numbers, int target, int index){
        if(index == numbers.length){
        	int sum = 0;
        	for(int num : numbers) {
        		sum += num;
        	}
            if(sum==target) {
            	answer++;
            }
        } else {
        	numbers[index] *= 1;
        	dfs(numbers, target, index+1);
        	numbers[index] *= -1;
        	dfs(numbers, target, index+1);
        }
    }
    /*
     * 50 ~ 52mb
     * 
    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private int dfs(int[] numbers, int node, int sum, int target){
        if(node == numbers.length){
            if(sum==target)
                return 1; // 재귀할 때 리턴이 누적되는 듯 
            return 0;
        }
        return dfs(numbers, node+1, sum + numbers[node], target) 
        	 + dfs(numbers, node+1, sum - numbers[node], target);
    }
    */
    
}
