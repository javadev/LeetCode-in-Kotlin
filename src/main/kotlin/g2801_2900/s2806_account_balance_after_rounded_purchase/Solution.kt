package g2801_2900.s2806_account_balance_after_rounded_purchase

// #Easy #Math #2023_12_06_Time_108_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        val x = ((purchaseAmount + 5) / 10.0).toInt() * 10
        return 100 - x
    }
}
