package g0001_0100.s0042_trapping_rain_water

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming #Two_Pointers
// #Stack #Monotonic_Stack #Dynamic_Programming_I_Day_9 #Udemy_Two_Pointers
// #Big_O_Time_O(n)_Space_O(1) #2023_07_05_Time_189_ms_(99.37%)_Space_39.4_MB_(81.90%)

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
