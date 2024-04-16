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
    public boolean isPalindrome(ListNode head) {
    ListNode prev = new ListNode();
    prev =null;
   ListNode curr = head;
   ListNode curr2= new ListNode(head.val);
   ListNode curr3=curr2;
   ListNode temp ;
   while(curr.next!=null)
   {
    curr=curr.next;
    curr2.next=new ListNode(curr.val);
    
    curr2=curr2.next;
    
    
   }
    while(curr3!=null)
    {

            temp = curr3.next;
            curr3.next=prev;
            prev=curr3;
            curr3=temp;

    }


        while(prev.next!=null && head.next!=null)
        {  

          
            if(prev.val != head.val)
             return false;
            prev=prev.next;
            head=head.next;

        }
        return true;
    }
}