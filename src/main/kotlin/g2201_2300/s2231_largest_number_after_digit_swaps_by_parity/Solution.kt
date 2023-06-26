package g2201_2300.s2231_largest_number_after_digit_swaps_by_parity

// #Easy #Sorting #Heap_Priority_Queue
class Solution {
    fun largestInteger(num: Int): Int {
        val str = num.toString().toCharArray()
        var temp: Char
        for (i in str.indices) {
            temp = str[i]
            var swapIndex = i
            val even = str[i].code % 2 == 0
            var max = Int.MIN_VALUE
            if (even) {
                for (j in i + 1 until str.size) {
                    if (str[j].code % 2 == 0 && str[j] > str[i] && str[j].code > max) {
                        max = str[j].code
                        temp = str[j]
                        swapIndex = j
                    }
                }
            } else {
                for (j in i + 1 until str.size) {
                    if (str[j].code % 2 != 0 && str[j] > str[i] && str[j].code > max) {
                        max = str[j].code
                        temp = str[j]
                        swapIndex = j
                    }
                }
            }
            val tempStr = str[i]
            str[i] = temp
            str[swapIndex] = tempStr
        }
        return Integer.valueOf(String(str))
    }
}
