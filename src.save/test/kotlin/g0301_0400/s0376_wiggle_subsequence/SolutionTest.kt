package g0301_0400.s0376_wiggle_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun wiggleMaxLength() {
        assertThat(Solution().wiggleMaxLength(intArrayOf(1, 7, 4, 9, 2, 5)), equalTo(6))
    }

    @Test
    fun wiggleMaxLength2() {
        assertThat(
            Solution().wiggleMaxLength(intArrayOf(1, 17, 5, 10, 13, 15, 10, 5, 16, 8)),
            equalTo(7)
        )
    }

    @Test
    fun wiggleMaxLength3() {
        assertThat(
            Solution().wiggleMaxLength(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)), equalTo(2)
        )
    }
}
