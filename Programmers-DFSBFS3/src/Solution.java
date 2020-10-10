/*
 * 
 * Programmers - DFSBFS3
 * 단어 변환 
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    private static List<Integer> answers = new ArrayList<>();
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] check = new boolean[words.length];
        for(int i = 0; i < words.length; i++) {
            check[i] = false;
        }
        
        bfs(begin, target, words, check, answer);
        
        int min = 0;
        if(answers.size()>0) min = Collections.min(answers);
        System.out.println(min);
        
        return min;
    }
    
    public void bfs(String begin, String target, String[] words, boolean[] check, int answer) {
        answer++;
        if(target == begin) {
            answers.add(answer);
        }
        int diffWord = 0;
        // 한 글자씩 비교
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(!check[i]) {
                // 글자가 한 글자 다른지 체크
                for(int j = 0; j < begin.length(); j++) {
                    if(begin.charAt(j)!=word.charAt(j)) {
                        diffWord++;
                    }
                    if(diffWord >= 2) break;
                }
            
                if(diffWord == 1) {
                    diffWord = 0;
                    check[i] = true;
                    bfs(word, target, words, check, answer);
                }
            }
        }
        answer--;
    }
}