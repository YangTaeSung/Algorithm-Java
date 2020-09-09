import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * BFS 활용 - 최단경로 찾을 때 사용
 * - 2차원 배열 
 * - 큐 
 */

public class Solution {
	public int solution(int n, int[][] edge) {
        int answer = 0;
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < edge.length; i++) {
        	list.add(new ArrayList<Integer>());
        }
        
        int a, b = 0;
        
        for(int[] node: edge) {
        	a = node[0];
        	b = node[1];
        	
        	list.get(a).add(b);
        	list.get(b).add(a);
        }
        
        int[] count = new int[n+1];
        boolean[] visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        visited[0] = visited[1] = true;
        
        while(!q.isEmpty()) {
        	int now = q.poll();
        	for(int v : list.get(now)) {
        		if(!visited[v]) {
        			count[v] = count[now] + 1;
        			visited[v] = true;
        			q.add(v);
        		}
        	}
        }
        
        int max = 0;
        
        for(int cnt : count) {
        	if(cnt > max) {
        		max = cnt;
        		answer = 1;
        	} else if(cnt == max) {
        		answer++;
        	}
        }
        
        return answer;
    }
}
