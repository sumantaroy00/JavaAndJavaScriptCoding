package JavaCoding.String.StringManupulation;

public class reverseString_ignoreSpace {

    public static void main(String[] args) {
        String input = "i am a java guy";
        char [] output =input.toCharArray();
 
      
            int start=0;
            int last = output.length-1;

        while(start<=last){

            char startchar = output[start];
            char lastchar = output[last];

               if(!Character.isLetterOrDigit(startchar)){

                 start++;
               }
               else if(!Character.isLetterOrDigit(lastchar)){
                last--;
               }

               else{
               if(Character.isLetterOrDigit(startchar) && Character.isLetterOrDigit(lastchar)){
                    char temp = output[last];
                    output[last]=output[start];
                    output[start]=temp;
                    start++;
                    last--;
                }
            }

        }

        System.out.println(new String(output));

}
    
}
