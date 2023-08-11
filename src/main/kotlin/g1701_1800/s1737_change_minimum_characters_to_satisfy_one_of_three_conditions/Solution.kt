package g1701_1800.s1737_change_minimum_characters_to_satisfy_one_of_three_conditions

// #Medium #String #Hash_Table #Prefix_Sum #Counting
// #2023_06_16_Time_240_ms_(100.00%)_Space_38.5_MB_(100.00%)

class Solution {
    fun minCharacters(a: String, b: String): Int {
        val array1 = IntArray(26)
        val array2 = IntArray(26)
        val l1: Int = a.length
        val l2: Int = b.length
        for (i: Char in a.toCharArray()) {
            array1[i.code - 'a'.code]++
        }
        for (i: Char in b.toCharArray()) {
            array2[i.code - 'a'.code]++
        }
        var min: Int = Int.MAX_VALUE
        var t1 = 0
        var t2 = 0
        var max: Int = -1
        for (i in 0..24) {
            t1 += array1[i]
            t2 += array2[i]
            min = Math.min(min, Math.min(t1 + l2 - t2, t2 + l1 - t1))
            max = Math.max(max, array1[i] + array2[i])
        }
        max = Math.max(max, array1[25] + array2[25])
        return Math.min(min, l1 + l2 - max)
    }
}
