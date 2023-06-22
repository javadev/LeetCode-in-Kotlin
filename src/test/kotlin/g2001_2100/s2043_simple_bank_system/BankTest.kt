package g2001_2100.s2043_simple_bank_system

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class BankTest {
    @Test
    fun bankTest() {
        val bank = Bank(longArrayOf(10, 100, 20, 50, 30))
        MatcherAssert.assertThat(bank.withdraw(3, 10), CoreMatchers.equalTo(true))
        MatcherAssert.assertThat(bank.transfer(5, 1, 20), CoreMatchers.equalTo(true))
        MatcherAssert.assertThat(bank.deposit(5, 20), CoreMatchers.equalTo(true))
        MatcherAssert.assertThat(bank.transfer(3, 4, 15), CoreMatchers.equalTo(false))
        MatcherAssert.assertThat(bank.withdraw(10, 50), CoreMatchers.equalTo(false))
    }
}
