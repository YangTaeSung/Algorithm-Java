/*
 * 
 * Programmers - 스택_주식가격 
 * 문제가 거지같아 그냥 그런갑다 해. 
 *
 */

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length]; // 배열은 크기가 정해져있다. 설정해줘야해
        
        for(int i = 0; i < prices.length; i++) {
            int second = 1;
            for(int j = i+1; j < prices.length-1; j++) {
                if(prices[i] <= prices[j]) second++;
                else break;
            }
            answer[i] = second;
        }
        
        answer[prices.length-1] = 0;
        answer[prices.length-2] = 1;
        
        return answer;
    }
}