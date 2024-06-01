/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
    ListNode temp = head;
    if(temp.next  == null)
        return null;
    int count =0;
    int index;
    while ( temp != null)
    {
        count++;
        temp=temp.next;
    }
    index = count/2;
    count =0;
     ListNode prev = head;
     temp=head.next;
     
    while(count<index-1)
    {   prev=temp;
        temp=temp.next;
        count++;
    }
    
    prev.next=temp.next;
    return head;

    }
}