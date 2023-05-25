package g1101_1200.s1169_invalid_transactions

// #Medium #Array #String #Hash_Table #Sorting
// #2023_05_25_Time_362_ms_(57.14%)_Space_62.4_MB_(7.14%)

class Solution {
    internal class Transaction(trans: String) {
        var name: String
        var time: Int
        var amount: Int
        var city: String

        init {
            val s = trans.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            name = s[0]
            time = s[1].toInt()
            amount = s[2].toInt()
            city = s[3]
        }
    }

    fun invalidTransactions(input: Array<String>?): List<String> {
        val res: MutableList<String> = ArrayList()
        if (input == null || input.size == 0) {
            return res
        }
        val map: MutableMap<String, MutableList<Transaction>> = HashMap()
        for (s in input) {
            val trans = Transaction(s)
            if (!map.containsKey(trans.name)) {
                map[trans.name] = ArrayList()
            }
            map[trans.name]!!.add(trans)
        }
        for (s in input) {
            val trans = Transaction(s)
            if (!isValid(trans, map)) {
                res.add(s)
            }
        }
        return res
    }

    private fun isValid(transaction: Transaction, map: Map<String, MutableList<Transaction>>): Boolean {
        if (transaction.amount > 1000) {
            return false
        }
        for (s in map[transaction.name]!!) {
            if (Math.abs(s.time - transaction.time) <= 60 && s.city != transaction.city) {
                return false
            }
        }
        return true
    }
}
