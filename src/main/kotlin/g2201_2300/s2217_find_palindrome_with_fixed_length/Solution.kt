package g2201_2300.s2217_find_palindrome_with_fixed_length

// #Medium #Array #Math
class Solution {
    fun kthPalindrome(queries: IntArray, intLength: Int): LongArray {
        val minHalf = Math.pow(10.0, ((intLength - 1) / 2).toDouble()).toLong()
        val maxIndex = Math.pow(10.0, ((intLength + 1) / 2).toDouble()).toLong() - minHalf
        val isOdd = intLength % 2 == 1
        val res = LongArray(queries.size)
        for (i in res.indices) {
            res[i] = if (queries[i] > maxIndex) -1 else helper(queries[i].toLong(), minHalf, isOdd)
        }
        return res
    }

    private fun helper(index: Long, minHalf: Long, isOdd: Boolean): Long {
        var half = minHalf + index - 1
        var res = half
        if (isOdd) {
            res /= 10
        }
        while (half != 0L) {
            res = res * 10 + half % 10
            half /= 10
        }
        return res
    }
}
