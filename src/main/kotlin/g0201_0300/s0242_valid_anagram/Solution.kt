package g0201_0300.s0242_valid_anagram

// #Easy #Top_Interview_Questions #String #Hash_Table #Sorting #Data_Structure_I_Day_6_String
// #Programming_Skills_I_Day_11_Containers_and_Libraries #Udemy_Strings
// #2022_07_05_Time_2_ms_(99.01%)_Space_42.4_MB_(91.86%)
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val charFreqMap = IntArray(26)
        for (c in s.toCharArray()) {
            charFreqMap[c.code - 'a'.code]++
        }
        for (c in t.toCharArray()) {
            if (charFreqMap[c.code - 'a'.code] == 0) {
                return false
            }
            charFreqMap[c.code - 'a'.code]--
        }
        return true
    }
}
