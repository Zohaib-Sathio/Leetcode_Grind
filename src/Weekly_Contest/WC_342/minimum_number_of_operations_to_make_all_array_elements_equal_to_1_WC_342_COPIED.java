package Weekly_Contest.WC_342;

public class minimum_number_of_operations_to_make_all_array_elements_equal_to_1_WC_342_COPIED {
    // This solution is not coded by me!!
        public int minOperations(int[] nums) {
            int n = nums.length;
            // check if there is 1 in `nums`
            int ones = 0;
            for (int num : nums) {
                if (num == 1) {
                    ones++;
                }
            }
            // if so, we can make all the other elements equal to 1 with one operation each
            // e.g. [2,6,1,4] -> [2,1,1,4] -> [1,1,1,4] -> [1,1,1,1]
            // the number of operation to make all equal to 1 is simply n - number of 1s
            if (ones > 0) {
                return n - ones;
            }
            int res = Integer.MAX_VALUE;
            // try finding the shortest subarray with a gcd equal to 1.
            for (int i = 0; i < n; i++) {
                // subarray starting from i
                int g = nums[i];
                // try each element after i
                for (int j = i + 1; j < n; j++) {
                    // to calculate gcd
                    g = gcd(g, nums[j]);
                    // if the gcd is 1
                    if (g == 1) {
                        // then we calculate the min ops
                        res = Math.min(res, j - i);
                    }
                }
            }
            // no result -> return -1
            if (res == Integer.MAX_VALUE) {
                return -1;
            }
            // otherwise, return res + n - 1
            // i.e. the min ops to turn the shortest subarray to 1 +
            //      use that 1 to convert n - 1 elements to 1
            return res + n - 1;
        }

        private int gcd(int a, int b) {
            if (a == 0) {
                return b;
            }
            return gcd(b % a, a);
        }
}
