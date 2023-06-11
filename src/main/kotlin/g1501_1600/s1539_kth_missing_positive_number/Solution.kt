package g1501_1600.s1539_kth_missing_positive_number

// #Easy #Array #Binary_Search #Binary_Search_I_Day_6
class Solution {
    fun findKthPositive(arr: IntArray, k: Int): Int {
        var missed = 0
        for (i in arr.indices) {
            if (i == 0) {
                missed += arr[0] - 1
                if (missed >= k) {
                    return k
                }
            } else {
                missed += arr[i] - arr[i - 1] - 1
                if (missed >= k) {
                    missed -= arr[i] - arr[i - 1] - 1
                    var result = arr[i - 1]
                    while (missed++ < k) {
                        result++
                    }
                    return result
                }
            }
        }
        var result = arr[arr.size - 1]
        while (missed++ < k) {
            result++
        }
        return result
    }
}
