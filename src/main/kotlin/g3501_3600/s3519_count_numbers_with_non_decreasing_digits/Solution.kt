package g3501_3600.s3519_count_numbers_with_non_decreasing_digits

// #Hard #String #Dynamic_Programming #Math
// #2025_04_14_Time_31_ms_(100.00%)_Space_46.39_MB_(100.00%)

class Solution {
    fun countNumbers(l: String, r: String, b: Int): Int {
        val ans1 = find(r.toCharArray(), b)
        val start = subTractOne(l.toCharArray())
        val ans2 = find(start, b)
        return ((ans1 - ans2) % 1000000007L).toInt()
    }

    private fun find(arr: CharArray, b: Int): Long {
        val nums = convertNumToBase(arr, b)
        val dp = Array<Array<Array<Long?>>>(nums.size) { Array<Array<Long?>>(2) { arrayOfNulls<Long>(11) } }
        return solve(0, nums, 1, b, 0, dp) - 1
    }

    private fun solve(i: Int, arr: IntArray, tight: Int, base: Int, last: Int, dp: Array<Array<Array<Long?>>>): Long {
        if (i == arr.size) {
            return 1L
        }
        if (dp[i][tight][last] != null) {
            return dp[i][tight][last]!!
        }
        var till = base - 1
        if (tight == 1) {
            till = arr[i]
        }
        var ans: Long = 0
        for (j in 0..till) {
            if (j >= last) {
                ans = (ans + solve(i + 1, arr, tight and (if (j == arr[i]) 1 else 0), base, j, dp))
            }
        }
        dp[i][tight][last] = ans
        return ans
    }

    private fun subTractOne(arr: CharArray): CharArray {
        val n = arr.size
        var i = n - 1
        while (i >= 0 && arr[i] == '0') {
            arr[i--] = '9'
        }
        val x = arr[i].code - '0'.code - 1
        arr[i] = (x + '0'.code).toChar()
        var j = 0
        var idx = 0
        while (j < n && arr[j] == '0') {
            j++
        }
        val res = CharArray(n - j)
        for (k in j..<n) {
            res[idx++] = arr[k]
        }
        return res
    }

    private fun convertNumToBase(arr: CharArray, base: Int): IntArray {
        val n = arr.size
        var num = IntArray(n)
        var i = 0
        while (i < n) {
            num[i] = arr[i++].code - '0'.code
        }
        val temp: MutableList<Int> = ArrayList<Int>()
        var len = n
        while (len > 0) {
            var rem = 0
            val next = IntArray(len)
            var newLen = 0
            var j = 0
            while (j < len) {
                val cur = rem * 10L + num[j]
                val q = (cur / base).toInt()
                rem = (cur % base).toInt()
                if (newLen > 0 || q != 0) {
                    next[newLen] = q
                    newLen++
                }
                j++
            }
            temp.add(rem)
            num = next
            len = newLen
        }
        val res = IntArray(temp.size)
        var k = 0
        val size = temp.size
        while (k < size) {
            res[k] = temp[size - 1 - k]
            k++
        }
        return res
    }
}
