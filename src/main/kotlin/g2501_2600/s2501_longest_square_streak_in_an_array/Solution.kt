package g2501_2600.s2501_longest_square_streak_in_an_array

// #Medium #Array #Hash_Table #Dynamic_Programming #Sorting #Binary_Search
class Solution {
    fun longestSquareStreak(nums: IntArray): Int {
        var result = -1
        val max = 100000
        val isExisted = BooleanArray(max + 1)
        val isVisited = BooleanArray(max + 1)
        for (num in nums) {
            isExisted[num] = true
        }
        var i = 2
        while (i * i <= max) {
            if (!isExisted[i] || isVisited[i]) {
                i++
                continue
            }
            isVisited[i] = true
            var length = 1
            var j = i * i
            while (j >= 0 && j <= max && isExisted[j]) {
                isVisited[j] = true
                length++
                j = j * j
            }
            if (length > 1) {
                result = Math.max(result, length)
            }
            i++
        }
        return result
    }
}
