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
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>() ;
        
        ListNode dup = head ;
        
        while(dup != null){
            list.add(dup.val) ;
            dup = dup.next ;
        }
        
        dup = new ListNode() ;
        ListNode duphead = dup ;
        
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            ListNode nextnode  = new ListNode(list.get(i)) ;
            duphead.next = nextnode ;
            duphead = duphead.next ;
        }
        
        return dup.next ;
    }
}