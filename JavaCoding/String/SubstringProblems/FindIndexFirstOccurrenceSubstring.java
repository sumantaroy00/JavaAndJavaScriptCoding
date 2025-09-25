package JavaCoding.String.SubstringProblems;

public class FindIndexFirstOccurrenceSubstring {

    public static void main(String[] args) {
        

        String s1 = "ileetcode";
        String s2 = "leet";

        int len1 = s1.length();
        int len2 = s2.length();

        if(len2>len1){

            System.out.println("Substring not present");
        }

        for(int i=0 ;i<len1-len2;i++){

            if(s1.substring(i, i+len2).equals(s2)){
               System.out.println(i);
               break;

            }

            if(i==len1-len2){

                System.out.println("No substring");
                break;  
            }


        }
    }
    
}
