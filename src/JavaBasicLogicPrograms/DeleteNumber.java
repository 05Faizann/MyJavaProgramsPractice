package JavaBasicLogicPrograms;

public class DeleteNumber {
    public static void main(String[] args){
        int[] nums={3, 2, 2, 3}; int val=3, k=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]==val && nums[j]!=val){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
            }
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                k++;
            }
        }
        System.out.println();
        System.out.println(k);
    }
}
