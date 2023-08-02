package g0001_0100.s0055_jump_game

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming #Greedy
// #Algorithm_II_Day_12_Dynamic_Programming #Dynamic_Programming_I_Day_4 #Udemy_Arrays
// #2023_07_10_Time_332_ms_(89.35%)_Space_39_MB_(96.44%)

class Solution {
    fun canJump(nums: IntArray): Boolean {
        val sz = nums.size
        // we set 1 so it won't break on the first iteration
        var tmp = 1
        for (i in 0 until sz) {
            // we always deduct tmp for every iteration
            tmp--
            if (tmp < 0) {
                // if from previous iteration tmp is already 0, it will be <0 here
                // leading to false value
                return false
            }
            // we get the maximum value because this value is supposed
            // to be our iterator, if both values are 0, then the next
            // iteration we will return false
            // if either both or one of them are not 0 then we will keep doing this and check.

            // We can stop the whole iteration with this condition. without this condition the code
            // runs in 2ms 79.6%, adding this condition improves the performance into 1ms 100%
            // because if the test case jump value is quite large, instead of just iterate, we can
            // just check using this condition
            // example: [10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] -> we can just jump to the end without
            // iterating whole array
            tmp = Math.max(tmp, nums[i])
            if (i + tmp >= sz - 1) {
                return true
            }
        }
        // we can just return true at the end, because if tmp is 0 on previous
        // iteration,
        // even though the next iteration index is the last one, it will return false under the
        // tmp<0 condition
        return true
    }
}
