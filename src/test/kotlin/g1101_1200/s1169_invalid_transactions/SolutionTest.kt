package g1101_1200.s1169_invalid_transactions

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun invalidTransactions() {
        MatcherAssert.assertThat(
            Solution()
                .invalidTransactions(arrayOf("alice,20,800,mtv", "alice,50,100,beijing")),
            CoreMatchers.equalTo(mutableListOf("alice,20,800,mtv", "alice,50,100,beijing"))
        )
    }

    @Test
    fun invalidTransactions2() {
        MatcherAssert.assertThat(
            Solution()
                .invalidTransactions(arrayOf("alice,20,800,mtv", "alice,50,1200,mtv")),
            CoreMatchers.equalTo(listOf("alice,50,1200,mtv"))
        )
    }

    @Test
    fun invalidTransactions3() {
        MatcherAssert.assertThat(
            Solution()
                .invalidTransactions(arrayOf("alice,20,800,mtv", "bob,50,1200,mtv")),
            CoreMatchers.equalTo(listOf("bob,50,1200,mtv"))
        )
    }
}
