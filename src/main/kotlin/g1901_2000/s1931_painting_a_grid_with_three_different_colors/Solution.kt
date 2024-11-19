package g1901_2000.s1931_painting_a_grid_with_three_different_colors

// #Hard #Dynamic_Programming #2023_06_20_Time_135_ms_(100.00%)_Space_33.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun colorTheGrid(m: Int, n: Int): Int {
        if (m == 1) {
            return (3L * powMod(2, n - 1) % P).toInt()
        }
        if (m == 2) {
            return (6L * powMod(3, n - 1) % P).toInt()
        }
        if (n == 1) {
            return (3L * powMod(2, m - 1) % P).toInt()
        }
        if (n == 2) {
            return (6L * powMod(3, m - 1) % P).toInt()
        }
        val totalTemplates = 1 shl m - 2
        val totalPaintings = binPow(3, m)
        val paintingToTemplate = IntArray(totalPaintings)
        val paintingCountForTemplate = LongArray(totalTemplates)
        val templateEdgeCount = Array(totalTemplates) { LongArray(totalTemplates) }
        val templateToIndex: MutableMap<Int, Int> = HashMap(1 shl m - 2)
        val templateCounter = 0
        extracted(
            m,
            totalPaintings,
            paintingToTemplate,
            paintingCountForTemplate,
            templateToIndex,
            templateCounter,
        )
        extracted(m, totalPaintings, paintingToTemplate, templateEdgeCount)
        for (i in 0 until totalTemplates) {
            val c = paintingCountForTemplate[i]
            for (j in 0 until totalTemplates) {
                templateEdgeCount[i][j] /= c
            }
        }
        val matrixPower = matrixPower(templateEdgeCount, n.toLong() - 1)
        var ans: Long = 0
        for (i in 0 until totalTemplates) {
            var s: Long = 0
            val arr = matrixPower[i]
            for (a in arr) {
                s += a
            }
            ans += paintingCountForTemplate[i] * s
        }
        return (ans % P).toInt()
    }

    private fun extracted(
        m: Int,
        totalPaintings: Int,
        paintingToTemplate: IntArray,
        templateEdgeCount: Array<LongArray>,
    ) {
        for (i in 0 until totalPaintings) {
            if (paintingToTemplate[i] == -1) {
                continue
            }
            for (j in i + 1 until totalPaintings) {
                if (paintingToTemplate[j] == -1) {
                    continue
                }
                if (checkAllowance(i, j, m)) {
                    templateEdgeCount[paintingToTemplate[i]][paintingToTemplate[j]]++
                    templateEdgeCount[paintingToTemplate[j]][paintingToTemplate[i]]++
                }
            }
        }
    }

    private fun extracted(
        m: Int,
        totalPaintings: Int,
        paintingToTemplate: IntArray,
        paintingCountForTemplate: LongArray,
        templateToIndex: MutableMap<Int, Int>,
        templateCounter: Int,
    ) {
        var templateCounter = templateCounter
        for (i in 0 until totalPaintings) {
            val type = getType(i, m)
            if (type == -1) {
                paintingToTemplate[i] = -1
                continue
            }
            var templateIndex = templateToIndex[type]
            if (templateIndex == null) {
                templateToIndex[type] = templateCounter
                templateIndex = templateCounter++
            }
            paintingToTemplate[i] = templateIndex
            paintingCountForTemplate[templateIndex]++
        }
    }

    private fun checkAllowance(a: Int, b: Int, m: Int): Boolean {
        var a = a
        var b = b
        for (i in 0 until m) {
            if (a % 3 == b % 3) {
                return false
            }
            a /= 3
            b /= 3
        }
        return true
    }

    private fun getType(a: Int, m: Int): Int {
        var a = a
        var m = m
        val digits = IntArray(3)
        val first = a % 3
        val second = a % 9 / 3
        if (first == second) {
            return -1
        }
        digits[second] = 1
        digits[3 - first - second] = 2
        var prev = second
        var type = 1
        m -= 2
        a /= 9
        while (m-- > 0) {
            val curr = a % 3
            if (prev == curr) {
                return -1
            }
            type = type * 3 + digits[curr]
            prev = curr
            a /= 3
        }
        return type
    }

    private fun powMod(a: Int, b: Int): Int {
        var a = a
        var b = b
        var res: Long = 1
        while (b != 0) {
            if (b and 1 != 0) {
                res = res * a % P
                --b
            } else {
                a = (a.toLong() * a % P).toInt()
                b = b shr 1
            }
        }
        return res.toInt()
    }

    private fun binPow(a: Int, n: Int): Int {
        var n = n
        var res = 1
        var tmp = a
        while (n != 0) {
            if (n and 1 != 0) {
                res *= tmp
            }
            tmp *= tmp
            n = n shr 1
        }
        return res
    }

    private fun matrixPower(base: Array<LongArray>, pow: Long): Array<LongArray> {
        var base = base
        var pow = pow
        val n = base.size
        var res = Array(n) { LongArray(n) }
        for (i in 0 until n) {
            res[i][i] = 1
        }
        while (pow != 0L) {
            if (pow and 1L != 0L) {
                res = multiplyMatrix(res, base)
                --pow
            } else {
                base = multiplyMatrix(base, base)
                pow = pow shr 1
            }
        }
        return res
    }

    private fun multiplyMatrix(a: Array<LongArray>, b: Array<LongArray>): Array<LongArray> {
        val n = a.size
        val ans = Array(n) { LongArray(n) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                for (k in 0 until n) {
                    ans[i][j] += a[i][k] * b[k][j]
                }
                ans[i][j] %= P.toLong()
            }
        }
        return ans
    }

    companion object {
        const val P = 1000000007
    }
}
