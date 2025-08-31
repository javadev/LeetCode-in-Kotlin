package g3601_3700.s3668_restore_finishing_order

// #Easy #Weekly_Contest_465 #2025_08_31_Time_2_ms_(100.00%)_Space_49.00_MB_(93.75%)

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
