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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2 ;
        }
        
        if(list2 == null){
            return list1 ;
        }
        
        ListNode head = new ListNode() ;
        ListNode next = head ;
        
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                 next.next = list1 ;
                 list1 = list1.next ;
                 next = next.next;
            }
            
            else {
                next.next = list2 ;
                next = next.next ;
                list2 = list2.next ;
                
            }
            
            
        }
        
        while(list1 != null){
           next.next = list1 ;
            next = next.next ;
            list1 = list1.next ;
        }
        
        while(list2 != null){
            next.next = list2 ;
            next = next.next ;
            list2 = list2.next ;
        }
        
        
        return head.next ;
    }
    
}