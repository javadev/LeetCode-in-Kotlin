package g1101_1200.s1191_k_concatenation_maximum_sum

// #Medium #Array #Dynamic_Programming

class Solution {
    private val mod: Long = 1000000007
    fun kConcatenationMaxSum(arr: IntArray, k: Int): Int {
        // int kadane = Kadane(arr);
        // #1 when k 1 simply calculate kadanes
        if (k == 1) {
            return (kadane(arr) % mod).toInt()
        }
        // #2 else calculate the total sum and then check if sum is -Ve or +Ve
        var totalSum: Long = 0
        for (i in arr) {
            totalSum += i.toLong()
        }
        // #3 when negative then calculate of arr 2 times only the answer is in there only
        return if (totalSum < 0) {
            // when -ve sum put a extra check here of max from 0
            Math.max(kadaneTwo(arr) % mod, 0).toInt()
        } else {
            // #4 when sum is positve then the ans is kadane of 2 + sum * (k-2);
            // these two are used sUm*(k-2) ensures that all other are also included
            ((kadaneTwo(arr) + (k - 2) * totalSum + mod) % mod).toInt()
        }
    }

    private fun kadane(arr: IntArray): Long {
        var max = arr[0].toLong()
        var cur: Long = 0
        for (n in arr) {
            cur += n.toLong()
            max = Math.max(max, cur)
            if (cur < 0) {
                cur = 0
            }
        }
        return max
    }

    private fun kadaneTwo(arr: IntArray): Long {
        var max = arr[0].toLong()
        var cur: Long = 0
        for (i in 0 until arr.size * 2) {
            cur += arr[i % arr.size].toLong()
            max = Math.max(max, cur)
            if (cur < 0) {
                cur = 0
            }
        }
        return max
    }
}
