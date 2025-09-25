package JavaCoding.DSA.TwoPointer;

public class RopeProblem {

    public static void main(String[] args) {
        String colors = "abaac";
        int[] neededTime = {1,2,3,1,2};
        int totalTime = 0;
        int n = colors.length()-1;
        int i = 0;

        while (i < n) {
            if (colors.charAt(i) == colors.charAt(i + 1)) {
                // Remove the balloon with smaller time
                if (neededTime[i] < neededTime[i + 1]) {
                    totalTime += neededTime[i];
                    // Keep the one with higher time (move i forward)
                    i++;
                } else {
                    totalTime += neededTime[i + 1];
                    // Replace i with the one we're keeping
                    neededTime[i + 1] = neededTime[i];
                    i++;
                }
            } else {
                i++;
            }
        }

        System.out.println(totalTime);
    }
    
}
