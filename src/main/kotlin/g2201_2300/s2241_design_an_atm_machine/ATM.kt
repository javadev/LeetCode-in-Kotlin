package g2201_2300.s2241_design_an_atm_machine

// #Medium #Array #Greedy #Design #2023_06_27_Time_764_ms_(100.00%)_Space_71.5_MB_(85.71%)

class ATM {
    private val nominals: IntArray = intArrayOf(20, 50, 100, 200, 500)
    private val counts: LongArray = LongArray(5)

    fun deposit(banknotesCount: IntArray) {
        for (i in 0..4) {
            counts[i] += banknotesCount[i].toLong()
        }
    }

    fun withdraw(amount: Int): IntArray {
        val delivery = IntArray(5)
        var currentAmount = amount.toLong()
        for (i in 4 downTo 0) {
            if (currentAmount > nominals[i] * counts[i]) {
                delivery[i] = counts[i].toInt()
            } else {
                delivery[i] = currentAmount.toInt() / nominals[i]
            }
            currentAmount += -nominals[i].toLong() * delivery[i]
            if (currentAmount == 0L) {
                break
            }
        }
        if (currentAmount > 0) {
            return intArrayOf(-1)
        }
        for (i in 0..4) {
            counts[i] += -delivery[i].toLong()
        }
        return delivery
    }
}
/*
 * Your ATM object will be instantiated and called as such:
 * var obj = ATM()
 * obj.deposit(banknotesCount)
 * var param_2 = obj.withdraw(amount)
 */
