package JavaCoding.String.StringManupulation;

import java.util.*;

public class newManupulation {

    public static void main(String[] args) {

        String []  str = {"a2b", "b3c", "g4d"};

        Map<Integer,Character> map = new HashMap<Integer,Character>();


        for(String s : str){
                char value = s.charAt(0);

                for(char ch : s.toCharArray()){

                    if(Character.isDigit(ch)){

                        map.put(ch-'1',value);
                    }
                }


        }

     System.out.println(map);
        
    }
    
}
