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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dup1 = l1 ;
       ListNode dup2 = l2 ;
       
        ListNode ans1 = new ListNode() ;
        ListNode ref = ans1 ;
        
        int carry = 0 ;
        while(dup1 != null && dup2 != null){
            int value = dup1.val + dup2.val + carry;
            
            if(value > 9){
                carry = value / 10 ;
            }
            else carry = 0 ;
            ListNode newnode= new ListNode(value % 10) ;
            ref.next = newnode ;
            ref = ref.next ;
            
            dup1 = dup1.next ;
            dup2 = dup2.next ;
        }
        
        while(dup1 != null){
            int value = dup1.val + carry;
            
            if(value > 9){
                carry = value / 10 ;
            }
            else carry = 0 ;
            ListNode newnode= new ListNode(value % 10) ;
            ref.next = newnode ;
            ref = ref.next ;
            
            dup1 = dup1.next ;
        }
        
        while(dup2 != null){
           int value = dup2.val + carry;
            
            if(value > 9){
                carry = value / 10 ;
            }
            else carry = 0 ;
            ListNode newnode= new ListNode(value % 10) ;
            ref.next = newnode ;
            ref = ref.next ; 
            
            dup2 = dup2.next ;
        }
        
        if(carry > 0){
            ListNode newnode= new ListNode(carry) ;
            ref.next = newnode ;
            ref = ref.next ;
        }
        
        return ans1.next ;
    }
}