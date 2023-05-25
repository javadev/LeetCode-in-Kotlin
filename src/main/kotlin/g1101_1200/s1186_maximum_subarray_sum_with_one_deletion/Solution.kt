package g1101_1200.s1186_maximum_subarray_sum_with_one_deletion

// #Medium #Array #Dynamic_Programming

class Solution {
    fun maximumSum(arr: IntArray): Int {
        var maxWithNoDeletions = arr[0]
        var maxWithOneDeletion = arr[0]
        var maxOverall = arr[0]
        for (i in 1 until arr.size) {
            val numToProcess = arr[i]
            val nextMaxWithNoDeletions = Math.max(maxWithNoDeletions + numToProcess, numToProcess)
            val nextMaxWithOneDeletion = Math.max(maxWithOneDeletion + numToProcess, maxWithNoDeletions)
            maxOverall = Math.max(maxOverall, Math.max(nextMaxWithNoDeletions, nextMaxWithOneDeletion))
            maxWithNoDeletions = nextMaxWithNoDeletions
            maxWithOneDeletion = nextMaxWithOneDeletion
        }
        return maxOverall
    }
}
