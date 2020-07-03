
public class Solution {
	public int solution(int[] numbers, int target) {
        int answer = 0;
        int num = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private int dfs(int[] numbers, int node, int sum, int target){
        if(node == numbers.length){
            if(sum==target) {
                //num = num+1;
            	return 1;
            }
            return 0;
        }
        //System.out.println(num);
        return dfs(numbers, node+1, sum + numbers[node], target) 
        	 + dfs(numbers, node+1, sum - numbers[node], target);
    }
}
