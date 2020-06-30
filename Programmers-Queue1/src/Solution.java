/* 구현 실패, 수정 요망 */

import java.util.*;

public class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int total_weight = 0;
        int time = 0;
        
        Queue<Truck> waitings = new LinkedList<>();
        Queue<Truck> onBridge = new LinkedList<>();
        
        for(int i = 0; i < truck_weights.length; i++) {
        	Truck truck = new Truck(bridge_length,truck_weights[i]);
        	waitings.offer(truck);
        }
        
        total_weight += waitings.peek().weight;
        onBridge.offer(waitings.poll());
        
        while(!onBridge.isEmpty()) {
        	for(Truck truck : onBridge) {
        		truck.time--;
        	}
        	
        	if(onBridge.peek().time < 0) {
        		total_weight -= onBridge.poll().weight;
        	}
        	
        	if(!waitings.isEmpty() && total_weight + waitings.peek().weight <= weight) {
        		total_weight += waitings.peek().weight;
        		onBridge.offer(waitings.poll());
        	}
        	        	
        	time++;
        	/*
        	if(waitings.isEmpty() && onBridge.size() == 1) {
        		break;
        	}*/
        }
        
        return time + 1;
    }

}

class Truck {
	int time;
	int weight;
	
	public Truck(int time, int weight) {
		this.time = time;
		this.weight = weight;
	}
}
