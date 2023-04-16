package g0901_1000.s0916_word_subsets

// #Medium #Array #String #Hash_Table #2023_04_16_Time_397_ms_(88.89%)_Space_45_MB_(55.56%)

class Solution {
    fun wordSubsets(words1: Array<String>, words2: Array<String>): List<String> {
        val l1: MutableList<String> = ArrayList()
        val target = IntArray(26)
        for (s1 in words2) {
            val temp = IntArray(26)
            for (ch1 in s1.toCharArray()) {
                temp[ch1.code - 'a'.code]++
                target[ch1.code - 'a'.code] =
                    target[ch1.code - 'a'.code].coerceAtLeast(temp[ch1.code - 'a'.code])
            }
        }
        for (s1 in words1) {
            val count = IntArray(26)
            for (ch1 in s1.toCharArray()) {
                count[ch1.code - 'a'.code]++
            }
            if (checkIt(target, count)) {
                l1.add(s1)
            }
        }
        return l1
    }

    private fun checkIt(target: IntArray, count: IntArray): Boolean {
        for (i in 0..25) {
            if (count[i] < target[i]) {
                return false
            }
        }
        return true
    }
}
