package g0701_0800.s0712_minimum_ascii_delete_sum_for_two_strings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDeleteSum() {
        assertThat(Solution().minimumDeleteSum("sea", "eat"), equalTo(231))
    }

    @Test
    fun minimumDeleteSum2() {
        assertThat(Solution().minimumDeleteSum("delete", "leet"), equalTo(403))
    }
}
