package JavaBasicLogicPrograms;

public class ReversePrintNumber {
    public static void main(String[] args){
        int num = 12345,rev=0, n=0;
        while(num>0){
            n=num%10;
            rev=(rev*10)+n;
            num=num/10;
        }
        System.out.println(rev);
    }
}
//digit reverse code