package g3501_3600.s3556_sum_of_largest_prime_substrings

// #Medium #String #Hash_Table #Math #Sorting #Number_Theory
// #2025_05_25_Time_25_ms_(100.00%)_Space_43.67_MB_(100.00%)

class Solution {
    fun sumOfLargestPrimes(s: String): Long {
        val set: MutableSet<Long> = HashSet()
        val n = s.length
        var first: Long = -1
        var second: Long = -1
        var third: Long = -1
        for (i in 0..<n) {
            var num: Long = 0
            for (j in i..<n) {
                num = num * 10 + (s[j].code - '0'.code)
                if (i != j && s[i] == '0') {
                    break
                }
                if (isPrime(num) && !set.contains(num)) {
                    set.add(num)
                    if (num > first) {
                        third = second
                        second = first
                        first = num
                    } else if (num > second) {
                        third = second
                        second = num
                    } else if (num > third) {
                        third = num
                    }
                }
            }
        }
        var sum: Long = 0
        if (first != -1L) {
            sum += first
        }
        if (second != -1L) {
            sum += second
        }
        if (third != -1L) {
            sum += third
        }
        return sum
    }

    fun isPrime(num: Long): Boolean {
        if (num <= 1) {
            return false
        }
        if (num == 2L || num == 3L) {
            return true
        }
        if (num % 2 == 0L || num % 3 == 0L) {
            return false
        }
        var i: Long = 5
        while (i * i <= num) {
            if (num % i == 0L || num % (i + 2) == 0L) {
                return false
            }
            i += 6
        }
        return true
    }
}
