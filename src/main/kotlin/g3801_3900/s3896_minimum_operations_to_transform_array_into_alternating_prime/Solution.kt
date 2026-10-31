package g3801_3900.s3896_minimum_operations_to_transform_array_into_alternating_prime

// #Medium #Array #Math #Sorting #Binary_Search #Two_Pointers #Number_Theory #Senior
// #Biweekly_Contest_180 #2026_08_12_Time_18_ms_(97.87%)_Space_92.70_MB_(76.17%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var res = 0
        for (i in nums.indices) {
            var j = nums[i]
            if ((i and 1) == 1) {
                while (!sieve[j++]) {
                    res++
                }
            } else {
                while (sieve[j++]) {
                    res++
                }
            }
        }
        return res
    }

    companion object {
        private const val N = 100004
        private val sieve = BooleanArray(N)

        init {
            sieve[1] = true
            sieve[0] = sieve[1]
            for (i in 2..316) {
                if (!sieve[i]) {
                    var j = i * i
                    while (j < N) {
                        sieve[j] = true
                        j += i
                    }
                }
            }
        }
    }
}
