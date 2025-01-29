package g0001_0100.s0011_container_with_most_water

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Greedy #Two_Pointers
// #Algorithm_II_Day_4_Two_Pointers #Top_Interview_150_Two_Pointers #Big_O_Time_O(n)_Space_O(1)
// #2023_07_03_Time_402_ms_(78.57%)_Space_52.1_MB_(77.51%)

class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        if (height.isNotEmpty()) {
            var left = 0
            var right = height.size - 1
            while (left < right) {
                // next two if conditions are to make sure there are two non-zero containers to
                // hold water. If not move next to find one
                if (height[left] == 0) {
                    left++
                    continue
                }
                if (height[right] == 0) {
                    right--
                    continue
                }
                // if control came here that means left and right containers are non zero and
                // can hold water. Get the count of containers and multiple by lower container
                if (height[left] < height[right]) {
                    max = Math.max(max, (right - left) * height[left])
                    left++
                } else {
                    max = Math.max(max, (right - left) * height[right])
                    right--
                }
            }
        }
        return max
    }
}
