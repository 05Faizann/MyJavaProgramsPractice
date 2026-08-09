package JavaBasicLogicPrograms;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums={2,2,3,3,3,4,5,5,6,6,6,6}; int k=1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    nums[i+1]=nums[j];
                    break;
                }
            }
        }
        for(int i=0;i< nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                k++;
            }else{
                break;
            }
        }
        System.out.println(k);
    }
}
