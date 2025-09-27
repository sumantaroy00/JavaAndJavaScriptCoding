package JavaCoding.String.StringManupulation;
import java.util.*;
public class stringManupulationRepeatCharacter {
    

    public static void main(String[] args) {
    

        HashMap<Character , Integer>  map = new HashMap<Character , Integer>();

        map.put('a',2);
        map.put('b',3);
        map.put('c',1);
        map.put('d',0);

        StringBuilder result = new StringBuilder();

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            char ch= entry.getKey();
            int value = entry.getValue();

            for(int i =0 ;i<value;i++){
                result.append(ch);
            }

        }
        System.out.println(result.toString());

        String str = "a2b3c2d0";
        StringBuilder res = new StringBuilder();

        for(int i=0;i<str.length();i=i+2){

            char ch = str.charAt(i);
            int value = Character.getNumericValue(str.charAt(i+1));
            res.append(String.valueOf(ch).repeat(value));
            
        }

        System.out.println(res);

}}

