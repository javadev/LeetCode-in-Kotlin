package g1601_1700.s1665_minimum_initial_energy_to_finish_tasks

import java.util.Arrays

// #Hard #Array #Sorting #Greedy
class Solution {
    fun minimumEffort(tasks: Array<IntArray>): Int {
        Arrays.sort(tasks) { a: IntArray, b: IntArray -> a[1] - a[0] - b[1] + b[0] }
        var prev = 0
        for (item in tasks) {
            prev = Math.max(prev + item[0], item[1])
        }
        return prev
    }
}
