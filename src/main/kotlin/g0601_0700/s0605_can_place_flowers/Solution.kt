package g0601_0700.s0605_can_place_flowers

// #Easy #Array #Greedy #Udemy_Arrays #2023_02_03_Time_209_ms_(85.71%)_Space_37.3_MB_(71.43%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var n = n
        for (i in flowerbed.indices) {
            if (flowerbed[i] == 0 && n > 0) {
                val left = i == 0 || flowerbed[i - 1] == 0
                val right = i == flowerbed.size - 1 || flowerbed[i + 1] == 0
                if (left && right) {
                    flowerbed[i] = 1
                    n--
                }
            }
            if (n == 0) {
                break
            }
        }
        return n == 0
    }
}
