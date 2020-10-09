/*
 * 
 * Programmers - 완전탐색
 * 카펫
 * 
 */
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

class Solution {
    
    private boolean flag = false;
    
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Integer> arr = new ArrayList<>(); 
        
        for(int i = 1; i <= Math.sqrt(yellow); i++) {
            for(int j = 1; j <= yellow; j++) {
                if(i * j == yellow) {
                    getResult(i, j, brown, answer);
                    if(flag) return answer;
                }
            }
        }
        return answer;
    }
    
    public void getResult(int horizon, int vertical, int brown, int[] answer) {
        int formula = (horizon + 2) * 2 + (vertical*2);
        if(formula == brown) {
                answer[0] = vertical + 2;
                answer[1] = horizon + 2;
        }
    }
}