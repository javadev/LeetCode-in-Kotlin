package g1301_1400.s1352_product_of_the_last_k_numbers

// #Medium #Array #Math #Design #Queue #Data_Stream
class ProductOfNumbers {
    private var list: MutableList<Int> = ArrayList()
    fun add(num: Int) {
        if (num > 0 && !list.isEmpty()) {
            list.add(list[list.size - 1] * num)
        } else {
            list = ArrayList()
            list.add(1)
        }
    }

    fun getProduct(k: Int): Int {
        val size = list.size
        return if (k >= size) 0 else list[size - 1] / list[size - k - 1]
    }
}
