package JavaCoding.Array.ArrayLatest.GreedyAlgorithm;

public class minJump2 {

    public static void main(String[] args) {


      int[] nums = {2, 4, 1, 2, 3, 1, 1, 2};
        int totalJumps = 0;
        int destination = nums.length - 1;
        int coverage = 0, lastJumpIdx = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            coverage = Math.max(coverage, i + nums[i]);

            if (i == lastJumpIdx) {
                totalJumps++;
                lastJumpIdx = coverage;

                if (coverage >= destination) {
                    System.out.println("Minimum jumps needed: " + totalJumps);
                    System.exit(0);
                }
            }
        }

        System.out.println("Minimum jumps needed: " + totalJumps);
        
    }
    
}
