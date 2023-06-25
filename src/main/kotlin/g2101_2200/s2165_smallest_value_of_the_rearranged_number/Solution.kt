package g2101_2200.s2165_smallest_value_of_the_rearranged_number

// #Medium #Math #Sorting
class Solution {
    fun smallestNumber(num: Long): Long {
        val count = IntArray(10)
        var tempNum: Long
        tempNum = if (num > 0) {
            num
        } else {
            num * -1
        }
        var min = 10
        while (tempNum > 0) {
            val rem = (tempNum % 10).toInt()
            if (rem != 0) {
                min = Math.min(min, rem)
            }
            count[rem]++
            tempNum = tempNum / 10
        }
        var output: Long = 0
        if (num > 0) {
            output = output * 10 + min
            count[min]--
            for (i in 0..9) {
                for (j in 0 until count[i]) {
                    output = output * 10 + i
                }
            }
        } else {
            for (i in 9 downTo 0) {
                for (j in 0 until count[i]) {
                    output = output * 10 + i
                }
            }
            output = output * -1
        }
        return output
    }
}
