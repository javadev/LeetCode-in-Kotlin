package g1801_1900.s1898_maximum_number_of_removable_characters

// #Medium #Array #String #Binary_Search #Binary_Search_II_Day_6
class Solution {
    fun maximumRemovals(s: String?, p: String, removable: IntArray): Int {
        if (s == null || s.length == 0) {
            return 0
        }
        // binary search for the k which need to be removed
        val convertedS = s.toCharArray()
        var left = 0
        var right = removable.size - 1
        while (left <= right) {
            val middle = (left + right) / 2
            // remove letters from 0 to mid by changing it into some other non letters
            for (i in 0..middle) {
                convertedS[removable[i]] = '?'
            }
            // if it is still subsequence change left boundary
            // else replace all removed ones and change right boundary
            if (isSubsequence(convertedS, p)) {
                left = middle + 1
            } else {
                for (i in 0..middle) {
                    convertedS[removable[i]] = s[removable[i]]
                }
                right = middle - 1
            }
        }
        return left
    }

    // simple check for subsequence
    private fun isSubsequence(convertedS: CharArray, p: String): Boolean {
        var p1 = 0
        var p2 = 0
        while (p1 < convertedS.size && p2 < p.length) {
            if (convertedS[p1] != '?' && convertedS[p1] == p[p2]) {
                p2 += 1
            }
            p1 += 1
        }
        return p2 == p.length
    }
}
