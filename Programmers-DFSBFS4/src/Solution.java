/*
 * 
 * Programmers - DFSBFS4
 * 여행경로 
 * Collections.sort(ArrayList or Array)
 * answer = list.get(0).split(",") - list.get(0)이 String이고 String을 "," 기준으로 쪼개서 배열 answer에 넣어라
 * route = route.substring(0,route.length()-4) - String인 route를 시작(0)부터 끝에서 4번째까지 잘라라 
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    private static boolean[] check;
    private static List<String> list = new ArrayList<>();
    private static String route;
    
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        check = new boolean[tickets.length];
        route = "ICN,";
        
        dfs("ICN", tickets, 0);
        
        Collections.sort(list); // Collections.sort ( java.util.Collections )
        System.out.println(list);
        answer = list.get(0).split(","); // split
        
        return answer;
    }
    
    public void dfs(String start, String[][] tickets, int count) {
        
        if(count==tickets.length) {
            list.add(route);
        }
        
        for(int i = 0; i < tickets.length; i++) {
            String depart = tickets[i][0];
            String destination = tickets[i][1];
            if(!check[i] && start.equals(depart)) {
                route += destination + ",";
                check[i] = true;
                dfs(destination, tickets, count + 1);
                check[i] = false;
                route = route.substring(0,route.length()-4); // String.substring(int x, int y)
            }
        }
    }
    
    public static void main(String[] args) {
    	
    	String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
    	Solution s = new Solution();
    	s.solution(tickets);
    }
}