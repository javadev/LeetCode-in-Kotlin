package g1401_1500.s1450_number_of_students_doing_homework_at_a_given_time

// #Easy #Array
class Solution {
    fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var count = 0
        for (i in startTime.indices) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++
            }
        }
        return count
    }
}
