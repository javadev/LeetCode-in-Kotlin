package g0901_1000.s0917_reverse_only_letters

// #Easy #String #Two_Pointers #2023_04_16_Time_126_ms_(100.00%)_Space_33.6_MB_(94.44%)

class Solution {
    fun reverseOnlyLetters(s: String): String {
        val array = s.toCharArray()
        var i = 0
        var j = array.size - 1
        while (i < j) {
            if (Character.isLetter(array[i]) && Character.isLetter(array[j])) {
                val temp = array[i]
                array[i++] = array[j]
                array[j--] = temp
            } else if (Character.isLetter(array[i])) {
                j--
            } else if (Character.isLetter(array[j])) {
                i++
            } else {
                i++
                j--
            }
        }
        return String(array)
    }
}
