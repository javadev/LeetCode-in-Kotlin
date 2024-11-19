package g1301_1400.s1357_apply_discount_every_n_orders

// #Medium #Array #Hash_Table #Design #2023_06_06_Time_967_ms_(100.00%)_Space_83.9_MB_(100.00%)

class Cashier(private val nthCustomer: Int, discount: Int, products: IntArray, prices: IntArray) {
    private val map: MutableMap<Int, Int>
    private var customerCountTrack = 0
    private val discountPercent: Double

    init {
        map = HashMap()
        discountPercent = discount * .01
        for (i in products.indices) {
            map[products[i]] = prices[i]
        }
    }

    fun getBill(product: IntArray, amount: IntArray): Double {
        customerCountTrack++
        var sum = 0.0
        for (i in product.indices) {
            sum += (map[product[i]]!! * amount[i]).toDouble()
        }
        // discount customer
        return if (customerCountTrack % nthCustomer == 0) {
            sum - sum * discountPercent
        } else {
            sum
        }
    }
}
/*
 * Your Cashier object will be instantiated and called as such:
 * var obj = Cashier(n, discount, products, prices)
 * var param_1 = obj.getBill(product,amount)
 */
