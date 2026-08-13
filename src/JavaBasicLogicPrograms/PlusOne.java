package JavaBasicLogicPrograms;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits={1, 2, 3}; int i;
        for(i=digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                break;
            }
        }
        if(i==-1){
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for (int j=0; j< arr.length; j++){
                System.out.print(arr[j] + " ");
            }
        }else{
            for(int j : digits){
                System.out.print(j + " ");
            }
        }
    }
}
