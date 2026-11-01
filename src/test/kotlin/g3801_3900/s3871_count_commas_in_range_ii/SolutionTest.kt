package g3801_3900.s3871_count_commas_in_range_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countCommas() {
        assertThat<Long>(Solution().countCommas(0L), equalTo<Long>(0L))
    }

    @Test
    fun countCommas2() {
        assertThat<Long>(Solution().countCommas(998L), equalTo<Long>(0L))
    }

    @Test
    fun countCommas3() {
        assertThat<Long>(Solution().countCommas(999L), equalTo<Long>(0L))
    }

    @Test
    fun countCommas4() {
        assertThat<Long>(Solution().countCommas(1000L), equalTo<Long>(1L))
    }

    @Test
    fun countCommas5() {
        assertThat<Long>(Solution().countCommas(1002L), equalTo<Long>(3L))
    }

    @Test
    fun countCommas6() {
        assertThat<Long>(Solution().countCommas(999999L), equalTo<Long>(999000L))
    }

    @Test
    fun countCommas7() {
        assertThat<Long>(Solution().countCommas(1000000L), equalTo<Long>(999002L))
    }

    @Test
    fun countCommas8() {
        assertThat<Long>(Solution().countCommas(1000005L), equalTo<Long>(999012L))
    }

    @Test
    fun countCommas9() {
        assertThat<Long>(Solution().countCommas(1000000000L), equalTo<Long>(1998999003L))
    }

    @Test
    fun countCommas10() {
        assertThat<Long>(
            Solution().countCommas(1000000000000L),
            equalTo<Long>(2998998999004L),
        )
    }

    @Test
    fun countCommas11() {
        assertThat<Long>(
            Solution().countCommas(1000000000000000L),
            equalTo<Long>(3998998998999005L),
        )
    }

    @Test
    fun countCommas12() {
        assertThat<Long>(Solution().countCommas(999999999L), equalTo<Long>(1998999000L))
    }

    @Test
    fun countCommas13() {
        assertThat<Long>(
            Solution().countCommas(999999999999L),
            equalTo<Long>(2998998999000L),
        )
    }
}
