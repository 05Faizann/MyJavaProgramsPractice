package JavaBasicLogicPrograms;

public class SecondLargestNum {
    public static void main(String[] args) {
        int[] arr={8, 12, 5, 19, 4, 18, 80};
        int max=arr[0], secMax=max;
        /*
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            if (arr[i]<max && arr[i]>=secMax){
                secMax=arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if (arr[i]<max && arr[i]>=secMax){
                secMax=arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Second Max: "+secMax); */

        for (int i=0; i<arr.length; i++){
            if(arr[i]>=max){
                secMax=max;
                max=arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Second Max: "+secMax);
    }
}
