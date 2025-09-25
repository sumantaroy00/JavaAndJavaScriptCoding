package JavaCoding.String.CharFrequencyProblems;

import java.util.HashMap;
import java.util.Map.Entry;

public class MostFrequentCharacter {


    public static void main(String[] args) {
        String str = "swwwisij";

        int max =0;
        char ch1=0,ch2=0;

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
             ch1=entry.getKey();

            if(val>max){
                max=val;
                ch2=ch1; }
        
    }

    System.out.println(ch2);

}
    
}
