package g0801_0900.s0825_friends_of_appropriate_ages

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2023_03_25_Time_278_ms_(100.00%)_Space_39.8_MB_(100.00%)

class Solution {
    fun numFriendRequests(ages: IntArray): Int {
        val counter = IntArray(121)
        for (k in ages) {
            counter[k]++
        }
        var result = 0
        for (k in 15 until counter.size) {
            if (counter[k] == 0) {
                continue
            }
            result += counter[k] * (counter[k] - 1)
            var y = k - 1
            while (y > k / 2.0 + 7) {
                result += counter[k] * counter[y]
                y--
            }
        }
        return result
    }
}
