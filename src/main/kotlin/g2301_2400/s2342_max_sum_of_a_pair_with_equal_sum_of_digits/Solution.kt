package g2301_2400.s2342_max_sum_of_a_pair_with_equal_sum_of_digits

// #Medium #Array #Hash_Table #Sorting #Heap_Priority_Queue
class Solution {
    fun maximumSum(nums: IntArray): Int {
        val map: MutableMap<Int, Int> = HashMap()
        var res = -1
        for (num in nums) {
            var s = 0
            for (digit in num.toString().toCharArray()) {
                s += Integer.valueOf(digit.code - '0'.code)
            }
            if (!map.containsKey(s)) {
                map[s] = num
            } else {
                res = Math.max(res, map[s]!! + num)
                map[s] = Math.max(map[s]!!, num)
            }
        }
        return res
    }
}
