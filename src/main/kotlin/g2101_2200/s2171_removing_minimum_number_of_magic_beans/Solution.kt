package g2101_2200.s2171_removing_minimum_number_of_magic_beans

// #Medium #Array #Sorting #Prefix_Sum
class Solution {
    fun minimumRemoval(beans: IntArray): Long {
        beans.sort()
        val n = beans.size
        var sum: Long = 0
        for (bean in beans) {
            sum += bean.toLong()
        }
        var minbeans = Long.MAX_VALUE
        var prefix: Long = 0
        var suffix: Long
        var count: Long
        for (i in 0 until n) {
            prefix += beans[i].toLong()
            suffix = sum - prefix
            count = prefix - beans[i] + (suffix - beans[i] * (n - i - 1L))
            if (count < minbeans) {
                minbeans = count
            }
        }
        return minbeans
    }
}
