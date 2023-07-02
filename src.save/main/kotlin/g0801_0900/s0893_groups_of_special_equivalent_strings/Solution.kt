package g0801_0900.s0893_groups_of_special_equivalent_strings

// #Medium #Array #String #Hash_Table #2023_04_11_Time_141_ms_(100.00%)_Space_34.7_MB_(100.00%)

class Solution {
    fun numSpecialEquivGroups(words: Array<String>): Int {
        val set: HashSet<String> = HashSet()
        var result = 0
        for (str in words) {
            if (set.add(getHashBySwap(str.toCharArray()))) {
                result++
            }
        }
        return result
    }

    private fun getHashBySwap(chars: CharArray): String {
        for (i in chars.indices) {
            var j = i + 2
            while (j < chars.size) {
                if (chars[i] > chars[j]) {
                    val temp = chars[j]
                    chars[j] = chars[i]
                    chars[i] = temp
                }
                j += 2
            }
        }
        return String(chars)
    }
}
