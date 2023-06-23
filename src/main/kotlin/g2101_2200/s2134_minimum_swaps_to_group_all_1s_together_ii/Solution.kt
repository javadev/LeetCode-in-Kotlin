package g2101_2200.s2134_minimum_swaps_to_group_all_1s_together_ii

// #Medium #Array #Sliding_Window
class Solution {
    fun minSwaps(nums: IntArray): Int {
        val l = nums.size
        val ones = IntArray(l)
        ones[0] = if (nums[0] == 1) 1 else 0
        for (i in 1 until l) {
            if (nums[i] == 1) {
                ones[i] = ones[i - 1] + 1
            } else {
                ones[i] = ones[i - 1]
            }
        }
        if (ones[l - 1] == l || ones[l - 1] == 0) {
            return 0
        }
        val ws = ones[l - 1]
        var minSwaps = Int.MAX_VALUE
        var si = 0
        var ei: Int
        while (si < nums.size) {
            ei = (si + ws - 1) % l
            var totalones: Int
            totalones = if (ei >= si) {
                ones[ei] - if (si == 0) 0 else ones[si - 1]
            } else {
                ones[ei] + (ones[l - 1] - ones[si - 1])
            }
            val swapsreq = ws - totalones
            if (swapsreq < minSwaps) {
                minSwaps = swapsreq
            }
            si++
        }
        return minSwaps
    }
}
