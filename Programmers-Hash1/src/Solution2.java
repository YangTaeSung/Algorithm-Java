import java.util.*;

public class Solution2 {
	
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		
		for(i = 0; i < participant.length; i++) {
			if(!participant[i].equals(completion[i])) {
				break;
			}
		}
		return participant[i];
	}

}
