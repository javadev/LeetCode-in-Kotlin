package g3701_3800.s3751_total_waviness_of_numbers_in_range_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalWaviness() {
        assertThat<Int>(Solution().totalWaviness(120, 130), equalTo<Int>(3))
    }

    @Test
    fun totalWaviness2() {
        assertThat<Int>(Solution().totalWaviness(198, 202), equalTo<Int>(3))
    }

    @Test
    fun totalWaviness3() {
        assertThat<Int>(Solution().totalWaviness(4848, 4848), equalTo<Int>(2))
    }
}
