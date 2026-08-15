class Solution {
    public int findDuplicate(int[] nums) {
       int  slow = 0;
       int  fast = 0;
        while(true){
            slow = nums[slow]; // slow = slow.next;
            fast = nums[fast]; //fast = fast.next
            fast = nums[fast]; //fast = fast.next
            if(slow==fast){  //metting point
                break;
            }
        }
        slow =0;
        while(slow!=fast){                // starting point milega 
            slow = nums[slow]; 
            fast = nums[fast];
        }
        return slow;
    }
}