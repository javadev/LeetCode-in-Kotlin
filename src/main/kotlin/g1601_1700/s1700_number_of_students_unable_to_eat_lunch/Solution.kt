package g1601_1700.s1700_number_of_students_unable_to_eat_lunch

// #Easy #Array #Stack #Simulation #Queue #2023_06_15_Time_143_ms_(100.00%)_Space_34.6_MB_(78.57%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val studentsQueue: Queue<Int> = LinkedList()
        val sandwichesQueue: Queue<Int> = LinkedList()
        for (i in sandwiches.indices) {
            studentsQueue.add(students[i])
            sandwichesQueue.add(sandwiches[i])
        }
        do {
            if (studentsQueue.isNotEmpty()) {
                if (studentsQueue.peek() == sandwichesQueue.peek()) {
                    studentsQueue.poll()
                    sandwichesQueue.poll()
                } else {
                    if (!studentsQueue.contains(sandwichesQueue.peek())) {
                        break
                    }
                    studentsQueue.add(studentsQueue.poll())
                }
            }
        } while (studentsQueue.isNotEmpty())
        return studentsQueue.size
    }
}
