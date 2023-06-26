package g2201_2300.s2244_minimum_rounds_to_complete_all_tasks

// #Medium #Array #Hash_Table #Greedy #Counting
class Solution {
    fun minimumRounds(tasks: IntArray): Int {
        tasks.sort()
        var rounds = 0
        var c = 1
        for (i in 0 until tasks.size - 1) {
            if (tasks[i] == tasks[i + 1]) {
                c++
            } else {
                if (c == 1) {
                    return -1
                }
                if (c % 3 == 0) {
                    rounds += c / 3
                }
                if (c % 3 >= 1) {
                    rounds += c / 3 + 1
                }
                c = 1
            }
        }
        if (c == 1) {
            return -1
        }
        if (c % 3 == 0) {
            rounds += c / 3
        }
        if (c % 3 >= 1) {
            rounds += c / 3 + 1
        }
        return rounds
    }
}
