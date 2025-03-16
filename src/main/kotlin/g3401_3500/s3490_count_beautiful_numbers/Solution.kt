package g3401_3500.s3490_count_beautiful_numbers

// #Hard #2025_03_16_Time_246_ms_(100.00%)_Space_61.00_MB_(100.00%)

class Solution {
    fun beautifulNumbers(l: Int, r: Int): Int {
        return countBeautiful(r) - countBeautiful(l - 1)
    }

    private fun countBeautiful(x: Int): Int {
        val digits = getCharArray(x)
        val dp = HashMap<String?, Int?>()
        return solve(0, 1, 0, 1, digits, dp)
    }

    private fun getCharArray(x: Int): CharArray {
        val str = x.toString()
        return str.toCharArray()
    }

    private fun solve(
        i: Int,
        tight: Int,
        sum: Int,
        prod: Int,
        digits: CharArray,
        dp: HashMap<String?, Int?>,
    ): Int {
        if (i == digits.size) {
            return if (sum > 0 && prod % sum == 0) {
                1
            } else {
                0
            }
        }
        val str = "$i - $tight - $sum - $prod"
        if (dp.containsKey(str)) {
            return dp.get(str)!!
        }
        val limit: Int = if (tight == 1) {
            digits[i].code - '0'.code
        } else {
            9
        }
        var count = 0
        var j = 0
        while (j <= limit) {
            var newTight = 0
            if (tight == 1 && j == limit) {
                newTight = 1
            }
            val newSum = sum + j
            val newProd: Int = if (j == 0 && sum == 0) {
                1
            } else {
                prod * j
            }
            count += solve(i + 1, newTight, newSum, newProd, digits, dp)
            j++
        }
        dp.put(str, count)
        return count
    }
}
