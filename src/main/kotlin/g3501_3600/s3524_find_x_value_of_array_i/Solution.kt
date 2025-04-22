package g3501_3600.s3524_find_x_value_of_array_i

// #Medium #Array #Dynamic_Programming #Math
// #2025_04_20_Time_12_ms_(100.00%)_Space_71.76_MB_(60.00%)

class Solution {
    fun resultArray(nums: IntArray, k: Int): LongArray {
        val res = LongArray(k)
        var cnt = IntArray(k)
        for (a in nums) {
            val cnt2 = IntArray(k)
            for (i in 0..<k) {
                val v = ((i.toLong() * a) % k).toInt()
                cnt2[v] += cnt[i]
                res[v] += cnt[i].toLong()
            }
            cnt = cnt2
            cnt[a % k]++
            res[a % k]++
        }
        return res
    }
}
