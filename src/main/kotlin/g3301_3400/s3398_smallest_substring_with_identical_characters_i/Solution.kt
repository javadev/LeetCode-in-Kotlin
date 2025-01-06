package g3301_3400.s3398_smallest_substring_with_identical_characters_i

// #Hard #Array #Binary_Search #Enumeration #2024_12_24_Time_2_ms_(100.00%)_Space_36.4_MB_(92.86%)

class Solution {
    fun minLength(s: String, ops: Int): Int {
        val arr2 = s.toCharArray()
        var q = '0'.code
        var w = '1'.code
        var p1 = ops
        var p2 = ops
        for (i in 0..<s.length) {
            if (arr2[i].code != q) {
                p1--
            }
            if (arr2[i].code != w) {
                p2--
            }
            if (q == '0'.code) {
                q = '1'.code
            } else {
                q = '0'.code
            }
            if (w == '0'.code) {
                w = '1'.code
            } else {
                w = '0'.code
            }
        }
        if (p1 >= 0 || p2 >= 0) {
            return 1
        }
        var low = 2
        var high = s.length
        var ans = 0
        val n = s.length
        while (low <= high) {
            val mid = (low + high) / 2
            val arr = s.toCharArray()
            var p = ops
            var c = 1
            for (i in 1..<n) {
                if (arr[i] == arr[i - 1]) {
                    c++
                } else {
                    c = 1
                }
                if (c > mid) {
                    if (arr[i - 1] == '0') {
                        arr[i - 1] = '1'
                    } else {
                        arr[i - 1] = '0'
                    }
                    p--
                    c = 0
                }
            }
            if (p < 0) {
                low = mid + 1
            } else {
                ans = mid
                high = mid - 1
            }
        }
        return ans
    }
}
