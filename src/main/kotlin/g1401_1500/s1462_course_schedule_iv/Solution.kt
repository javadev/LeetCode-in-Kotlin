package g1401_1500.s1462_course_schedule_iv

import java.util.LinkedList
import java.util.Queue

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Topological_Sort
class Solution {
    fun checkIfPrerequisite(
        numCourses: Int,
        prerequisites: Array<IntArray>,
        queries: Array<IntArray>
    ): List<Boolean> {
        val m: MutableMap<Int, MutableList<Int>> = HashMap()
        val ind = IntArray(numCourses)
        for (p in prerequisites) {
            m.computeIfAbsent(p[1]) { _: Int? -> ArrayList() }.add(p[0])
            ind[p[0]]++
        }
        val r = Array(numCourses) { BooleanArray(numCourses) }
        val q: Queue<Int> = LinkedList()
        for (i in 0 until numCourses) {
            if (ind[i] == 0) {
                q.add(i)
            }
        }
        while (q.isNotEmpty()) {
            val j = q.poll()
            for (k in m.getOrDefault(j, ArrayList<Int>())) {
                r[k][j] = true
                for (l in r.indices) {
                    if (r[j][l]) {
                        r[k][l] = true
                    }
                }
                ind[k]--
                if (ind[k] == 0) {
                    q.offer(k)
                }
            }
        }
        val a: MutableList<Boolean> = ArrayList()
        for (qr in queries) {
            a.add(r[qr[0]][qr[1]])
        }
        return a
    }
}
