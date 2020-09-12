/*
 * Kakao tech 20200701 Question1
 * - new int 조심!(배열선언)
 */

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] preNumLeft = new int[2];
        preNumLeft = new int[]{3,0};
        int[] preNumRight = {3,2};
        int[] presentNum = {0};
        
        for(int num : numbers) {
            switch(num) {
                case 1: presentNum = new int[]{0,0};
                break;
                case 2: presentNum = new int[]{0,1};
                break;
                case 3: presentNum = new int[]{0,2};
                break;
                case 4: presentNum = new int[]{1,0};
                break;
                case 5: presentNum = new int[]{1,1};
                break;
                case 6: presentNum = new int[]{1,2};
                break;
                case 7: presentNum = new int[]{2,0};
                break;
                case 8: presentNum = new int[]{2,1};
                break;
                case 9: presentNum = new int[]{2,2};
                break;
                case 0: presentNum = new int[]{3,1};
                break;
            }
            if(num == 0) {
            	if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) == (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))) {
                    if(hand.equals("left")) {
                        preNumLeft = new int[]{3,1};
                        answer += "L";
                    }
                    else {
                        preNumRight = new int[]{3,1};
                        answer += "R";
                    }
                } else if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) < (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))){
                    preNumLeft = new int[]{3,1};
                    answer += "L";
                } else {
                    preNumRight = new int[]{3,1};
                    answer += "R";
                }
            } else if(num == 1) {
                preNumLeft = new int[]{0,0};
                answer += "L";
            } else if (num == 4) {
                preNumLeft = new int[]{1,0};
                answer += "L";
            } else if (num == 7) {
                preNumLeft = new int[]{2,0};
                answer += "L";
            } else if (num == 3) {
                preNumRight = new int[]{0,2};
                answer += "R";
            } else if (num == 6) {
                preNumRight = new int[]{1,2};
                answer += "R";
            } else if (num == 9) {
                preNumRight = new int[]{2,2};
                answer += "R";
            } else if (num == 2) {
            	if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) == (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))) {
                    if(hand.equals("left")) {
                        preNumLeft = new int[]{0,1};
                        answer += "L";
                    }
                    else {
                        preNumRight = new int[]{0,1};
                        answer += "R";
                    }
                } else if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) < (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))){
                    preNumLeft = new int[]{0,1};
                    answer += "L";
                } else {
                    preNumRight = new int[]{0,1};
                    answer += "R";
                }
            } else if (num == 5) {
            	if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) == (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))) {
                    if(hand.equals("left")) {
                        preNumLeft = new int[]{1,1};
                        answer += "L";
                    }
                    else {
                        preNumRight = new int[]{1,1};
                        answer += "R";
                    }
                } else if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) < (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))){
                    preNumLeft = new int[]{1,1};
                    answer += "L";
                } else {
                    preNumRight = new int[]{1,1};
                    answer += "R";
                }
            } else {
            	if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) == (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))) {
                    if(hand.equals("left")) {
                        preNumLeft = new int[]{2,1};
                        answer += "L";
                    }
                    else {
                        preNumRight = new int[]{2,1};
                        answer += "R";
                    }
                } else if((Math.abs(preNumLeft[0] - presentNum[0]) + Math.abs(preNumLeft[1] - presentNum[1])) < (Math.abs(preNumRight[0] - presentNum[0]) + Math.abs(preNumRight[1] - presentNum[1]))){
                    preNumLeft = new int[]{2,1};
                    answer += "L";
                } else {
                    preNumRight = new int[]{2,1};
                    answer += "R";
                }
            
            }
        }
        return answer;
    }
    
}