package g1301_1400.s1352_product_of_the_last_k_numbers

// #Medium #Array #Math #Design #Queue #Data_Stream
// #2023_06_06_Time_563_ms_(100.00%)_Space_85.5_MB_(66.67%)

class ProductOfNumbers {
    private var ints = ArrayList<Int>()

    fun add(num: Int) {
        if (num == 0) ints.clear() else ints.add(if (ints.isEmpty()) num else num * ints[ints.size - 1])
    }

    fun getProduct(k: Int): Int {
        val n = ints.size
        if (k > n) return 0
        return if (k == n) ints[n - 1] else ints[n - 1] / ints[n - 1 - k]
    }
}
/*
 * Your ProductOfNumbers object will be instantiated and called as such:
 * var obj = ProductOfNumbers()
 * obj.add(num)
 * var param_2 = obj.getProduct(k)
 */
