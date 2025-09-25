package JavaCoding.Array.ArrayLatest.DynamicProgramming;

public class waterProblem {

    public static void main(String[] args) {
        

        int numBottles = 15;
        int numExchange = 3;
        int result = numWaterBottles(numBottles, numExchange);
        System.out.println("Total bottles you can drink: " + result);
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        if(numExchange>numBottles || numExchange ==1){

            return numBottles;
        }

        int totalDrank = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            totalDrank = totalDrank + newBottles;
            emptyBottles = newBottles + (emptyBottles % numExchange); // key fix
        }

        return totalDrank;
    
    }
    
}


       