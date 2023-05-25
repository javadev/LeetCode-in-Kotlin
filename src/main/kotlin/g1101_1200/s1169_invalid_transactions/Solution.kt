package g1101_1200.s1169_invalid_transactions

// #Medium #Array #String #Hash_Table #Sorting

import java.util.TreeMap

class Solution {
    fun invalidTransactions(transactions: Array<String>): List<String> {
        val map: MutableMap<String, TreeMap<Int, Transaction>> = HashMap()
        val result: MutableList<String> = ArrayList()
        for (transaction in transactions) {
            val split = transaction.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val name = split[0]
            val time = split[1].toInt()
            val city = split[3]
            map.putIfAbsent(name, TreeMap())
            map[name]!![time] = Transaction(time, city)
        }
        for (transaction in transactions) {
            val split = transaction.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val name = split[0]
            val time = split[1].toInt()
            val amount = split[2].toInt()
            val city = split[3]
            if (amount > 1000) {
                result.add(transaction)
                continue
            }
            for (
                (key, value) in map[name]!!
                    .subMap(time - 60, time + 60)
            ) {
                if (Math.abs(time - key) <= 60 && value.city != city) {
                    result.add(transaction)
                    break
                }
            }
        }
        return result
    }

    private class Transaction(var amount: Int, var city: String)
}
