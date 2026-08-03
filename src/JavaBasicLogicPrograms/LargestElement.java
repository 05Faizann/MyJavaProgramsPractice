package JavaBasicLogicPrograms;

public class LargestElement {
    public static void main(String[] args){
        int[] num={5, 9, 2, 14, 6};
        int min=num[0], max=0, sum=0, count=0; double avg=0.00d;
        for(int i=0; i<num.length; i++){
         if(num[i]>=max){
             max=num[i];
         }
         if(num[i]<=min){
             min=num[i];
         }
         sum=sum+num[i];

         if(num[i]%2==0){
             count++;
         }
        }
        avg=(double)sum/num.length;

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        System.out.println(avg);
        System.out.println("Even no. count: "+count);

        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }
    }
}
