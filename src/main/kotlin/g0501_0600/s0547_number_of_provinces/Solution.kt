package g0501_0600.s0547_number_of_provinces

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_8_Standard_Traversal #Level_2_Day_19_Union_Find
// #2023_01_17_Time_229_ms_(79.73%)_Space_43_MB_(66.22%)

import java.util.Arrays

class Solution {
    fun findCircleNum(arr: Array<IntArray>): Int {
        val parent = IntArray(arr.size)
        Arrays.fill(parent, -1)
        var ans = 0
        for (i in 0 until arr.size - 1) {
            for (j in i + 1 until arr[i].size) {
                if (arr[i][j] == 1) {
                    ans += union(i, j, parent)
                }
            }
        }
        return arr.size - ans
    }

    private fun union(a: Int, b: Int, arr: IntArray): Int {
        val ga = find(a, arr)
        val gb = find(b, arr)
        if (ga != gb) {
            arr[gb] = ga
            return 1
        }
        return 0
    }

    private fun find(a: Int, arr: IntArray): Int {
        if (arr[a] == -1) {
            return a
        }
        arr[a] = find(arr[a], arr)
        return arr[a]
    }
}
