package JavaBasicLogicPrograms;

public class CountEvenDigits {
    public static void main(String[] args){
        int n=4829576, num, count=0;
        while(n>0){
            num=n%10;
            if(num%2==0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
