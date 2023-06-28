package g2201_2300.s2288_apply_discount_to_prices

// #Medium #String
class Solution {
    fun discountPrices(sentence: String, discount: Int): String {
        val words = sentence.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val sb = StringBuilder()
        for (word in words) {
            sb.append(applyDiscount(word, discount))
            sb.append(" ")
        }
        sb.deleteCharAt(sb.length - 1)
        return sb.toString()
    }

    private fun applyDiscount(s: String, discount: Int): String {
        if (s[0] == '$' && s.length > 1) {
            var price: Long = 0
            for (i in 1 until s.length) {
                if (!Character.isDigit(s[i])) {
                    // Error case. We could also use Long.parseLong() here.
                    return s
                }
                price *= 10
                price += ((s[i].code - '0'.code) * (100 - discount)).toLong()
            }
            val stringPrice = price.toString()
            if (price < 10) {
                return "$0.0$stringPrice"
            }
            return if (price < 100) {
                "$0.$stringPrice"
            } else (
                "$" +
                    stringPrice.substring(0, stringPrice.length - 2) +
                    "." +
                    stringPrice.substring(stringPrice.length - 2)
                )
        }
        return s
    }
}
