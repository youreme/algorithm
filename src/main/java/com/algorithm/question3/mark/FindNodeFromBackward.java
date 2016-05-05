package com.algorithm.question3.mark;

import com.algorithm.question2.mark.Node;

public class FindNodeFromBackward {

	public Node findNodeFromBackward(Node head, int i) {
		if(head == null) {
			return null;
		}
		
		Node before = head;
		Node after = head;
		int num = 1;
		
		// after를 i값 만 더 앞에 둔다.
		while(num < i) {
			if(after.next != null ) {
				after = after.next;
				num++;
			} else {
				// i 값이 linkedList의 length보다 긴 경우
				return null;
			}
		}
		
		while(after.next != null) {
			before = before.next;
			after = after.next;
		}
		
		return before;
	}

}
