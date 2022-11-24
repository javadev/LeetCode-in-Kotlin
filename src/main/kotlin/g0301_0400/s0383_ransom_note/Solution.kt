package g0301_0400.s0383_ransom_note

// #Easy #String #Hash_Table #Counting #Data_Structure_I_Day_6_String
// #2022_11_24_Time_333_ms_(79.58%)_Space_45.2_MB_(75.39%)

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val a = IntArray(26)
        var n = ransomNote.length
        for (i in 0 until n) {
            a[ransomNote[i].toInt() - 97]++
        }
        var i = 0
        while (i < magazine.length && n != 0) {
            if (a[magazine[i].toInt() - 97] > 0) {
                n--
                a[magazine[i].toInt() - 97]--
            }
            i++
        }
        return n == 0
    }
}
