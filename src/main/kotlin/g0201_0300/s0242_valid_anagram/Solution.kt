package g0201_0300.s0242_valid_anagram

// #Easy #Top_Interview_Questions #String #Hash_Table #Sorting #Data_Structure_I_Day_6_String
// #Programming_Skills_I_Day_11_Containers_and_Libraries #Udemy_Strings
// #2022_10_27_Time_251_ms_(87.65%)_Space_39.1_MB_(69.49%)

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val counter = IntArray(26)
        for (i in 0 until s.length) {
            counter[s[i] - 'a']++
            counter[t[i] - 'a']--
        }
        for (count in counter) {
            if (count != 0) {
                return false
            }
        }
        return true
    }
}
