package g3301_3400.s3318_find_x_sum_of_all_k_long_subarrays_i

// #Easy #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2024_10_15_Time_262_ms_(86.21%)_Space_37.7_MB_(100.00%)

import java.util.Comparator
import java.util.HashMap
import java.util.PriorityQueue

class Solution {
    private class Pair(num: Int, freq: Int) {
        var num: Int
        var freq: Int

        init {
            this.num = num
            this.freq = freq
        }
    }

    fun findXSum(nums: IntArray, k: Int, x: Int): IntArray {
        val n = nums.size
        val ans = IntArray(n - k + 1)
        for (i in 0 until n - k + 1) {
            val map = HashMap<Int?, Int?>()
            val pq =
                PriorityQueue<Pair>(
                    Comparator { a: Pair, b: Pair ->
                        if (a.freq == b.freq) {
                            return@Comparator b.num - a.num
                        }
                        b.freq - a.freq
                    }
                )
            for (j in i until i + k) {
                map.put(nums[j], map.getOrDefault(nums[j], 0)!! + 1)
            }
            for (entry in map.entries) {
                pq.add(Pair(entry.key!!, entry.value!!))
            }
            var count = x
            var sum = 0
            while (pq.isNotEmpty() && count > 0) {
                val pair = pq.remove()
                sum += pair.num * pair.freq
                count--
            }
            ans[i] = sum
        }
        return ans
    }
}
