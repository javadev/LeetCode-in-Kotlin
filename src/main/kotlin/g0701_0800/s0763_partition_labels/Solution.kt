package g0701_0800.s0763_partition_labels

// #Medium #Top_100_Liked_Questions #String #Hash_Table #Greedy #Two_Pointers
// #Data_Structure_II_Day_7_String #2022_09_13_Time_235_ms_(84.75%)_Space_35.2_MB_(91.53%)

class Solution {
    fun partitionLabels(s: String): List<Int> {
        val letters = s.toCharArray()
        val result: MutableList<Int> = ArrayList()
        val position = IntArray(26)
        for (i in letters.indices) {
            position[letters[i] - 'a'] = i
        }
        var i = 0
        var prev = -1
        var max = 0
        while (i < letters.size) {
            if (position[letters[i] - 'a'] > max) {
                max = position[letters[i] - 'a']
            }
            if (i == max) {
                result.add(i - prev)
                prev = i
            }
            i++
        }
        return result
    }
}
