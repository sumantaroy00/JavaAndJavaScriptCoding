package JavaCoding.DSA.MapOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class sortbyEmployee {
   
     public String name;
     public int age;
     public int salary;

     sortbyEmployee(String name , int age , int salary){
       this.age = age;
       this.name = name;
       this.salary = salary;
     }

       public String getname(){
        return name; }  

        public int getage(){
        return age;  }
   
        public int getsalary(){
        return salary;  }
   


      @Override
      public String toString(){

         return "name :" +  name  + " age :" +  age + " salary :" + salary;
       }

    
}


public class sortingObject{

   public static void main(String [] args){

      Map<String , sortbyEmployee> map = new HashMap<>();
      map.put("E1",new sortbyEmployee("debo",28,210000));
      map.put("E2",new sortbyEmployee("suma",37,250000));
      map.put("E3",new sortbyEmployee("deba",25,150000));

      List<Map.Entry<String, sortbyEmployee>> entryList = new ArrayList<>(map.entrySet());

      Collections.sort(entryList,new Comparator<Map.Entry<String , sortbyEmployee>>(){


            @Override
            public int compare(Map.Entry<String ,sortbyEmployee> e1,Map.Entry<String , sortbyEmployee>e2){
               //return e1.getValue().getname().compareTo(e2.getValue().getname());
               return Integer.compare(e2.getValue().getsalary(), e1.getValue().getsalary());
    
               //
            }
         
      } );
      
      Map<String, sortbyEmployee> sortedEmpMap = new LinkedHashMap<>();
         for (Map.Entry<String, sortbyEmployee> entry : entryList) {
            sortedEmpMap.put(entry.getKey(), entry.getValue());
         }

       System.out.println(sortedEmpMap);
      
     

   }
}