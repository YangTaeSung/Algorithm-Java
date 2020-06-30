import java.util.ArrayList;

public class Solution {
	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int aNum = 0, bNum = 0, cNum = 0;
        
        for(int i = 0; i < answers.length; i++) {
        	if(a[i%a.length]==answers[i]) aNum++;
        	if(b[i%b.length]==answers[i]) bNum++;
        	if(c[i%c.length]==answers[i]) cNum++;
        }
        
        int max = Math.max(Math.max(aNum, bNum),cNum);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(max == aNum) list.add(aNum);
        if(max == bNum) list.add(bNum);
        if(max == cNum) list.add(cNum);
        
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}
