package g2001_2100.s2043_simple_bank_system

// #Medium #Array #Hash_Table #Design #Simulation
// #2023_06_23_Time_968_ms_(100.00%)_Space_113.3_MB_(85.71%)

class Bank(private val accounts: LongArray) {
    private fun validate(account: Int, money: Long, withdraw: Boolean): Boolean {
        return account < accounts.size && (!withdraw || accounts[account] >= money)
    }

    fun transfer(account1: Int, account2: Int, money: Long): Boolean {
        if (validate(account1 - 1, money, true) && validate(account2 - 1, 0, false)) {
            accounts[account1 - 1] -= money
            accounts[account2 - 1] += money
            return true
        }
        return false
    }

    fun deposit(account: Int, money: Long): Boolean {
        if (validate(account - 1, money, false)) {
            accounts[account - 1] += money
            return true
        }
        return false
    }

    fun withdraw(account: Int, money: Long): Boolean {
        if (validate(account - 1, money, true)) {
            accounts[account - 1] -= money
            return true
        }
        return false
    }
}
/*
 * Your Bank object will be instantiated and called as such:
 * var obj = Bank(balance)
 * var param_1 = obj.transfer(account1,account2,money)
 * var param_2 = obj.deposit(account,money)
 * var param_3 = obj.withdraw(account,money)
 */
