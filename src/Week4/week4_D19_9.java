package Week4;

// https://leetcode.com/problems/insertion-sort-list/
// time: 40m
// Create by haerin on 2021/0902

public class week4_D19_9{

    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode insertionSortList(ListNode head) {
        
        if (head == null)
            return head;
        
        ListNode helper = new ListNode(0); //new starter of the sorted list
		ListNode cur = head; //the node will be inserted
		ListNode pre = helper; //insert node between pre and pre.next

        
        //not the end of input list
		while( cur != null ){
			ListNode next = cur.next;
            
			//find the right place to insert
			while( pre.next != null && pre.next.val < cur.val ){
				pre = pre.next;
			}
            
			//insert between pre and pre.next 
			cur.next = pre.next;
			pre.next = cur; 
            
            //prepare next step
			pre = helper;               //initialize pre
			cur = next;                 //next insert node
		}
		
		return helper.next;
    }
}

}