package g0701_0800.s0786_k_th_smallest_prime_fraction

// #Medium #Array #Binary_Search #Heap_Priority_Queue
// #2023_03_13_Time_165_ms_(100.00%)_Space_35.8_MB_(100.00%)

class Solution {
    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        val n = arr.size
        var low = 0.0
        var high = 1.0
        while (low < high) {
            val mid = (low + high) / 2
            val res = getFractionsLessThanMid(arr, n, mid)
            if (res[0] == k) {
                return intArrayOf(arr[res[1]], arr[res[2]])
            } else if (res[0] > k) {
                high = mid
            } else {
                low = mid
            }
        }
        return intArrayOf()
    }

    private fun getFractionsLessThanMid(arr: IntArray, n: Int, mid: Double): IntArray {
        var maxLessThanMid = 0.0
        // stores indices of max fraction less than mid;
        var x = 0
        var y = 0
        // for storing fractions less than mid
        var total = 0
        var j = 1
        for (i in 0 until n - 1) {
            // while fraction is greater than mid increment j
            while (j < n && arr[i] > arr[j] * mid) {
                j++
            }
            if (j == n) {
                break
            }
            // j fractions greater than mid, n-j fractions smaller than mid, add fractions smaller
            // than mid to total
            total += n - j
            val fraction = arr[i].toDouble() / arr[j]
            if (fraction > maxLessThanMid) {
                maxLessThanMid = fraction
                x = i
                y = j
            }
        }
        return intArrayOf(total, x, y)
    }
}
