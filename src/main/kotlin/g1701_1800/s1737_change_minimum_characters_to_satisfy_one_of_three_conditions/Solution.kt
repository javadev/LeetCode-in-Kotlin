package g1701_1800.s1737_change_minimum_characters_to_satisfy_one_of_three_conditions

// #Medium #String #Hash_Table #Prefix_Sum #Counting
class Solution {
    fun minCharacters(s1: String, s2: String): Int {
        val a: IntArray = IntArray(26)
        val b: IntArray = IntArray(26)
        val l1: Int = s1.length
        val l2: Int = s2.length
        for (i: Char in s1.toCharArray()) {
            a[i.code - 'a'.code]++
        }
        for (i: Char in s2.toCharArray()) {
            b[i.code - 'a'.code]++
        }
        var min: Int = Int.MAX_VALUE
        var t1: Int = 0
        var t2: Int = 0
        var max: Int = -1
        for (i in 0..24) {
            t1 += a.get(i)
            t2 += b.get(i)
            min = Math.min(min, Math.min(t1 + l2 - t2, t2 + l1 - t1))
            max = Math.max(max, a.get(i) + b.get(i))
        }
        max = Math.max(max, a.get(25) + b.get(25))
        return Math.min(min, l1 + l2 - max)
    }
}
