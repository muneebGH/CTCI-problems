package CH2;

import helpers.ListNode;
public class RemoveDups {
    public void solution(ListNode head){
        //with no memory extra memory buffer
        ListNode temp=head;
        while(temp.next!=null){
            removeItems(temp.next,temp.val);
            temp=temp.next;
        }
    }

    public void removeItems(ListNode head,int val){
        if(head.val==val){
            head=head.next;
        }
        ListNode temp=head;
        ListNode prev=head;
        while(temp!=null){
            if(temp.val==val){
                //remove this
                prev.next=temp.next;
            }
            prev=temp;
            temp=temp.next;
        }
    }

}
