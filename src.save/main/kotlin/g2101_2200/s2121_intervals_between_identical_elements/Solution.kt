package g2101_2200.s2121_intervals_between_identical_elements

// #Medium #Array #Hash_Table #Prefix_Sum #2023_06_25_Time_1022_ms_(100.00%)_Space_70.9_MB_(100.00%)

class Solution {
    fun getDistances(arr: IntArray): LongArray {
        val n = arr.size
        val map: MutableMap<Int, MutableList<Int>> = HashMap()
        for (i in 0 until n) {
            var list = map[arr[i]]
            if (list == null) {
                list = ArrayList()
            }
            list.add(i)
            map[arr[i]] = list
        }
        val ans = LongArray(n)
        ans.fill(0)
        for (list in map.values) {
            var sum: Long = 0
            val first = list[0]
            for (i in 1 until list.size) {
                sum = sum + list[i] - first
            }
            ans[first] = sum
            var prevElements = 0
            var nextElements = list.size - 2
            for (i in 1 until list.size) {
                val diff = list[i] - list[i - 1]
                sum = sum + diff.toLong() * (prevElements - nextElements)
                ans[list[i]] = sum
                prevElements++
                nextElements--
            }
        }
        return ans
    }
}
