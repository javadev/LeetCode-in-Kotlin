package g0801_0900.s0811_subdomain_visit_count

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subdomainVisits() {
        assertThat(
            Solution().subdomainVisits(arrayOf("9001 discuss.leetcode.com")),
            equalTo(
                listOf(
                    "9001 com", "9001 leetcode.com", "9001 discuss.leetcode.com"
                )
            )
        )
    }

    @Test
    fun subdomainVisits2() {
        assertThat(
            Solution()
                .subdomainVisits(
                    arrayOf(
                        "900 google.mail.com",
                        "50 yahoo.com",
                        "1 intel.mail.com",
                        "5 wiki.org"
                    )
                ),
            equalTo(
                listOf(
                    "951 com",
                    "900 google.mail.com",
                    "1 intel.mail.com",
                    "5 org",
                    "5 wiki.org",
                    "901 mail.com",
                    "50 yahoo.com"
                )
            )
        )
    }
}
