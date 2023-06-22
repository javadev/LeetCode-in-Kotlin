package g2001_2100.s2043_simple_bank_system

// #Medium #Array #Hash_Table #Design #Simulation
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
