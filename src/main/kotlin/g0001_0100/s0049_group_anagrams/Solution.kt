package g0001_0100.s0049_group_anagrams

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #String #Hash_Table #Sorting
// #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11 #Udemy_Strings
// #Top_Interview_150_Hashmap #Big_O_Time_O(n*k_log_k)_Space_O(n)
// #2023_07_05_Time_308_ms_(96.34%)_Space_43.3_MB_(81.41%)

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hm: MutableMap<String, MutableList<String>> = HashMap()
        for (s in strs) {
            val ch = s.toCharArray()
            ch.sort()
            val temp = String(ch)
            hm.computeIfAbsent(
                temp,
            ) { _: String? -> ArrayList() }
            hm.getValue(temp).add(s)
        }
        return ArrayList<List<String>>(hm.values)
    }
}
