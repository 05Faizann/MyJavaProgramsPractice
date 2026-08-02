public class multipleof3 {
    public static void main(String[] args){
        for(int i = 0; i <= 30; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
