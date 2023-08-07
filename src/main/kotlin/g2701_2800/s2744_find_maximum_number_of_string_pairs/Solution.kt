package g2701_2800.s2744_find_maximum_number_of_string_pairs

// #Easy #Array #String #Hash_Table #Simulation
// #2023_08_07_Time_162_ms_(96.81%)_Space_36.4_MB_(85.11%)

class Solution {
    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        val set: MutableSet<String> = HashSet()
        var cnt = 0
        for (s in words) {
            val sb = StringBuilder(s).reverse()
            if (set.contains(sb.toString())) {
                cnt++
            } else {
                set.add(s)
            }
        }
        return cnt
    }
}
