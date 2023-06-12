package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakeArithmeticProgression() {
        assertThat(
            Solution().canMakeArithmeticProgression(intArrayOf(3, 5, 1)),
            equalTo(true)
        )
    }

    @Test
    fun canMakeArithmeticProgression2() {
        assertThat(
            Solution().canMakeArithmeticProgression(intArrayOf(1, 2, 4)), equalTo(false)
        )
    }
}
