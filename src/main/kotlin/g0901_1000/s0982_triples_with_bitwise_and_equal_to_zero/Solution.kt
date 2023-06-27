package g0901_1000.s0982_triples_with_bitwise_and_equal_to_zero

// #Hard #Array #Hash_Table #Bit_Manipulation
// #2023_05_09_Time_227_ms_(100.00%)_Space_48.2_MB_(100.00%)

class Solution {
    fun countTriplets(nums: IntArray): Int {
        val arr = IntArray(1 shl 17)
        for (num in nums) {
            var mask = 0
            for (i in 0..15) {
                if (num and (1 shl i) == 0) {
                    mask = mask or (1 shl i)
                }
            }
            var s = mask
            while (s > 0) {
                arr[s]++
                s = s - 1 and mask
            }
        }
        var count = 0
        for (j in nums) {
            for (num in nums) {
                val `val` = j and num
                if (`val` == 0) {
                    count += nums.size
                } else {
                    var mask = 0
                    for (k in 0..15) {
                        if (`val` and (1 shl k) > 0) {
                            mask = mask or (1 shl k)
                        }
                    }
                    count += arr[mask]
                }
            }
        }
        return count
    }
}
