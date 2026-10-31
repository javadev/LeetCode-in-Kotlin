package g3701_3800.s3753_total_waviness_of_numbers_in_range_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalWaviness() {
        assertThat<Long>(Solution().totalWaviness(120L, 130L), equalTo<Long>(3L))
    }

    @Test
    fun totalWaviness2() {
        assertThat<Long>(Solution().totalWaviness(198L, 202L), equalTo<Long>(3L))
    }

    @Test
    fun totalWaviness3() {
        assertThat<Long>(Solution().totalWaviness(4848L, 4848L), equalTo<Long>(2L))
    }
}
