package g2201_2300.s2241_design_an_atm_machine

// #Medium #Array #Greedy #Design
class ATM {
    private val nominals: IntArray
    private val counts: LongArray

    init {
        nominals = intArrayOf(20, 50, 100, 200, 500)
        counts = LongArray(5)
    }

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
