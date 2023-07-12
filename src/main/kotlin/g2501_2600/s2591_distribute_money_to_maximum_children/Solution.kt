package g2501_2600.s2591_distribute_money_to_maximum_children

// #Easy #Math #Greedy #2023_07_12_Time_155_ms_(100.00%)_Space_34.2_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun distMoney(money: Int, children: Int): Int {
        var money = money
        if (children > money) return -1
        var ans = 0
        money -= children
        ans = money / 7
        if (ans == children && money % 7 == 0) return ans
        if (ans >= children) return children - 1
        if (money % 7 == 3 && ans == children - 1) ans--
        return ans
    }
}
