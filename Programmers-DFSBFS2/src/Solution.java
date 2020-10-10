/*
 * 
 * Programmers - DFSBFS
 * 네트워크
 * 함수 호출해서 참조변수로 넘겨줄 때(check를 dfs로 넘겨줌) 함수 내에서 내용 변경하면 호출 전 함수에도 적용되서 변경됨 
 * (dfs에서 check를 바꿨고 return같은거 따로 안해줬지만 solution 함수 내에서도 바뀌어서 적용되어있음)
 * 
 */
class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] check = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            check[i] = false;
        }
        
        for(int i = 0; i < n; i++) {
            if(!check[i]) {
                dfs(check, i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    // check를 넘겨주고 여기서 check 바꿔도 solution 함수 내에서도 적용됨
    public void dfs(boolean[] check, int i, int[][] computers) {
        check[i] = true;
        
        for(int j = 0; j < computers.length; j++) {
            if(i != j && computers[i][j]==1 && !check[j]) {
                dfs(check, j, computers);
            }
        }
    }
}