package g2201_2300.s2274_maximum_consecutive_floors_without_special_floors

// #Medium #Array #Sorting
class Solution {
    fun maxConsecutive(bottom: Int, top: Int, special: IntArray): Int {
        special.sort()
        var start = bottom
        var ans = 0
        for (j in special) {
            if (j - start > ans) {
                ans = j - start
                start = j + 1
            } else {
                start = j + 1
            }
        }
        if (ans < top - special[special.size - 1]) {
            ans = top - special[special.size - 1]
        }
        return ans
    }
}
