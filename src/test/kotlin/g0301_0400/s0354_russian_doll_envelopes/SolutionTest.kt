package g0301_0400.s0354_russian_doll_envelopes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun testMaxEnvelopes() {
        assertThat(
            Solution().maxEnvelopes(arrayOf(intArrayOf(5, 4), intArrayOf(6, 4), intArrayOf(6, 7), intArrayOf(2, 3))),
            equalTo(3)
        )
    }

    @Test
    fun testMaxEnvelopes2() {
        assertThat(Solution().maxEnvelopes(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(1, 1))), equalTo(1))
    }
}
