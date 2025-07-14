package g3601_3700.s3613_minimize_maximum_component_cost

// #Medium #Binary_Search #Graph #Union_Find #Sort
// #2025_07_14_Time_34_ms_(100.00%)_Space_134.64_MB_(44.44%)

import kotlin.math.max

class Solution {
    fun minCost(ui: Int, pl: Array<IntArray>, zx: Int): Int {
        var rt = 0
        var gh = 0
        var i = 0
        while (i < pl.size) {
            gh = max(gh, pl[i][2])
            i++
        }
        while (rt < gh) {
            val ty = rt + (gh - rt) / 2
            if (dfgh(ui, pl, ty, zx)) {
                gh = ty
            } else {
                rt = ty + 1
            }
        }
        return rt
    }

    private fun dfgh(ui: Int, pl: Array<IntArray>, jk: Int, zx: Int): Boolean {
        val wt = IntArray(ui)
        var i = 0
        while (i < ui) {
            wt[i] = i
            i++
        }
        var er = ui
        i = 0
        while (i < pl.size) {
            val df = pl[i]
            if (df[2] > jk) {
                i++
                continue
            }
            val u = cvb(wt, df[0])
            val v = cvb(wt, df[1])
            if (u != v) {
                wt[u] = v
                er--
            }
            i++
        }
        return er <= zx
    }

    private fun cvb(wt: IntArray, i: Int): Int {
        var i = i
        while (wt[i] != i) {
            wt[i] = wt[wt[i]]
            i = wt[i]
        }
        return i
    }
}
