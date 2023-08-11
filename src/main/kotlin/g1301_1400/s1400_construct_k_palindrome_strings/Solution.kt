package g1301_1400.s1400_construct_k_palindrome_strings

// #Medium #String #Hash_Table #Greedy #Counting
// #2023_06_06_Time_204_ms_(90.00%)_Space_37.3_MB_(80.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun canConstruct(s: String, k: Int): Boolean {
        var k = k
        if (s.length == k) {
            // if size is same as k we can separate out all letters
            return true
        }
        if (s.length < k) {
            // if size is less than it is not possible
            return false
        }
        // count occurrence of each letter
        val count = IntArray(26)
        for (curr in s.toCharArray()) {
            count[curr.code - 'a'.code]++
        }
        // reduce k whenever count is odd
        for (i in 0..25) {
            if (count[i] % 2 != 0) {
                k--
            }
        }
        // we can have max k odd characters
        return k >= 0
    }
}
