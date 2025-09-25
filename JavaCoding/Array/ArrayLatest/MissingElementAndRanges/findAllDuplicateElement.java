package JavaCoding.Array.ArrayLatest.MissingElementAndRanges;

import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class findAllDuplicateElement{

public static void main(String[] args) {

    int [] arr = {2,3,5,4,3,3,8,3932,3932,1,9,0,0};

HashSet<Integer> set = new HashSet<>();
LinkedHashSet<Integer> duplicates = new LinkedHashSet<>();


for(int num : arr){


    if(set.contains(num)){
        duplicates.add(num);

    }
    else{
        set.add(num);
    }

}

System.out.println(duplicates);

List<Integer> nums = Arrays.asList(2,3,5,4,3,3,8,3932,3932,1,9,0,0);
Set<Integer> unique  = new HashSet<>();
Set<Integer> duplicates1 = nums.stream().filter(num->!unique.add(num)).collect(Collectors.toSet());

System.out.println(duplicates1);

}
}