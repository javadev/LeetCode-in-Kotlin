package g1201_1300.s1253_reconstruct_a_2_row_binary_matrix

// #Medium #Array #Greedy #Matrix
class Solution {
    fun reconstructMatrix(upper: Int, lower: Int, colsum: IntArray): List<MutableList<Int>> {
        val res: MutableList<MutableList<Int>> = ArrayList()
        val n = colsum.size
        val upperRow = IntArray(n)
        val lowerRow = IntArray(n)
        var currentUpperSum = 0
        var currentLowerSum = 0
        for (i in 0 until n) {
            if (colsum[i] >= 1) {
                upperRow[i] = 1
                lowerRow[i] = 1
                currentUpperSum++
                currentLowerSum++
            }
        }
        for (i in 0 until n) {
            if (colsum[i] == 1 && currentUpperSum > upper) {
                currentUpperSum--
                upperRow[i] = 0
            }
        }
        for (i in upperRow.indices) {
            if (colsum[i] == 1 && upperRow[i] == 1) {
                currentLowerSum--
                lowerRow[i] = 0
            }
        }
        if (currentUpperSum != upper || currentLowerSum != lower) {
            return res
        }
        res.add(ArrayList())
        res.add(ArrayList())
        for (i in 0 until n) {
            res[0].add(upperRow[i])
            res[1].add(lowerRow[i])
        }
        return res
    }
}
