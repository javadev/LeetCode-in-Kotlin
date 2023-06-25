package g2101_2200.s2197_replace_non_coprime_numbers_in_array

// #Hard #Array #Math #Stack #Number_Theory
class Solution {
    fun replaceNonCoprimes(nums: IntArray): List<Int> {
        val res = ArrayList<Int>()
        var i = 1
        res.add(nums[0])
        while (i < nums.size) {
            val first = res[res.size - 1]
            val second = nums[i]
            val gcd = gcd(first, second)
            if (gcd > 1) {
                val lcm = first.toLong() * second.toLong() / gcd
                if (res.isNotEmpty()) {
                    res.removeAt(res.size - 1)
                }
                res.add(lcm.toInt())
                recursivelyCheck(res)
            } else {
                res.add(second)
            }
            i++
        }
        return res
    }

    private fun gcd(a: Int, b: Int): Int {
        if (a > b) {
            return gcd(b, a)
        }
        return if (b % a == 0) {
            a
        } else gcd(b % a, a)
    }

    private fun recursivelyCheck(list: ArrayList<Int>) {
        if (list.size < 2) {
            return
        }
        val a = list.removeAt(list.size - 1)
        val b = list.removeAt(list.size - 1)
        val gcd = gcd(a, b)
        if (gcd > 1) {
            val lcm = a.toLong() * b.toLong() / gcd
            list.add(lcm.toInt())
            recursivelyCheck(list)
        } else {
            list.add(b)
            list.add(a)
        }
    }
}
