//$Id$
package com.leet;

import java.util.HashSet;

public class LinekedListHasCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		
		head.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l2;

		hasCycle(head);
		int i=0;
	}
	
	public static boolean hasCycle(ListNode head) {
        
		ListNode slow = head, fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				return true;
			}
		}
		return false;
    }

}
