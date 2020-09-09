import java.util.*;
/*
 * 
 * - Map, HashMap
 * 
 * 
 * 
 */
public class Solution {
	public String solution(String participant[], String completion[]) {
		String answer = "";
		int val = 0;
		
		Map<String, Integer> hm = new HashMap<>();
		
		// participant의 값을 차례로 가져와서 part에 넣어라
		for(String part : participant) {
			// hm이 비어있으면 <part,1>을 넣어라
			if(hm.get(part) == null) {
				hm.put(part,1);
			}
			// hm이 비어있지 않으면 인데 필요없을 듯 
			else {	
				val = hm.get(part) + 1;
				hm.put(part, val);
			}
			
			System.out.println(hm);
		}
		
		// comp가 part랑 겹치면 value를 0으로 바꿔 
		for(String comp : completion) {
			
			val = hm.get(comp) - 1;
			hm.put(comp,val);
			
			System.out.println(hm);
		}
		
		// value가 1인거 찾기 
		for(String key : hm.keySet()) {
			
			if(hm.get(key) == 1) answer = key;
			
		}
		
		
		return answer;
	}
	

}
