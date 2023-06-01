package g0601_0700.s0696_count_binary_substrings

// #Easy #String #Two_Pointers #2023_02_21_Time_222_ms_(100.00%)_Space_36.5_MB_(55.56%)

class Solution {
    fun countBinarySubstrings(s: String): Int {
        var start = 0
        var ans = 0
        val arr = s.toCharArray()
        for (i in 1 until arr.size) {
            if (arr[i] != arr[i - 1]) {
                ans++
                start = i - 1
            } else if (start > 0 && arr[--start] != arr[i]) {
                // if start isn't 0, we may still have a valid substring
                ans++
            } else {
                // if not, then reset start to 0
                start = 0
            }
        }
        return ans
    }
}
