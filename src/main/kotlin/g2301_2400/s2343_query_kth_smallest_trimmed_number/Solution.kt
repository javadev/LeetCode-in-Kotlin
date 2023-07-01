package g2301_2400.s2343_query_kth_smallest_trimmed_number

// #Medium #Array #String #Sorting #Heap_Priority_Queue #Divide_and_Conquer #Quickselect #Radix_Sort
// #2023_07_01_Time_382_ms_(100.00%)_Space_38.7_MB_(100.00%)

class Solution {
    fun smallestTrimmedNumbers(nums: Array<String>, queries: Array<IntArray>): IntArray {
        val numberOfDigits = nums[0].length
        var placeValue = numberOfDigits
        val list: MutableList<IntArray> = ArrayList(numberOfDigits)
        while (--placeValue >= 0) {
            countSort(nums, placeValue, numberOfDigits, list)
        }
        val op = IntArray(queries.size)
        var i = 0
        for (query in queries) {
            val listIndex = query[1] - 1
            val place = query[0] - 1
            op[i++] = list[listIndex][place]
        }
        return op
    }

    private fun countSort(arr: Array<String>, exp: Int, numberOfDigits: Int, list: MutableList<IntArray>) {
        val n = arr.size
        val output = arrayOfNulls<String>(n)
        val count = IntArray(10)
        count.fill(0)
        // Store count of occurrences in count[]
        var i = 0
        while (i < n) {
            val digit = arr[i][exp].code - '0'.code
            count[digit]++
            i++
        }
        i = 1
        while (i < 10) {
            count[i] += count[i - 1]
            i++
        }
        // Build the output array
        val op = IntArray(n)
        i = n - 1
        while (i >= 0) {
            val digit = arr[i][exp].code - '0'.code
            val place = count[digit] - 1
            output[place] = arr[i]
            if (exp == numberOfDigits - 1) {
                op[place] = i
            } else {
                op[place] = list[list.size - 1][i]
            }
            count[digit]--
            i--
        }
        list.add(op)
        System.arraycopy(output, 0, arr, 0, n)
    }
}
