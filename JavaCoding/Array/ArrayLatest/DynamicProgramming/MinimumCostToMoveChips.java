package JavaCoding.Array.ArrayLatest.DynamicProgramming;

public class MinimumCostToMoveChips {

    public static void main(String[] args) {

        int [] position = {2,2,2,3,3};

        int evencount=0;
        int oddcount = 0;

        for(int pos : position){

            if(pos%2==0)
            evencount++;
            else
            oddcount++;

        }
       
       int result = Math.min(oddcount,evencount);

       System.out.println(result);
        
        
    }
    
}
