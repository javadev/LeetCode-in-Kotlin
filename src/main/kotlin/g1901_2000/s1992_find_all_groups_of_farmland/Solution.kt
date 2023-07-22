package g1901_2000.s1992_find_all_groups_of_farmland

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #2023_06_21_Time_768_ms_(100.00%)_Space_63.4_MB_(100.00%)

class Solution {
    private val res: MutableList<IntArray> = ArrayList()
    fun findFarmland(land: Array<IntArray>): Array<IntArray> {
        if (land.isEmpty()) {
            return arrayOf()
        }
        val m = land.size
        val n = land[0].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (land[i][j] == 1) {
                    val dirs = IntArray(4)
                    dirs[0] = i
                    dirs[1] = j
                    dirs[2] = i
                    dirs[3] = j
                    dfs(land, i, j, dirs)
                    res.add(dirs)
                }
            }
        }
        return res.toTypedArray<IntArray>()
    }

    private fun dfs(land: Array<IntArray>, i: Int, j: Int, dirs: IntArray) {
        if (i < 0 || i >= land.size || j < 0 || j >= land[0].size || land[i][j] != 1) {
            return
        }
        land[i][j] = -1
        dfs(land, i + 1, j, dirs)
        dfs(land, i, j + 1, dirs)
        dirs[0] = Math.min(dirs[0], i)
        dirs[1] = Math.min(dirs[1], j)
        dirs[2] = Math.max(dirs[2], i)
        dirs[3] = Math.max(dirs[3], j)
    }
}
