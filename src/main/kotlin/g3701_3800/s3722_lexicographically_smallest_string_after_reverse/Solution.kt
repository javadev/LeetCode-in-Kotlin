package g3701_3800.s3722_lexicographically_smallest_string_after_reverse

// #Medium #Biweekly_Contest_168 #2025_10_28_Time_8_ms_(100.00%)_Space_45.74_MB_(100.00%)

class Solution {
    fun lexSmallest(s: String): String {
        val n = s.length
        val arr = s.toCharArray()
        val best = arr.clone()
        // Check all reverse first k operations
        for (k in 1..n) {
            if (isBetterReverseFirstK(arr, k, best)) {
                updateBestReverseFirstK(arr, k, best)
            }
        }
        // Check all reverse last k operations
        for (k in 1..n) {
            if (isBetterReverseLastK(arr, k, best)) {
                updateBestReverseLastK(arr, k, best)
            }
        }
        return String(best)
    }

    private fun isBetterReverseFirstK(arr: CharArray, k: Int, best: CharArray): Boolean {
        for (i in arr.indices) {
            val currentChar = if (i < k) arr[k - 1 - i] else arr[i]
            if (currentChar < best[i]) {
                return true
            }
            if (currentChar > best[i]) {
                return false
            }
        }
        return false
    }

    private fun isBetterReverseLastK(arr: CharArray, k: Int, best: CharArray): Boolean {
        val n = arr.size
        for (i in 0..<n) {
            val currentChar = if (i < n - k) arr[i] else arr[n - 1 - (i - (n - k))]
            if (currentChar < best[i]) {
                return true
            }
            if (currentChar > best[i]) {
                return false
            }
        }
        return false
    }

    private fun updateBestReverseFirstK(arr: CharArray, k: Int, best: CharArray) {
        for (i in 0..<k) {
            best[i] = arr[k - 1 - i]
        }
        if (arr.size - k >= 0) {
            System.arraycopy(arr, k, best, k, arr.size - k)
        }
    }

    private fun updateBestReverseLastK(arr: CharArray, k: Int, best: CharArray) {
        val n = arr.size
        if (n - k >= 0) {
            System.arraycopy(arr, 0, best, 0, n - k)
        }
        for (i in 0..<k) {
            best[n - k + i] = arr[n - 1 - i]
        }
    }
}
