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
    public ListNode oddEvenList(ListNode head) {
        ListNode currentEven = new ListNode();
        ListNode currentOdd = new ListNode();
        ListNode headEven= null;
        ListNode headOdd= null;
        int counter=1;
        while(head != null)
        {   ListNode newNode= new ListNode();
            newNode.val = head.val;
            if(counter%2!=0) // odd
            {

                if(headOdd == null )
                    {

                        headOdd =newNode;
                        currentOdd=headOdd;

                    }
                else
                    {
                        currentOdd.next=newNode;
                         currentOdd = newNode;
                    }
            }
            else // even
            {
                 if(headEven == null )
                    {
                        headEven =newNode;
                        currentEven=headEven;
                    }
                else
                    {
                         currentEven.next=newNode;
                         currentEven = newNode;
                    }
            }
            head = head.next;
            counter++;

        }

        currentOdd.next=headEven;
        return headOdd;
    }
}