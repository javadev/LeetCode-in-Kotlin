package g2101_2200.s2117_abbreviating_the_product_of_a_range

// #Hard #Math
class Solution {
    fun abbreviateProduct(left: Int, right: Int): String {
        val threshold0 = 100000000000000L
        val threshold1 = 10000000000L
        val threshold2: Long = 100000
        var curr: Long = 1
        var i: Int
        var zerosCount = 0
        i = left
        while (i <= right && curr < threshold0) {
            curr *= i.toLong()
            while (curr % 10 == 0L) {
                curr /= 10
                zerosCount++
            }
            i++
        }
        if (curr < threshold1) {
            return String.format("%de%d", curr, zerosCount)
        }
        var low = curr % threshold1
        var high = curr.toDouble()
        while (high > threshold1) {
            high /= 10.0
        }
        while (i <= right) {
            low *= i.toLong()
            high *= i.toDouble()
            while (low % 10 == 0L) {
                low /= 10
                zerosCount++
            }
            if (low >= threshold1) {
                low %= threshold1
            }
            while (high > threshold1) {
                high /= 10.0
            }
            i++
        }
        while (high >= threshold2) {
            high /= 10.0
        }
        low %= threshold2
        return String.format("%d...%05de%d", high.toInt(), low, zerosCount)
    }
}
