public class LargestDigit {
    public static void main(String[] args){
        int n=748391, num, max=0;
        while(n>0){
            num=n%10;
            if(max<num){
                max=num;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}
