package g2501_2600.s2512_reward_top_k_students

// #Medium #Array #String #Hash_Table #Sorting #Heap_Priority_Queue
// #2023_07_04_Time_691_ms_(100.00%)_Space_53.3_MB_(100.00%)

import java.util.PriorityQueue

@Suppress("NAME_SHADOWING")
class Solution {
    fun topStudents(
        positiveFeedback: Array<String>,
        negativeFeedback: Array<String>,
        report: Array<String>,
        studentId: IntArray,
        k: Int,
    ): List<Int> {
        var k = k
        val feedback = HashMap<String, Int>()
        for (s in positiveFeedback) {
            feedback[s] = 3
        }
        for (s in negativeFeedback) {
            feedback[s] = -1
        }
        val pq = PriorityQueue { a: Student, b: Student ->
            val result = Integer.compare(a.points, b.points)
            if (result == 0) Integer.compare(a.id, b.id) else -result
        }
        for (i in report.indices) {
            val split = report[i].split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            var sum = 0
            for (subStr in split) {
                sum += feedback.getOrDefault(subStr, 0)
            }
            pq.offer(Student(studentId[i], sum))
        }
        val result: MutableList<Int> = ArrayList()
        while (pq.isNotEmpty() && k-- > 0) {
            result.add(pq.poll().id)
        }
        return result
    }

    private class Student(var id: Int, var points: Int)
}
