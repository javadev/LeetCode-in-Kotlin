package g0901_1000.s0929_unique_email_addresses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numUniqueEmails() {
        assertThat(
            Solution()
                .numUniqueEmails(
                    arrayOf(
                        "test.email+alex@leetcode.com",
                        "test.e.mail+bob.cathy@leetcode.com",
                        "testemail+david@lee.tcode.com"
                    )
                ),
            equalTo(2)
        )
    }

    @Test
    fun numUniqueEmails2() {
        assertThat(
            Solution()
                .numUniqueEmails(
                    arrayOf(
                        "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
                    )
                ),
            equalTo(3)
        )
    }
}
