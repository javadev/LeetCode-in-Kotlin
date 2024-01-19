package g2901_3000.s2999_count_the_number_of_powerful_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfPowerfulInt() {
        assertThat(Solution().numberOfPowerfulInt(1L, 6000L, 4, "124"), equalTo(5L))
    }

    @Test
    fun numberOfPowerfulInt2() {
        assertThat(Solution().numberOfPowerfulInt(15L, 215L, 5, "10"), equalTo(2L))
    }

    @Test
    fun numberOfPowerfulInt3() {
        assertThat(Solution().numberOfPowerfulInt(1L, 2000L, 8, "1"), equalTo(162L))
    }

    @Test
    fun numberOfPowerfulInt4() {
        assertThat(Solution().numberOfPowerfulInt(1L, 1L, 8, "2"), equalTo(0L))
    }
}
