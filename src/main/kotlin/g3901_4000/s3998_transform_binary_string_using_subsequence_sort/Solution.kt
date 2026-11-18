package g3901_4000.s3998_transform_binary_string_using_subsequence_sort

import java.util.concurrent.CompletableFuture

// #Medium #Array #String #Greedy #Two_Pointers #Staff #Weekly_Contest_511
// #2026_11_17_Time_25_ms_(100.00%)_Space_85.98_MB_(6.45%)

class Solution {
    fun transformStr(s: String, strs: Array<String>): BooleanArray {
        val len = strs.size
        val count = IntArray(2)
        for (ch in s.toCharArray()) {
            count[ch.code - '0'.code]++
        }
        // create lists of all those tasks, which are no blocking main thread
        val listOfFutureTasks: MutableList<CompletableFuture<Boolean?>?> = ArrayList<CompletableFuture<Boolean?>?>()
        for (target in strs) {
            listOfFutureTasks.add(canConvert(s, target, count))
        }
        // allOf will make sure all things are running concurrently/parallely while .join() can be
        // used to complete em all
        val allDone =
            CompletableFuture.allOf(*listOfFutureTasks.toTypedArray<CompletableFuture<*>?>())
        // collect results when allDone is complete
        val res = BooleanArray(len)
        allDone.thenRun(
            Runnable {
                for (i in 0..<len) {
                    res[i] = listOfFutureTasks[i]!!.join()!!
                }
            },
        )
            .join()
        return res
    }

    private fun canConvert(src: String, target: String, count: IntArray): CompletableFuture<Boolean?> {
        // first check there should be equal or less number of 1's and 0's
        return CompletableFuture.supplyAsync<String> { validateBalance(target, count) }
            .thenApply<Boolean?> { dst: String? -> dst != null && isPossibleToConvert(src, dst) }
    }

    private fun isPossibleToConvert(src: String, dst: String): Boolean {
        val n = src.length
        var zero = 0
        for (i in 0..<n) {
            if (src[i] == '0') {
                zero++
            }
            if (dst[i] == '0') {
                zero--
            }
            if (zero > 0) {
                return false
            }
        }
        return true
    }

    private fun validateBalance(s: String, count: IntArray): String? {
        val local = IntArray(2)
        for (ch in s.toCharArray()) {
            if (ch == '?') {
                continue
            }
            local[ch.code - '0'.code]++
        }
        if (local[0] > count[0] || local[1] > count[1]) {
            return null
        }
        var diff0 = count[0] - local[0]
        var diff1 = count[1] - local[1]
        val sb = StringBuilder()
        for (c in s.toCharArray()) {
            if (c == '?') {
                if (diff0-- > 0) {
                    sb.append('0')
                } else if (diff1-- > 0) {
                    sb.append('1')
                }
            } else {
                sb.append(c)
            }
        }
        return sb.toString()
    }
}
