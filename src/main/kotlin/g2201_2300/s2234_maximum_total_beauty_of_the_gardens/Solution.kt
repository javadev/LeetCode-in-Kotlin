package g2201_2300.s2234_maximum_total_beauty_of_the_gardens

// #Hard #Array #Sorting #Greedy #Binary_Search #Two_Pointers
class Solution {
    fun maximumBeauty(flowers: IntArray, newFlowers: Long, target: Int, full: Int, partial: Int): Long {
        val n = flowers.size
        val prefix = LongArray(n + 1)
        flowers.sort()
        for (i in 0 until n) {
            prefix[i + 1] = prefix[i] + Math.min(flowers[i], target)
        }
        var res: Long = 0
        var i = n - 1
        for (c in 0..n) {
            val remain = prefix[n] - prefix[n - c] + newFlowers - c * target.toLong()
            var min: Long = 0
            if (0 > remain) {
                break
            }
            i = Math.min(i, n - c - 1)
            while (0 <= i &&
                (
                    target <= flowers[i] ||
                        flowers[i] * (i + 1).toLong() - prefix[i + 1] > remain
                    )
            ) {
                i--
            }
            if (0 <= i) {
                val dif = flowers[i] * (i + 1).toLong() - prefix[i + 1]
                min = Math.min(target - 1L, flowers[i] + (remain - dif) / (i + 1))
                if (i + 1 < n - c) {
                    min = Math.min(min, flowers[i + 1].toLong())
                }
            }
            res = Math.max(res, c * full.toLong() + min * partial)
        }
        return res
    }
}
