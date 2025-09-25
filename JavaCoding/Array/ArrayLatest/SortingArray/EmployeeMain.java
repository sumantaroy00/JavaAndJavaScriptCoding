package JavaCoding.Array.ArrayLatest.SortingArray;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class employeeSorting {


    private int id;
    private String name;
    private int age;
    private String country;


    public employeeSorting(int id , String name , int age , String country){

        this.id = id;
        this.name = name;
        this.age=age;
        this.country = country;

        }
       
      
    public int getID(){
        return id ;
    }

    public String getName(){
        return name ;
    }
    public int getAge(){
        return age ;
    }

    public String getCountry(){
        return country ;
    }

    @Override
    public String toString() {
        return String.format("employeeSorting{id=%d, name='%s', age=%d, country='%s'}",
                              id, name, age, country);
    }
  
}


public class EmployeeMain {


    public static void main(String[] args) {
        
      List<employeeSorting> people = Arrays.asList(
            new employeeSorting(10, "Alice", 30, "India"),
            new employeeSorting(15, "Bob",   25, "USA"),
            new employeeSorting(20, "Carlos", 28, "Brazil"),
            new employeeSorting(25, "Diana", 35, "UK"),
            new employeeSorting(30, "Eve",   22, "Australia"),
            new employeeSorting(15, "Eve",   22, "Australia")
        );

        Optional<employeeSorting> personWithId15 = people.stream()
        .filter(p -> p.getID() == 15)
        .findAny();

          List<employeeSorting> olderThan25 = people.stream()
            .filter(p -> p.getAge() > 25)
            .collect(Collectors.toList());

        System.out.println(personWithId15.get());


        // 📊 Print ID=15 result
        if (personWithId15.isPresent()) {
            System.out.println("Found (ID=15): " + personWithId15.get());
        } else {
            System.out.println("No person found with ID=15.");
        }

        // 📊 Print age>25 results
        System.out.println("People with age > 25:");
        olderThan25.forEach(p -> System.out.println("  " + p));

    }
}