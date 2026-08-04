package JavaBasicLogicPrograms;

public class StoneGame {
    public static boolean stonegame(int[] piles){
        return true;
    }
    public static void main(String[] args){
        int[] piles={3, 8, 2, 3};
        int low=0;
        int high=piles.length-1; boolean flagalice=true; boolean flagbob=false;
        int alicemax=0, bobmax=0;

        while(low<high){

        if(piles[low]>=piles[high]){
            if(flagalice){
                alicemax+=piles[low];
                flagalice=false;
                flagbob=true;
            }else{
                bobmax+=piles[low];
                flagbob=false;
                flagalice=true;
            }
            piles[low]=-1;
            low++;
        }else if(piles[low]<=piles[high]){
            if(flagalice){
                alicemax+=piles[high];
                flagalice=false;
                flagbob=true;
            }else{
                bobmax+=piles[high];
                flagbob=false;
                flagalice=true;
            }
            piles[high]=-1;
            high--;
        }
        }
        System.out.println("alice :" + alicemax + " bob: " + bobmax);
    }
}
