//$Id$
package com.leet;

public class MergeSortedLinkedList {

	public static void main(String[] args) {
		
		ListNode head1 = new ListNode(1);
		ListNode n11 = new ListNode(2);
		ListNode n12 = new ListNode(3);
		head1.next = n11; head1.next.next = n12;
		
		ListNode head2 = new ListNode(1);
		ListNode n21 = new ListNode(3);
		ListNode n22 = new ListNode(5);
		head2.next = n21; head2.next.next = n22;
		
		ListNode fHead = mergeTwoLists(head1, head2);
		ListNode temp = fHead;
		while(temp != null) {
			System.out.print(temp.value);
			temp = temp.next;
		}
	}

	private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		
		ListNode dummy = new ListNode(0);
		ListNode node = dummy;
		
		while(list1 != null && list2 != null) {
			if(list1.value < list2.value) {
				node.next = list1;
				list1 = list1.next;
			}
			else {
				node.next = list2;
				list2 = list2.next;
			}
			node = node.next;
		}
        
		if(list1 != null){
			node.next = list1;
		}
		else {
			node.next = list2;
		}
		
		return dummy.next;
	}

}
