/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        HashSet<ListNode>set=new HashSet<>();
        while(p1!=null)
        {
            set.add(p1);
            p1=p1.next;
        }
        while(p2!=null)
        {
            if(set.contains(p2))
            return p2;
            p2=p2.next;
        }
      /*  while(p1!=p2)
        {
            if(p1==null)
            {
                p1=headB;
            }
            p1=p1.next;
            if(p2==null)
            {
                p2=headA;
            }
            p2=p2.next;
        }
        return p1;*/
        return p2;
    }
}