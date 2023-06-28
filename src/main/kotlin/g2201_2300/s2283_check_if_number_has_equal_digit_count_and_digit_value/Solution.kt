package g2201_2300.s2283_check_if_number_has_equal_digit_count_and_digit_value

// #Easy #String #Hash_Table #Counting #2023_06_28_Time_136_ms_(100.00%)_Space_34_MB_(75.00%)

class Solution {
    fun digitCount(num: String): Boolean {
        val cnt = IntArray(11)
        val arr = num.toCharArray()
        for (d in arr) {
            ++cnt[d.code - '0'.code]
        }
        for (i in arr.indices) {
            if (cnt[i] != arr[i].code - '0'.code) {
                return false
            }
        }
        return true
    }
}
