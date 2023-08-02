package g2601_2700.s2683_neighboring_bitwise_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun doesValidArrayExist() {
        assertThat(
            Solution().doesValidArrayExist(intArrayOf(1, 1, 0)),
            equalTo(true)
        )
    }

    @Test
    fun doesValidArrayExist2() {
        assertThat(
            Solution().doesValidArrayExist(intArrayOf(1, 1)),
            equalTo(true)
        )
    }

    @Test
    fun doesValidArrayExist3() {
        assertThat(
            Solution().doesValidArrayExist(intArrayOf(1, 0)),
            equalTo(false)
        )
    }
}
