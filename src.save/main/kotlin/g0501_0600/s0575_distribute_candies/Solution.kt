package g0501_0600.s0575_distribute_candies

// #Easy #Array #Hash_Table #2023_01_23_Time_538_ms_(76.92%)_Space_47.3_MB_(69.23%)

class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        val s: MutableSet<Int> = HashSet()
        for (i in candyType) {
            if (!s.contains(i)) {
                s.add(i)
            }
        }
        val canEat = candyType.size / 2
        return if (s.size >= canEat) {
            canEat
        } else {
            s.size
        }
    }
}
