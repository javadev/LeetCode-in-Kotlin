package g0801_0900.s0881_boats_to_save_people

// #Medium #Array #Sorting #Greedy #Two_Pointers
// #2023_04_08_Time_370_ms_(96.07%)_Space_44.8_MB_(99.70%)

import java.util.Arrays

class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        Arrays.sort(people)
        var i = 0
        var j = people.size - 1
        var boats = 0
        while (i < j) {
            if (people[i] + people[j] <= limit) {
                boats++
                i++
                j--
            } else if (people[i] + people[j] > limit) {
                boats++
                j--
            }
        }
        return if (i == j) {
            boats + 1
        } else boats
    }
}
