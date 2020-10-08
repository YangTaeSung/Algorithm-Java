/*
 * 
 * Programmers - 완전탐색
 * 소수찾기
 * 
 */
import java.util.*;

class Solution {
    
    private static int answer = 0;
    // private static List<Integer> result = new ArrayList<>();
    // List로 하면 중복된 원소가 추가돼. HashSet은 중복된 원소 추가 허용 안됨.
    private static HashSet<Integer> result = new HashSet<>();
    
    public int solution(String numbers) {
        List<Character> arr = new ArrayList<>();
        
        for(int i = 0; i < numbers.length(); i++) { // 한 글자씩 리스트에 담기 
            arr.add(numbers.charAt(i));
        } // char[] arr = numbers.toCharArray(); 배열에 담을 때
        
        for(int i = 0; i < arr.size(); i++) { // nPr(순열) r을 증가시키면서
            permutation(arr, 0, arr.size() /*n*/, i + 1 /*r*/);
        }
        
        answer = result.size();
        return answer;
    }
    
    public void permutation(List<Character> arr, int depth, int n, int r) {
        if(depth == r) {
            String str = "";
            for(int i = 0; i < r; i++) {
                str += arr.get(i) + "";
            }
            isPrime(str);
            return;
        }
        
        for(int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }
    
    public void isPrime(String str) {
        if(str.charAt(0) == 0) return;
        int n = Integer.parseInt(str);
        
        if(n == 1) return;
        if(n % 2 == 0) return;
        for(int i = 3; i<Math.sqrt(n); i+=2) {
            if(n % i == 0) {
                return;
            }
        }
        
        result.add(n);
        return;
    }
    
    public void swap(List<Character> arr, int depth, int i) {
        Character temp = arr.get(depth);
        arr.set(depth, arr.get(i));
        arr.set(i,temp);
    }
}
