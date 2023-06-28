package g2201_2300.s2251_number_of_flowers_in_full_bloom

// #Hard #Array #Hash_Table #Sorting #Binary_Search #Prefix_Sum #Ordered_Set
// #2023_06_28_Time_973_ms_(100.00%)_Space_88.6_MB_(100.00%)

import java.util.Arrays
import java.util.PriorityQueue

class Solution {
    fun fullBloomFlowers(flowers: Array<IntArray>, persons: IntArray): IntArray {
        Arrays.sort(flowers, { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) })
        val ans = IntArray(persons.size)
        val pq = PriorityQueue({ a: Pair, b: Pair -> a.j.compareTo(b.j) })
        var j = 0
        val t = Array(persons.size) { IntArray(2) }
        for (i in persons.indices) {
            t[i][0] = persons[i]
            t[i][1] = i
        }
        Arrays.sort(t, { a: IntArray, b: IntArray -> a[0].compareTo(b[0]) })
        for (ints in t) {
            while (pq.isNotEmpty()) {
                if (pq.peek().j < ints[0]) {
                    pq.poll()
                } else {
                    break
                }
            }
            while (j < flowers.size) {
                if (flowers[j][0] <= ints[0] && flowers[j][1] >= ints[0]) {
                    pq.add(Pair(flowers[j][0], flowers[j][1]))
                    j++
                    continue
                }
                if (flowers[j][1] < ints[0]) {
                    j++
                    continue
                }
                break
            }
            ans[ints[1]] = pq.size
        }
        return ans
    }

    private class Pair(var i: Int, var j: Int)
}
