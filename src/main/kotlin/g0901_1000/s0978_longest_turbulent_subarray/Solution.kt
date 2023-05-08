package g0901_1000.s0978_longest_turbulent_subarray

// #Medium #Array #Dynamic_Programming #Sliding_Window
// #2023_05_08_Time_395_ms_(40.00%)_Space_88.5_MB_(40.00%)

class Solution {
    fun maxTurbulenceSize(arr: IntArray): Int {
        val n = arr.size
        var ans = 1
        var l: Int
        if (n == 1) {
            return 1
        }
        if (n == 2) {
            return if (arr[0] == arr[1]) 1 else 2
        }
        l = 0
        var r = 1
        while (r < n - 1) {
            val difL = arr[r] - arr[r - 1]
            val difR = arr[r] - arr[r + 1]
            if (difL == 0 && difR == 0) {
                l = r + 1
            } else if (difL == 0) {
                ans = ans.coerceAtLeast(r - l)
                l = r
            } else if (!(difL < 0 && difR < 0 || difL > 0 && difR > 0)) {
                ans = ans.coerceAtLeast(r - l + 1)
                l = r
            }
            r++
        }
        return ans.coerceAtLeast(r - l + 1)
    }
}
