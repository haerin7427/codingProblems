package grind75;

// https://leetcode.com/problems/merge-two-sorted-lists/
// title : 21. Merge Two Sorted Lists
// time : 10m
// Create by haerin on 2023/01/02

public class week1No3 {
    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode result = new ListNode();
            ListNode temp = result;

            while(list1 != null && list2 != null) {
                if(list1.val > list2.val) {
                    temp.next = list2;
                    list2 = list2.next;
                }else {
                    temp.next = list1;
                    list1 = list1.next;
                }
                temp = temp.next;
            }
            temp.next = list1 == null ? list2 : list1;
            return result.next;
            
        }
    }
}