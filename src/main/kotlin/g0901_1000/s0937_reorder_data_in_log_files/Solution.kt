package g0901_1000.s0937_reorder_data_in_log_files

// #Easy #Array #String #Sorting #2023_04_28_Time_205_ms_(81.82%)_Space_44_MB_(9.09%)

class Solution {
    fun reorderLogFiles(logs: Array<String>): Array<String?> {
        val digi: MutableList<String> = ArrayList()
        val word: MutableList<String> = ArrayList()
        for (s in logs) {
            if (Character.isDigit(s[s.length - 1])) digi.add(s) else word.add(s)
        }
        word.sortWith { s1, s2 ->
            val firstSpacePosition = s1.indexOf(" ")
            val firstWord = s1.substring(firstSpacePosition, s1.length)
            val secondSpacePosition = s2.indexOf(" ")
            val secondWord = s2.substring(secondSpacePosition, s2.length)
            if (firstWord.compareTo(secondWord) == 0) {
                val firstSpacePosition1 = s1.indexOf(" ")
                val firstWord1 = s1.substring(0, firstSpacePosition1)
                val secondSpacePosition1 = s2.indexOf(" ")
                val secondWord1 = s2.substring(0, secondSpacePosition1)
                return@sortWith firstWord1.compareTo(secondWord1)
            }
            firstWord.compareTo(secondWord)
        }

        val result = arrayOfNulls<String>(digi.size + word.size)
        var `in` = 0
        for (s in word) result[`in`++] = s
        for (s in digi) result[`in`++] = s
        return result
    }
}
