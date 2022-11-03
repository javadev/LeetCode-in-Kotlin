package g0201_0300.s0278_first_bad_version

// #Easy #Binary_Search #Interactive #Algorithm_I_Day_1_Binary_Search #Binary_Search_I_Day_5
// #Level_1_Day_7_Binary_Search #2022_11_03_Time_349_ms_(76.86%)_Space_34.1_MB_(8.78%)

/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution : VersionControl() {
    fun firstBadVersion(n: Int): Int {
        var l = 1
        var r = n
        var mid: Int
        while (l < r) {
            mid = l + (r - l) / 2
            if (!isBadVersion(mid)) {
                l = mid + 1
            } else {
                r = mid
            }
        }
        return l
    }
}
