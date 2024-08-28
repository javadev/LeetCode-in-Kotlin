package g3201_3300.s3266_final_array_state_after_k_multiplication_operations_ii

// #Hard #2024_08_28_Time_546_ms_(100.00%)_Space_60.8_MB_(66.67%)

import java.util.PriorityQueue
import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        var k = k
        if (multiplier == 1) {
            return nums
        }
        val n = nums.size
        var mx = 0
        for (x in nums) {
            mx = max(mx, x)
        }
        val a = LongArray(n)
        var left = k
        var shouldExit = false
        run {
            var i = 0
            while (i < n && !shouldExit) {
                var x = nums[i].toLong()
                while (x < mx) {
                    x *= multiplier.toLong()
                    if (--left < 0) {
                        shouldExit = true
                        break
                    }
                }
                a[i] = x
                i++
            }
        }
        if (left < 0) {
            val pq =
                PriorityQueue { p: LongArray, q: LongArray ->
                    if (p[0] != q[0]
                    ) java.lang.Long.compare(p[0], q[0])
                    else java.lang.Long.compare(p[1], q[1])
                }
            for (i in 0 until n) {
                pq.offer(longArrayOf(nums[i].toLong(), i.toLong()))
            }
            while (k-- > 0) {
                val p = pq.poll()
                p[0] *= multiplier.toLong()
                pq.offer(p)
            }
            while (!pq.isEmpty()) {
                val p = pq.poll()
                nums[p[1].toInt()] = (p[0] % MOD).toInt()
            }
            return nums
        }

        val ids: Array<Int> = Array(n) { i: Int -> i }
        ids.sortWith { i: Int?, j: Int? -> java.lang.Long.compare(a[i!!], a[j!!]) }
        k = left
        val pow1 = pow(multiplier.toLong(), k / n)
        val pow2 = pow1 * multiplier % MOD
        for (i in 0 until n) {
            val j = ids[i]
            nums[j] = (a[j] % MOD * (if (i < k % n) pow2 else pow1) % MOD).toInt()
        }
        return nums
    }

    private fun pow(x: Long, n: Int): Long {
        var x = x
        var n = n
        var res: Long = 1
        while (n > 0) {
            if (n % 2 > 0) {
                res = res * x % MOD
            }
            x = x * x % MOD
            n /= 2
        }
        return res
    }

    companion object {
        private const val MOD = 1000000007
    }
}
