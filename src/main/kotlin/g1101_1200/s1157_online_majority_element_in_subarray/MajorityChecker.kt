package g1101_1200.s1157_online_majority_element_in_subarray

// #Hard #Array #Binary_Search #Design #Segment_Tree #Binary_Indexed_Tree
// #2023_05_25_Time_953_ms_(100.00%)_Space_139_MB_(100.00%)

class MajorityChecker(arr: IntArray) {
    private val valToInd: MutableMap<Int, MutableList<Int>>
    private val bitCount: Array<IntArray>

    init {
        valToInd = HashMap()
        bitCount = Array(arr.size + 1) { IntArray(NUM_OF_BITS) }
        for (i in arr.indices) {
            var `val` = arr[i]
            val indList = valToInd.computeIfAbsent(`val`) { k: Int? -> ArrayList() }
            indList.add(i)
            for (j in 0 until NUM_OF_BITS) {
                bitCount[i + 1][j] = bitCount[i][j] + (`val` and 1)
                `val` = `val` shr 1
            }
        }
    }

    fun query(left: Int, right: Int, threshold: Int): Int {
        var candidateVal = 0
        for (i in NUM_OF_BITS - 1 downTo 0) {
            val curBit = if (bitCount[right + 1][i] - bitCount[left][i] >= threshold) 1 else 0
            candidateVal = (candidateVal shl 1) + curBit
        }
        val indList: List<Int>? = valToInd[candidateVal]
        if (indList == null || indList.size < threshold) {
            return -1
        }
        var indOfLeft = indList.binarySearch(left)
        if (indOfLeft < 0) {
            indOfLeft = -indOfLeft - 1
        }
        var indOfRight = indList.binarySearch(right)
        if (indOfRight < 0) {
            indOfRight = -indOfRight - 2
        }
        return if (indOfRight - indOfLeft + 1 >= threshold) {
            candidateVal
        } else {
            -1
        }
    }

    companion object {
        private const val NUM_OF_BITS = 15
    }
}
