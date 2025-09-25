package CustomJavaCollectionImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraysAsListSumanta {


    @SuppressWarnings("unchecked")
    public static <T> List<T> asList(T... elements){
       
        List<T> list = new ArrayList<>();
        Collections.addAll(list, elements);
        return list;
               
    }

    public static void main(String[] args) {

        List<String>  Mylist = arraysAsListSumanta.asList("apple","gourab","khaibo");
        System.out.println(Mylist);
        
    }
    
}
