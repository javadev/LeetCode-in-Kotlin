package g3801_3900.s3890_integers_with_multiple_sum_of_two_cubes

// #Medium #Hash_Table #Sorting #Counting #Enumeration #Staff #Weekly_Contest_496
// #2026_08_13_Time_169_ms_(93.96%)_Space_154.93_MB_(48.99%)

class Solution {
    fun findGoodIntegers(n: Int): MutableList<Int> {
        val present: MutableSet<Int> = HashSet<Int>()
        val result: MutableSet<Int> = HashSet<Int>()
        for (i in 1..999) {
            val more = i * i * i
            for (j in 1..i) {
                val less = j * j * j
                val sum = more + less
                if (sum <= n) {
                    if (present.contains(sum)) {
                        result.add(sum)
                    } else {
                        present.add(sum)
                    }
                } else {
                    break
                }
            }
        }
        val ret: MutableList<Int> = ArrayList<Int>(result)
        ret.sort()
        return ret
    }
}
