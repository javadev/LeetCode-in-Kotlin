package g3501_3600.s3536_maximum_product_of_two_digits

// #Easy #Math #Sorting #2025_05_04_Time_1_ms_(100.00%)_Space_40.93_MB_(100.00%)

class Solution {
    fun maxProduct(n: Int): Int {
        var n = n
        var m1 = n % 10
        n /= 10
        var m2 = n % 10
        n /= 10
        while (n > 0) {
            val a = n % 10
            if (a > m1) {
                if (m1 > m2) {
                    m2 = m1
                }
                m1 = a
            } else {
                if (a > m2) {
                    m2 = a
                }
            }
            n /= 10
        }
        return m1 * m2
    }
}
