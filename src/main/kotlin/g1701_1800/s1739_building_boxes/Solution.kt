package g1701_1800.s1739_building_boxes

// #Hard #Math #Greedy #Binary_Search #2023_06_16_Time_133_ms_(100.00%)_Space_32.8_MB_(100.00%)

class Solution {
    fun minimumBoxes(n: Int): Int {
        val k: Int = findLargestTetrahedralNotGreaterThan(n)
        val used: Int = tetrahedral(k)
        val floor: Int = triangular(k)
        val unused: Int = (n - used)
        if (unused == 0) {
            return floor
        }
        val r: Int = findSmallestTriangularNotLessThan(unused)
        return (floor + r)
    }

    private fun findLargestTetrahedralNotGreaterThan(te: Int): Int {
        var a: Int = Math.ceil(Math.pow(product(6, te.toLong()).toDouble(), ONE_THIRD)).toInt()
        while (tetrahedral(a) > te) {
            a--
        }
        return a
    }

    private fun findSmallestTriangularNotLessThan(t: Int): Int {
        var a: Int = -1 + Math.floor(Math.sqrt(product(t.toLong(), 2).toDouble())).toInt()
        while (triangular(a) < t) {
            a++
        }
        return a
    }

    private fun tetrahedral(a: Int): Int {
        return ratio(product(a.toLong(), (a + 1).toLong(), (a + 2).toLong()), 6).toInt()
    }

    private fun triangular(a: Int): Int {
        return ratio(product(a.toLong(), (a + 1).toLong()), 2).toInt()
    }

    private fun product(vararg vals: Long): Long {
        var product: Long = 1L
        for (`val`: Long in vals) {
            product *= `val`
        }
        return product
    }

    private fun ratio(a: Long, b: Long): Long {
        return (a / b)
    }

    companion object {
        val ONE_THIRD: Double = 1.0 / 3.0
    }
}
