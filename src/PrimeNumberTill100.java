public class PrimeNumberTill100 {
    public static void main(String[] args){
        boolean isPrime=true;
        for(int num=2; num<=100; num++){
            for(int i=2; i<num; i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(num);
            }
            isPrime=true;
        }
    }
}
