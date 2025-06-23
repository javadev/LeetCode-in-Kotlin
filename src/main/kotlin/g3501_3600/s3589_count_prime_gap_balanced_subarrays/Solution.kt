package g3501_3600.s3589_count_prime_gap_balanced_subarrays

// #Medium #Array #Math #Sliding_Window #Queue #Number_Theory #Monotonic_Queue
// #2025_06_23_Time_341_ms_(100.00%)_Space_74.06_MB_(100.00%)

import java.util.TreeMap

class Solution {
    private val isPrime: BooleanArray

    init {
        isPrime = BooleanArray(MAXN)
        isPrime.fill(true)
        sieve()
    }

    fun sieve() {
        isPrime[0] = false
        isPrime[1] = false
        var i = 2
        while (i * i < MAXN) {
            if (isPrime[i]) {
                var j = i * i
                while (j < MAXN) {
                    isPrime[j] = false
                    j += i
                }
            }
            i++
        }
    }

    fun primeSubarray(nums: IntArray, k: Int): Int {
        val n = nums.size
        var l = 0
        var res = 0
        val ms = TreeMap<Int, Int>()
        val primeIndices: MutableList<Int> = ArrayList<Int>()
        for (r in 0..<n) {
            if (nums[r] < MAXN && isPrime[nums[r]]) {
                ms.put(nums[r], ms.getOrDefault(nums[r], 0) + 1)
                primeIndices.add(r)
            }
            while (!ms.isEmpty() && ms.lastKey()!! - ms.firstKey()!! > k) {
                if (nums[l] < MAXN && isPrime[nums[l]]) {
                    val count: Int = ms.get(nums[l])!!
                    if (count == 1) {
                        ms.remove(nums[l])
                    } else {
                        ms.put(nums[l], count - 1)
                    }
                    if (!primeIndices.isEmpty() && primeIndices[0] == l) {
                        primeIndices.removeAt(0)
                    }
                }
                l++
            }
            if (primeIndices.size >= 2) {
                val prev: Int = primeIndices[primeIndices.size - 2]
                if (prev >= l) {
                    res += (prev - l + 1)
                }
            }
        }
        return res
    }

    companion object {
        private const val MAXN = 100005
    }
}
