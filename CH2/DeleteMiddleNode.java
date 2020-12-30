package CH2;

import helpers.ListNode;

public class DeleteMiddleNode {
    public static void solution(ListNode head){
        //calculate length of linked list
        float length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        //calculate middle point
        int middle= (int) Math.ceil(length/2);
        //delete middle one
        temp=head;
        ListNode prev=head;
        while(middle>=1){
            if(middle==1){
                prev.next=temp.next;
                return;
            }
            middle=middle-1;
            prev=temp;
            temp=temp.next;
        }
    }
}
