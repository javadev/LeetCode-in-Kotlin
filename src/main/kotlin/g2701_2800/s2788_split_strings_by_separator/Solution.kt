package g2701_2800.s2788_split_strings_by_separator

// #Easy #Array #String #2023_08_08_Time_314_ms_(85.45%)_Space_38_MB_(98.18%)

class Solution {
    fun splitWordsBySeparator(words: List<String>, separator: Char): List<String> {
        val list: MutableList<String> = ArrayList()
        for (str in words) {
            var si = 0
            for (i in str.indices) {
                if (str[i] == separator) {
                    if (i > si) {
                        list.add(str.substring(si, i))
                    }
                    si = i + 1
                }
            }
            if (si != str.length) {
                list.add(str.substring(si, str.length))
            }
        }
        return list
    }
}
