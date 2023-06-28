package g2201_2300.s2262_total_appeal_of_a_string

// #Hard #String #Hash_Table #Dynamic_Programming
class Solution {
    fun appealSum(s: String): Long {
        val len = s.length
        val lastPos = IntArray(26)
        lastPos.fill(-1)
        var res: Long = 0
        for (i in 0 until len) {
            val idx = s[i].code - 'a'.code
            res += ((i - lastPos[idx]) * (len - i)).toLong()
            lastPos[idx] = i
        }
        return res
    }
}
