package g0901_1000.s0941_valid_mountain_array

// #Easy #Array #2023_04_29_Time_251_ms_(51.94%)_Space_55.5_MB_(7.75%)

class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        var i = 0
        var flag1 = false
        var flag2 = false
        while (i < arr.size - 1 && arr[i] < arr[i + 1]) {
            flag1 = true
            i++
        }
        while (i < arr.size - 1 && arr[i] > arr[i + 1]) {
            flag2 = true
            i++
        }
        if (i < arr.size - 1) {
            return false
        }
        return !(!flag1 || !flag2)
    }
}
