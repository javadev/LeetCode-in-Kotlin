package g2001_2100.s2043_simple_bank_system

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class BankTest {
    @Test
    fun bankTest() {
        val bank = Bank(longArrayOf(10, 100, 20, 50, 30))
        assertThat(bank.withdraw(3, 10), equalTo(true))
        assertThat(bank.transfer(5, 1, 20), equalTo(true))
        assertThat(bank.deposit(5, 20), equalTo(true))
        assertThat(bank.transfer(3, 4, 15), equalTo(false))
        assertThat(bank.withdraw(10, 50), equalTo(false))
    }
}
