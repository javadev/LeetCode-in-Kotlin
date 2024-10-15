package g3301_3400.s3321_find_x_sum_of_all_k_long_subarrays_ii

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2024_10_15_Time_1660_ms_(100.00%)_Space_81.8_MB_(100.00%)

import java.util.HashMap
import java.util.TreeSet

class Solution {
    private class RC(v: Int, c: Int) : Comparable<RC> {
        var `val`: Int
        var cnt: Int

        init {
            `val` = v
            cnt = c
        }

        override fun compareTo(o: RC): Int {
            if (cnt != o.cnt) {
                return cnt - o.cnt
            }
            return `val` - o.`val`
        }
    }

    fun findXSum(nums: IntArray, k: Int, x: Int): LongArray {
        val n = nums.size
        val ans = LongArray(n - k + 1)
        val cnt: MutableMap<Int?, Int?> = HashMap<Int?, Int?>()
        val s1 = TreeSet<RC>()
        val s2 = TreeSet<RC>()
        var sum: Long = 0
        var xSum: Long = 0
        for (i in 0 until n) {
            sum += nums[i].toLong()
            var curCnt: Int = cnt.getOrDefault(nums[i], 0)!!
            cnt.put(nums[i], curCnt + 1)
            var tmp = RC(nums[i], curCnt)
            if (s1.contains(tmp)) {
                s1.remove(tmp)
                s1.add(RC(nums[i], curCnt + 1))
                xSum += nums[i].toLong()
            } else {
                s2.remove(tmp)
                s1.add(RC(nums[i], curCnt + 1))
                xSum += nums[i].toLong() * (curCnt + 1)
                while (s1.size > x) {
                    val l = s1.first()
                    s1.remove(l)
                    xSum -= l.`val`.toLong() * l.cnt
                    s2.add(l)
                }
            }
            if (i >= k - 1) {
                ans[i - k + 1] = if (s1.size == x) xSum else sum
                val v = nums[i - k + 1]
                sum -= v.toLong()
                curCnt = cnt[v]!!
                if (curCnt > 1) {
                    cnt.put(v, curCnt - 1)
                } else {
                    cnt.remove(v)
                }
                tmp = RC(v, curCnt)
                if (s2.contains(tmp)) {
                    s2.remove(tmp)
                    if (curCnt > 1) {
                        s2.add(RC(v, curCnt - 1))
                    }
                } else {
                    s1.remove(tmp)
                    xSum -= v.toLong() * curCnt
                    if (curCnt > 1) {
                        s2.add(RC(v, curCnt - 1))
                    }
                    while (s1.size < x && s2.isNotEmpty()) {
                        val r = s2.last()
                        s2.remove(r)
                        s1.add(r)
                        xSum += r.`val`.toLong() * r.cnt
                    }
                }
            }
        }
        return ans
    }
}
