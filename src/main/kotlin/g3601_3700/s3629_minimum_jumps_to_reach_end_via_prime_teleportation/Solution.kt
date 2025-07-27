package g3601_3700.s3629_minimum_jumps_to_reach_end_via_prime_teleportation

// #Medium #Weekly_Contest_460 #2025_07_27_Time_406_ms_(100.00%)_Space_153.64_MB_(100.00%)

import java.util.ArrayDeque
import kotlin.math.max

class Solution {
    fun minJumps(nums: IntArray): Int {
        val n = nums.size
        if (n == 1) {
            return 0
        }
        var maxVal = 0
        for (v in nums) {
            maxVal = max(maxVal, v)
        }
        val isPrime = sieve(maxVal)
        val posOfValue: Array<ArrayList<Int>> = Array<ArrayList<Int>>(maxVal + 1) { ArrayList<Int>() }
        for (i in 0..<n) {
            val v = nums[i]
            posOfValue[v].add(i)
        }
        val primeProcessed = BooleanArray(maxVal + 1)
        val dist = IntArray(n)
        dist.fill(-1)
        val q = ArrayDeque<Int>()
        q.add(0)
        dist[0] = 0
        while (!q.isEmpty()) {
            val i: Int = q.poll()!!
            val d = dist[i]
            if (i == n - 1) {
                return d
            }
            if (i + 1 < n && dist[i + 1] == -1) {
                dist[i + 1] = d + 1
                q.add(i + 1)
            }
            if (i - 1 >= 0 && dist[i - 1] == -1) {
                dist[i - 1] = d + 1
                q.add(i - 1)
            }
            val v = nums[i]
            if (v <= maxVal && isPrime[v] && !primeProcessed[v]) {
                var mult = v
                while (mult <= maxVal) {
                    val list = posOfValue[mult]
                    for (idx in list) {
                        if (dist[idx] == -1) {
                            dist[idx] = d + 1
                            q.add(idx)
                        }
                    }
                    mult += v
                }
                primeProcessed[v] = true
            }
        }
        return -1
    }

    private fun sieve(n: Int): BooleanArray {
        val prime = BooleanArray(n + 1)
        if (n >= 2) {
            prime.fill(true)
        }
        if (n >= 0) {
            prime[0] = false
        }
        if (n >= 1) {
            prime[1] = false
        }
        var i = 2
        while (i.toLong() * i <= n) {
            if (prime[i]) {
                var j = i * i
                while (j <= n) {
                    prime[j] = false
                    j += i
                }
            }
            i++
        }
        return prime
    }
}
