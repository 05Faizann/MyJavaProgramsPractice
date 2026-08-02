public class experiment {
    public static void main(String[] args){
        int[] a={11, 7, 1, 13, 21, 3, 7, 3};
        int[] b={11, 3, 7, 1, 7};
        int count=0;
        for(int i=0; i<b.length; i++){
            for(int j=0; j<a.length; j++){
                if(b[i]==a[j]){
                    count++;
                    a[j]=-1;
                    System.out.println("b[" + i + "] == a[" + j + "]");
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
//array subset problem

