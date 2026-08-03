package JavaBasicLogicPrograms;

public class SumOfDigits {
    public static void main(String[] args){
        int n=5827,sum=0,num;
        while(n>0){
            num=n%10;
            sum=sum+num;
            n=n/10;
        }
        System.out.println(sum);
    }
}
