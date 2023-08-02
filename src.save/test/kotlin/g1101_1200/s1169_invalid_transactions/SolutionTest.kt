package g1101_1200.s1169_invalid_transactions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun invalidTransactions() {
        assertThat(
            Solution()
                .invalidTransactions(arrayOf("alice,20,800,mtv", "alice,50,100,beijing")),
            equalTo(mutableListOf("alice,20,800,mtv", "alice,50,100,beijing"))
        )
    }

    @Test
    fun invalidTransactions2() {
        assertThat(
            Solution()
                .invalidTransactions(arrayOf("alice,20,800,mtv", "alice,50,1200,mtv")),
            equalTo(listOf("alice,50,1200,mtv"))
        )
    }

    @Test
    fun invalidTransactions3() {
        assertThat(
            Solution()
                .invalidTransactions(arrayOf("alice,20,800,mtv", "bob,50,1200,mtv")),
            equalTo(listOf("bob,50,1200,mtv"))
        )
    }
}
