package g0001_0100.s0049_group_anagrams

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #String #Hash_Table #Sorting
// #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11 #Udemy_Strings
// #2022_08_29_Time_506_ms_(86.55%)_Space_72.5_MB_(81.04%)

import java.util.Arrays

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val hm: MutableMap<String, MutableList<String>> = HashMap()
        for (s in strs) {
            val ch = s.toCharArray()
            Arrays.sort(ch)
            val temp = String(ch)
            hm.computeIfAbsent(
                temp
            ) { _: String? -> ArrayList() }
            hm[temp]!!.add(s)
        }
        return ArrayList<List<String>>(hm.values)
    }
}
