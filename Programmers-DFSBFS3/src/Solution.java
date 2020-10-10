/*
 * 
 * Programmers - DFSBFS3
 * 단어 변환 
 * return answer == 51 ? 0 : answer; // return 할 때
 * answer = (answer > count) ? count : answer; // 할당할 때 
 * return count == 1 ? true : false; // return 할 때 
 * 
 */
class Solution {
    int answer;
    boolean[] check;
    
    public int solution(String begin, String target, String[] words) {
        
        check = new boolean[words.length]; // false로 초기화
        int count = 0;
        answer = 51; // answer의 max값을 정해줘야 카운트랑 비교해서 더 작은게 answer로 들어갈 수 있어. words가 최대 50개니까 한 번씩 다 변환해도 50이 최대야
        
        dfs(begin, target, words, 0);
        
        return answer == 51 ? 0 : answer; // answer가 51이면 타겟과 같은 단어가 없는거
    }
    
    public void dfs(String presentWord, String target, String[] words, int count) {
        if(presentWord.equals(target)) {
            answer = (answer > count) ? count : answer;
        }
        
        for(int i = 0; i < words.length; i++) {
            if(!check[i] && wordOne(presentWord,words[i])) { // 단어가 한 개만 다른지 검사하고 이미 했던건지 검사하고 안한거면 체크 해주고 카운트 1 증가해서 현재 단어로 dfs 재귀
                check[i] = true;
                dfs(words[i], target, words, count+1);
                check[i] = false;
            }
        }
    }
    
    // 단어가 한 개만 다른지 검사
    public boolean wordOne(String presentWord, String compare) {
        int count = 0;
        for(int i = 0; i < presentWord.length(); i++) {
            if(presentWord.charAt(i) != compare.charAt(i)) {
                count++;
            }
        }
        return count == 1 ? true : false;
    }
}