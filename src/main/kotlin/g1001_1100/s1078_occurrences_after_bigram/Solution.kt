package g1001_1100.s1078_occurrences_after_bigram

// #Easy #String #2023_06_01_Time_151_ms_(88.24%)_Space_36.5_MB_(70.59%)

class Solution {
    fun findOcurrences(text: String, first: String, second: String): Array<String?> {
        val list: MutableList<String> = ArrayList()
        val str = text.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in str.indices) {
            if (str[i] == first && str.size - 1 >= i + 2 && str[i + 1] == second) {
                list.add(str[i + 2])
            }
        }
        val s = arrayOfNulls<String>(list.size)
        var j = 0
        for (ele in list) {
            s[j++] = ele
        }
        return s
    }
}
