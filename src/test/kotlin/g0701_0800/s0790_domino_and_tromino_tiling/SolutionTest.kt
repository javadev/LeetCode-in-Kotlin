package g0701_0800.s0790_domino_and_tromino_tiling

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numTilings() {
        assertThat(Solution().numTilings(3), equalTo(5))
    }

    @Test
    fun numTilings2() {
        assertThat(Solution().numTilings(1), equalTo(1))
    }

    @Test
    fun numTilings3() {
        assertThat(Solution().numTilings(2), equalTo(2))
    }

    @Test
    fun numTilings4() {
        assertThat(Solution().numTilings(3), equalTo(5))
    }

    @Test
    fun numTilings5() {
        assertThat(Solution().numTilings(4), equalTo(11))
    }

    @Test
    fun numTilings6() {
        assertThat(Solution().numTilings(5), equalTo(24))
    }

    @Test
    fun numTilings7() {
        assertThat(Solution().numTilings(6), equalTo(53))
    }
}
