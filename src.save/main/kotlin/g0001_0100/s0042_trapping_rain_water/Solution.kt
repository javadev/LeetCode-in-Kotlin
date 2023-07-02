package g0001_0100.s0042_trapping_rain_water

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming #Two_Pointers
// #Stack #Monotonic_Stack #Dynamic_Programming_I_Day_9 #Udemy_Two_Pointers
// #2022_08_27_Time_196_ms_(100.00%)_Space_36.9_MB_(98.52%)

class Solution {
    fun trap(height: IntArray): Int {
        val size = height.size
        var maxLeft = 0
        var maxRight = 0
        var totalWater = 0
        var leftPtr = 0
        var rightPtr = size - 1
        while (leftPtr < rightPtr) {
            if (height[leftPtr] <= height[rightPtr]) {
                if (maxLeft > height[leftPtr]) {
                    totalWater = totalWater + maxLeft - height[leftPtr]
                } else {
                    maxLeft = height[leftPtr]
                }
                ++leftPtr
            } else {
                if (maxRight > height[rightPtr]) {
                    totalWater = totalWater + maxRight - height[rightPtr]
                } else {
                    maxRight = height[rightPtr]
                }
                --rightPtr
            }
        }
        return totalWater
    }
}
