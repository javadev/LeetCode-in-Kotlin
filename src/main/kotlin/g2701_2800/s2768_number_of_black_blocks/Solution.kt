package g2701_2800.s2768_number_of_black_blocks

// #Medium #Array #Hash_Table #Enumeration #2023_08_11_Time_719_ms_(100.00%)_Space_55.3_MB_(100.00%)

class Solution {
    fun countBlackBlocks(m: Int, n: Int, coordinates: Array<IntArray>): LongArray {
        val ans = LongArray(5)
        val count: MutableMap<Int, Int> = HashMap()
        for (coordinate in coordinates) {
            val x = coordinate[0]
            val y = coordinate[1]
            for (i in x until x + 2) {
                for (j in y until y + 2) {
                    if (i - 1 >= 0 && i < m && j - 1 >= 0 && j < n) {
                        count.merge(
                            i * n + j,
                            1,
                        ) { a: Int?, b: Int? -> Integer.sum(a!!, b!!) }
                    }
                }
            }
        }
        for (freq in count.values) {
            ++ans[freq]
        }
        ans[0] = (m - 1L) * (n - 1) - ans.sum()
        return ans
    }
}
