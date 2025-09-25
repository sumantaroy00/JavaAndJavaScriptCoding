
package JavaCoding.String.CharFrequencyProblems;
import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter{


    public static void main(String[] args) {

        String str = "swwissij";

        HashMap<Character , Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()){
        
            if(map.containsKey(ch)){
              map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else{
              map.put(ch,1);
            }

        }

        for(Entry<Character, Integer> entry : map.entrySet()){

            int val = entry.getValue();

            if(val==1){
            System.out.println(entry.getKey());
            System.exit(0);}
           

        }
        
    }
    
    
    }