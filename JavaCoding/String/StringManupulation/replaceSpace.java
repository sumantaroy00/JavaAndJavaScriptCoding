package JavaCoding.String.StringManupulation;

public class replaceSpace {


    /* Problem:
       Given a string, replace all spaces with %20. You may assume the string has sufficient space at the end to hold the additional characters, and you're given the true length of the string. */


       public static void main(String[] args) {
        String str = "Mr John Smith    ";  // extra spaces to accommodate %20

        String input = str.trim();

        int trueLength = input.length();

       // int trueLength = 13;


        char[] chars = str.toCharArray();
        replaceSpaces(chars, trueLength);

        System.out.println("URLified: " + new String(chars));

       }

       public static void replaceSpaces(char [] str , int trueLength){

        int spaceCount = 0;

             // Count spaces
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') spaceCount++;
        }
        
        int index = trueLength + spaceCount * 2;

         // End of string
         if (trueLength < str.length) 
         str[trueLength] = '\0';

         for (int i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
         }

       }
    
}
