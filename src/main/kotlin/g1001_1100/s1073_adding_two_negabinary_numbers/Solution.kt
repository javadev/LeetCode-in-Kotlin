package g1001_1100.s1073_adding_two_negabinary_numbers

// #Medium #Array #Math #2023_05_31_Time_187_ms_(100.00%)_Space_40.9_MB_(100.00%)

class Solution {
    fun addNegabinary(arr1: IntArray, arr2: IntArray): IntArray {
        val len1 = arr1.size
        val len2 = arr2.size
        val reverseArr1 = IntArray(len1)
        for (i in len1 - 1 downTo 0) {
            reverseArr1[len1 - i - 1] = arr1[i]
        }
        val reverseArr2 = IntArray(len2)
        for (i in len2 - 1 downTo 0) {
            reverseArr2[len2 - i - 1] = arr2[i]
        }
        val sumArray = IntArray(len1.coerceAtLeast(len2) + 2)
        System.arraycopy(reverseArr1, 0, sumArray, 0, len1)
        for (i in sumArray.indices) {
            if (i < len2) {
                sumArray[i] += reverseArr2[i]
            }
            if (sumArray[i] > 1) {
                sumArray[i] -= 2
                sumArray[i + 1]--
            } else if (sumArray[i] == -1) {
                sumArray[i] = 1
                sumArray[i + 1]++
            }
        }
        var resultLen = sumArray.size
        for (i in sumArray.indices.reversed()) {
            if (sumArray[i] == 0) {
                resultLen--
            } else {
                break
            }
        }
        if (resultLen == 0) {
            return intArrayOf(0)
        }
        val result = IntArray(resultLen)
        for (i in resultLen - 1 downTo 0) {
            result[resultLen - i - 1] = sumArray[i]
        }
        return result
    }
}
