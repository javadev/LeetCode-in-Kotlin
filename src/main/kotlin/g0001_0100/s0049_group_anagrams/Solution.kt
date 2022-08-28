package g0001_0100.s0049_group_anagrams

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #String #Hash_Table #Sorting
// #Data_Structure_II_Day_8_String #Programming_Skills_II_Day_11 #Udemy_Strings
// #2022_08_28_Time_554_ms_(82.47%)_Space_74.6_MB_(66.07%)

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) {
            return emptyList()
        }
        val hashMap = hashMapOf<String, MutableList<String>>()
        for (i in strs.indices) {
            val charArray = strs[i].toCharArray()
            charArray.sort()
            val sortedWord = String(charArray)
            if (hashMap.containsKey(sortedWord)) {
                hashMap[sortedWord]?.let {
                    it.add(strs[i])
                    hashMap[sortedWord] = it
                }
            } else {
                val list = mutableListOf<String>()
                list.add(strs[i])
                hashMap[sortedWord] = list
            }
        }
        val list = mutableListOf<List<String>>()
        hashMap.values.forEach {
            list.add(it)
        }
        return list
    }
}
