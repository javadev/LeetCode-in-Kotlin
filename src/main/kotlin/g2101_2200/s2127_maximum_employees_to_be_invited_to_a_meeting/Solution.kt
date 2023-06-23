package g2101_2200.s2127_maximum_employees_to_be_invited_to_a_meeting

import java.util.ArrayDeque

// #Hard #Depth_First_Search #Graph #Topological_Sort
class Solution {
    fun maximumInvitations(fav: IntArray): Int {
        val len = fav.size
        val follow = IntArray(len)
        for (k in fav) {
            follow[k]++
        }
        val pathlen = IntArray(len)
        val visit = BooleanArray(len)
        val q = ArrayDeque<Int>()
        for (i in 0 until len) {
            if (follow[i] == 0) {
                q.offer(i)
            }
        }
        while (q.isNotEmpty()) {
            val i = q.poll()
            val j = fav[i]
            visit[i] = true
            pathlen[j] = Math.max(pathlen[j], pathlen[i] + 1)
            if (--follow[j] == 0) {
                q.offer(j)
            }
        }
        var maxCycle = 0
        var sumPath = 0
        var i = 0
        while (i < len) {
            if (visit[i]) {
                i++
            }
            var clen = 0
            while (!visit[i]) {
                clen++
                visit[i] = true
                i = fav[i]
            }
            if (clen == 2) {
                sumPath += pathlen[i] + pathlen[fav[i]] + 2
            } else {
                maxCycle = Math.max(maxCycle, clen)
            }
            i++
        }
        return Math.max(maxCycle, sumPath)
    }
}
