package g2401_2500.s2439_minimize_maximum_of_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeArrayValue() {
        assertThat(Solution().minimizeArrayValue(intArrayOf(3, 7, 1, 6)), equalTo(5))
    }

    @Test
    fun minimizeArrayValue2() {
        assertThat(Solution().minimizeArrayValue(intArrayOf(10, 1)), equalTo(10))
    }
}
