package JavaBasicLogicPrograms;

//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4

public class SearchInsertPosition {
    public static void main(String[] args){
        int[] nums={1, 3, 5, 6}; int target=7; boolean flag=false;
        int low=0; int high=nums.length-1; int mid=(low+high)/2;
        while(low<=high){
            if(target == nums[mid]){
                System.out.println("Target found at nums[" + mid + "]");
                flag=true;
                break;
            }
            else if(target<nums[mid]){
                high=mid-1;
                mid=(low+high)/2;
            }
            else if(target>nums[mid]){
                low=mid+1;
                mid=(low+high)/2;
            }
        }
        if(!flag) {
            System.out.println("Expected input index position: " + low);
        }
    }
}
//Did binary search on my own. Was just missing high=mid-1 & low=mid+1
//I wrote high=mid & low=mid instead which was causing infinite loop because pointers were not moving past mid.
