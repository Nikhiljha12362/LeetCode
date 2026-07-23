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
        int len1=0;
        ListNode temp1 =headA;
       //mujhe phele length nikalni hai a walhi
       while(temp1!=null){
        temp1 =temp1.next;
        len1++;
       }
        //mujhe phele length nikalni hai b walhi ka
        int len2 =0;
        ListNode temp2 = headB;
        while(temp2!=null){
            temp2= temp2.next;
            len2++;
        }
        temp1 =headA;
        temp2 =headB;
        if(len1>len2){ //temp1 ko itne step aage badha do
            for(int i=0;i<len1-len2;i++){
                temp1=temp1.next;
            }
        }
            else {
                for(int i=0;i<len2-len1;i++){
                    temp2 =temp2.next;
                }
               
                }
                 while(temp1!=null && temp2!=null){
                    if(temp1==temp2){
                        return temp1;
                    }
                    temp1 = temp1.next;
                     temp2 = temp2.next;

            }
            return temp1;
        }
        
    }
