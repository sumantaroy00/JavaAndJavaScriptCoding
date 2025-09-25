package JavaCoding.String.AnagramPalimdromeRotationProblem;

public class PalimdromeCheck {
// Time complexity is O(n) as it traverse through all the letters in string
//Space complexity is O(1) as no extra space taken

    public static void main(String[] args){

   // StringBuilder sb = new StringBuilder();
     // String str = "A man, a plan, a canal: Panama";
     String str = "race a car";
    StringBuilder sb = new StringBuilder();

    for (char ch : str.toCharArray()){
       if(Character.isLetterOrDigit(ch)){
          sb.append(Character.toLowerCase(ch));
       }
    }

    if(sb.toString().equals(sb.reverse().toString())){
        System.out.println("String is Palimdrome");
    }
    else{
        System.out.println("String is not palimdrome");
    }


    /*2nd Possible way - Two pointer approach */
/* 
        if (str.isEmpty()) {
            System.out.println( "****** String is empty");
        }
        int first = 0;
        int last = str.length()-1 ;   

        while(first<=last)
        {

            char firstChar = str.charAt(first);
            char lastChar = str.charAt(last);
                if(!Character.isLetterOrDigit(firstChar)){
                    first++;
                }
                else if(!Character.isLetterOrDigit(lastChar)){
                    last--;
                }
                else{
                    if((Character.toLowerCase(firstChar) != Character.toLowerCase(lastChar))){
                          System.out.println(str + " ****** String is not palimdrome");
                          break;
                    }
                    first++;
                    last--;
                }
                
        

        }
        if(first>last){
            System.out.println(str + " ****** String is palimdrome");
        }
        */

    }
}
