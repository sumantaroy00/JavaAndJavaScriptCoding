package JavaCoding.DSA.TwoPointer;

public class backTrace {

    public static void main(String[] args) {
        
        String s = "ab#c"; String t = "ad#c";
        StringBuilder sb1 = new StringBuilder();
       StringBuilder sb2 = new StringBuilder();
    if(s.length()!=t.length()){

       // system.out.println
    }
    

    for(int i = 0 ;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch!='#'){
            sb1.append(ch);
        }
       else if (sb1.length() > 0) {
            sb1.deleteCharAt(sb1.length() - 1);  // delete last character
        }
    }
       for(int j = 0 ;j<t.length();j++)
       {
            char ch = t.charAt(j);
            if(ch!='#'){
                sb2.append(ch);
            }
            else if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);  // delete last character
        }

       }

       if(sb1.toString().equals(sb2.toString())){
        // system.out.println
       }
       else{
    // system.out.println
       }
    }
    }
    

