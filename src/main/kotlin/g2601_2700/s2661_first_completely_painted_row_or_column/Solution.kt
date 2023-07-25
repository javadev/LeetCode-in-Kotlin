package g2601_2700.s2661_first_completely_painted_row_or_column

// #Medium #Array #Hash_Table #Matrix #2023_07_25_Time_901_ms_(100.00%)_Space_73.6_MB_(83.33%)

class Solution {
    fun firstCompleteIndex(arr: IntArray, mat: Array<IntArray>): Int {
        val map: HashMap<Int, Int> = HashMap()
        var ans = mat.size * mat[0].size
        for (i in arr.indices) {
            map.put(arr[i], i)
        }
        for (i in mat.indices) {
            var maxV = 0
            for (j in mat[0].indices) {
                maxV = maxV.coerceAtLeast(map.get(mat[i][j])!!)
            }
            ans = ans.coerceAtMost(maxV)
        }
        for (i in mat[0].indices) {
            var maxV = 0
            for (j in mat.indices) {
                maxV = maxV.coerceAtLeast(map.get(mat[j][i])!!)
            }
            ans = ans.coerceAtMost(maxV)
        }
        return ans
    }
}
