/*
 * 프로그래머스
 * 해시 : 전화번호 목록
 *
 * indexOf() : 찾는 문자나 문자열의 인덱스값 반환, 못찾으면 -1 반환 
 * startsWith() : 해당 문자열로 시작하는지(T/F)
 * endWith() : 해당 문자열로 끝나는지 (T/F)
 * continue : continue를 만나면 해당 반복을 재끼고 다음 반복으로 넘어간다.
 * 
 * + 접두어인 경우가 있는지를 검사하는 거라서 startsWith() 사용 가능 
 */
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book.length; j++) {
                if(i==j) continue;
                if(phone_book[i].indexOf(phone_book[j]) == 0) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}