package g3601_3700.s3668_restore_finishing_order

// #Easy #Weekly_Contest_465 #2025_09_07_Time_2_ms_(94.29%)_Space_49.08_MB_(72.86%)

class Solution {
    fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
        val rs = IntArray(friends.size)
        var index = 0
        for (k in order) {
            for (friend in friends) {
                if (k == friend) {
                    rs[index] = k
                    index++
                    break
                }
            }
        }
        return rs
    }
}
