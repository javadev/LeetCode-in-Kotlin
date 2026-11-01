package g3901_4000.s3953_maximum_score_with_co_prime_element

// #Hard #Array #Hash_Table #Math #Enumeration #Number_Theory #Combinatorics #Senior_Staff
// #Biweekly_Contest_184 #2026_10_20_Time_33_ms_(100.00%)_Space_86.44_MB_(96.88%)

import kotlin.math.max

class Solution {
    fun maxScore(nums: IntArray, maxVal: Int): Int {
        val max = findMax(nums, maxVal)
        val cnt = countNumbers(nums, max)
        val groupCnt = buildGroupCounts(cnt, max)
        val best = findBestAboveMaxVal(max, maxVal, cnt, groupCnt)
        return findBestWithinMaxVal(maxVal, cnt, groupCnt, best)
    }

    private fun findMax(nums: IntArray, maxVal: Int): Int {
        var max = maxVal
        for (num in nums) {
            if (num > max) {
                max = num
            }
        }
        return max
    }

    private fun countNumbers(nums: IntArray, max: Int): IntArray {
        val cnt = IntArray(max + 1)
        for (num in nums) {
            cnt[num]++
        }
        return cnt
    }

    private fun buildGroupCounts(cnt: IntArray, max: Int): IntArray {
        val groupCnt = IntArray(max + 1)
        for (i in 1..max) {
            var j = 1
            while (j * i <= max) {
                groupCnt[i] += cnt[j * i]
                j++
            }
        }
        return groupCnt
    }

    private fun findBestAboveMaxVal(max: Int, maxVal: Int, cnt: IntArray, groupCnt: IntArray): Int {
        var best = -1
        for (i in max downTo maxVal + 1) {
            if (cnt[i] == 0) {
                continue
            }
            val change = countConflict(i, groupCnt)
            best = max(best, i - change + 1)
        }
        return best
    }

    private fun findBestWithinMaxVal(maxVal: Int, cnt: IntArray, groupCnt: IntArray, best: Int): Int {
        var best = best
        for (i in maxVal downTo 1) {
            if (best != -1 && i <= best) {
                break
            }
            var change = countConflict(i, groupCnt)
            change = adjustChange(i, change, cnt)
            best = max(best, i - change)
        }
        return best
    }

    private fun adjustChange(target: Int, change: Int, cnt: IntArray): Int {
        var change = change
        if (change > 0 && cnt[target] != 0) {
            change--
        }
        if (change == 0 && cnt[target] == 0) {
            change++
        }
        return change
    }

    private fun countConflict(target: Int, groupCnt: IntArray): Int {
        val primeFactors = getFactor(target.toLong())
        var change = 0
        val subsetCount = 1 shl primeFactors.size
        for (mask in 1..<subsetCount) {
            change += calculateSubsetContribution(mask, primeFactors, groupCnt)
        }
        return change
    }

    private fun calculateSubsetContribution(mask: Int, primeFactors: MutableList<Int?>, groupCnt: IntArray): Int {
        var product = 1
        var bits = 0
        for (k in primeFactors.indices) {
            if ((mask and (1 shl k)) == 0) {
                continue
            }
            bits++
            product *= primeFactors[k]!!
        }
        val contribution = groupCnt[product]
        return if (bits % 2 == 1) contribution else -contribution
    }

    private fun getFactor(number: Long): MutableList<Int?> {
        var n = number
        val primeFactors: MutableList<Int?> = ArrayList<Int?>()
        var i = 2
        while (i <= n / i) {
            if (n % i != 0L) {
                i++
                continue
            }
            primeFactors.add(i)
            while (n % i == 0L) {
                n /= i.toLong()
            }
            i++
        }
        if (n > 1) {
            primeFactors.add(n.toInt())
        }
        return primeFactors
    }
}
