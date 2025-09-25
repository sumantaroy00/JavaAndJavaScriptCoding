package JavaCoding.String.SortingProblem;

import java.util.*;

public class TopKfrequentWords {

    /*✅ Approach Summary:
            Count frequency of each word using HashMap<String, Integer>.
            Use a PriorityQueue (Min-Heap) with custom comparator:
            Lower frequency has higher priority.
            If frequencies are equal, lexicographically 
            later words have higher priority (so that earlier ones are retained in top K).
            Extract top k from heap and reverse the result.
    */

    public static void main(String[] args) {
        
           
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k)); // Output: [i, love]

    }
    public static List<String> topKFrequent(String [] words,int k){

       // Step 1: Count frequency of each word
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Step 2: Get list of unique words
        List<String> wordList = new ArrayList<>(frequencyMap.keySet());

        // Step 3: Sort the words
        Collections.sort(wordList, (word1, word2) -> {

            int frequencyCompare = frequencyMap.get(word2) - frequencyMap.get(word1);

            if (frequencyCompare == 0) {
                // If frequency same, sort lexicographically
                return word1.compareTo(word2);
            }

            return frequencyCompare;  // Sort by frequency descending
        });

        // Step 4: Pick first K words
        return wordList.subList(0, k);
    }



    
    
}
