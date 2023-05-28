package g1001_1100.s1047_remove_all_adjacent_duplicates_in_string

// #Easy #String #Stack #2023_05_28_Time_228_ms_(94.52%)_Space_50.5_MB_(54.79%)

class Solution {
    fun removeDuplicates(s: String): String {
        if (s.length == 1) {
            return s
        }
        val array = s.toCharArray()
        val length = array.size
        var fast = 0
        var slow = 0
        while (fast < length) {
            if (slow == 0 || array[fast] != array[slow - 1]) {
                array[slow++] = array[fast++]
            } else {
                if (array[fast] == array[slow - 1]) {
                    fast++
                }
                slow--
            }
        }
        return String(array, 0, slow)
    }
}
