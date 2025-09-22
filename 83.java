class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        while(tmp!=null){
            if(tmp.val==tmp.next.val){
                tmp.next = tmp.next.next;
                tmp = tmp.next;
            }
            tmp=tmp.next;
        }
        return head;
    }
}