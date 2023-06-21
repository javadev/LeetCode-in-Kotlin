package g1801_1900.s1881_maximum_value_after_insertion

// #Medium #String #Greedy
class Solution {
    fun maxValue(n: String, x: Int): String {
        var i = 0
        val sign = if (n[0] == '-') -1 else 1
        while (i < n.length) {
            if (n[i] != '-' && sign * (n[i].code - '0'.code) < sign * x) {
                break
            }
            i++
        }
        return n.substring(0, i) + x + n.substring(i)
    }
}
