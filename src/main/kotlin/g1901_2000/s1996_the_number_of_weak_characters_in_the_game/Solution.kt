package g1901_2000.s1996_the_number_of_weak_characters_in_the_game

import java.util.Arrays

// #Medium #Array #Sorting #Greedy #Stack #Monotonic_Stack
class Solution {
    fun numberOfWeakCharacters(properties: Array<IntArray>): Int {
        Arrays.sort(properties) { a: IntArray, b: IntArray -> if (a[0] == b[0]) b[1] - a[1] else a[0] - b[0] }
        var max = properties[properties.size - 1][1]
        var count = 0
        for (i in properties.size - 2 downTo 0) {
            if (properties[i][1] < max) {
                count++
            }
            max = Math.max(max, properties[i][1])
        }
        return count
    }
}
