package g2501_2600.s2566_maximum_difference_by_remapping_a_digit

// #Easy #Math #Greedy #2023_07_08_Time_125_ms_(100.00%)_Space_34.1_MB_(100.00%)

class Solution {
    fun minMaxDifference(num: Int): Int {
        val org = num.toString()

        val helper = { want: Char ->
            val firstCharNot = org.firstOrNull {
                it != want
            }
            if (firstCharNot == null) {
                num
            } else {
                org.replace(firstCharNot, want).toInt()
            }
        }

        return helper('9') - helper('0')
    }
}
