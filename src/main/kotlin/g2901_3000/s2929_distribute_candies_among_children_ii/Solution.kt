package g2901_3000.s2929_distribute_candies_among_children_ii

// #Medium #Math #Enumeration #Combinatorics
// #2023_12_31_Time_193_ms_(18.18%)_Space_33.5_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun distributeCandies(n: Int, limit: Int): Long {
        var ans: Long = 0
        for (i in 0..min(n, limit)) {
            var rem = (n - i).toLong()
            if (rem > 2 * limit) continue
            //second student
            val max = min(limit.toLong(), rem)
            //for third student
            rem -= max
            //if remain is grater than limit cant possible to arrange;
            //if(rem <= limit) than max - rem combination
            if (rem <= limit) ans = ans + max - rem + 1
        }
        return ans
    }
}