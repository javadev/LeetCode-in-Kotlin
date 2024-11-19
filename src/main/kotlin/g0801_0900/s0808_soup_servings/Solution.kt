package g0801_0900.s0808_soup_servings

// #Medium #Dynamic_Programming #Math #Probability_and_Statistics
// #2023_03_17_Time_112_ms_(100.00%)_Space_34_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun soupServings(n: Int): Double {
        return solve(n)
    }

    private fun solve(n: Int): Double {
        var n = n
        n = n / 25 + if (n % 25 > 0) 1 else 0
        return if (n >= 500) {
            1.0
        } else {
            find(n, n, Array(n + 1) { arrayOfNulls(n + 1) })
        }
    }

    private fun find(a: Int, b: Int, mem: Array<Array<Double?>>): Double {
        if (a <= 0 && b <= 0) {
            return 0.5
        } else if (a <= 0) {
            return 1.0
        } else if (b <= 0) {
            return 0.0
        }
        if (mem[a][b] != null) {
            return mem[a][b]!!
        }
        var prob: Double = find(a - 4, b, mem)
        prob += find(a - 3, b - 1, mem)
        prob += find(a - 2, b - 2, mem)
        prob += find(a - 1, b - 3, mem)
        mem[a][b] = 0.25 * prob
        return mem[a][b]!!
    }
}
