package JavaBasicLogicPrograms;

public class Palindrome {
    public static void main(String[] args){
        int num=12321, n, palindrome=0, org=num;
        while(num>0){
            n=num%10;
            palindrome=(palindrome*10) + n;
            num=num/10;
        }
        if(org==palindrome){
            System.out.println("A palindrome");
        }
    }
}
