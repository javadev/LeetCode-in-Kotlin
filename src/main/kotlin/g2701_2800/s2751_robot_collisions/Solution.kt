package g2701_2800.s2751_robot_collisions

// #Hard #Array #Sorting #Stack #Simulation
// #2023_08_09_Time_1049_ms_(100.00%)_Space_78.2_MB_(66.67%)

class Solution {
    fun survivedRobotsHealths(pos: IntArray, h: IntArray, dir: String): List<Int> {
        val a = Array(pos.size) { IntArray(4) { 0 } }
        for (i in pos.indices) {
            a[i][0] = pos[i]
            a[i][1] = h[i]
            a[i][2] = if (dir[i] == 'R') 1 else 0
            a[i][3] = i
        }
        a.sortWith(compareBy { it[0] })
        val q = ArrayDeque<Int>()
        for (i in a.indices) {
            if (q.isEmpty() || a[i][2] == 1) {
                q.push(i)
            } else {
                var prev = a[q.peek()]
                if (prev[2] == 1) {
                    if (a[i][1] == prev[1]) {
                        q.pop()
                        continue
                    } else {
                        while (true) {
                            if (a[i][1] == prev[1]) {
                                q.pop()
                                break
                            }
                            if (prev[1] > a[i][1]) {
                                prev[1] -= 1
                                break
                            } else {
                                q.pop()
                                a[i][1] -= 1
                                if (q.isEmpty() || a[q.peek()][2] == 0) {
                                    q.push(i)
                                    break
                                } else {
                                    prev = a[q.peek()]
                                }
                            }
                        }
                    }
                } else {
                    q.push(i)
                }
            }
        }
        val b = Array(q.size) { IntArray(2) { 0 } }
        var j = 0
        while (q.isNotEmpty()) {
            val n = q.pop()
            b[j][0] = a[n][1]
            b[j][1] = a[n][3]
            j++
        }
        b.sortWith(compareBy { it[1] })
        val res = mutableListOf<Int>()
        for (element in b) {
            res.add(element[0])
        }
        return res
    }
}
