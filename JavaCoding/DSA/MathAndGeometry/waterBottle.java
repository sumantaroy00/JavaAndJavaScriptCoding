package JavaCoding.DSA.MathAndGeometry;

public class waterBottle {

    /*There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
      The operation of drinking a full water bottle turns it into an empty bottle.
      Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink. */

    public static void main(String[] args) {
        
     int numBottles = 9;
     int numExchange = 2;

     System.out.println(numWaterBottles(numBottles,numExchange));

    }

    public static int numWaterBottles(int numBottles, int numExchange) {
 
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
