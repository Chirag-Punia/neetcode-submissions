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
        ListNode temp = new ListNode(-1);
        ListNode ans = temp;
        ListNode list1_iterator = list1;
        ListNode list2_iterator = list2;
        while(list1_iterator != null && list2_iterator != null){
            if(list1_iterator.val >= list2_iterator.val){
                temp.next = list2_iterator;
                list2_iterator = list2_iterator.next;
            }
            else{
                temp.next = list1_iterator;
                list1_iterator = list1_iterator.next;
            }
            temp = temp.next;
        }
        if(list1_iterator != null){
            temp.next = list1_iterator;
        }
        if(list2_iterator != null){
            temp.next = list2_iterator;
        }
        return ans.next;
    }
}