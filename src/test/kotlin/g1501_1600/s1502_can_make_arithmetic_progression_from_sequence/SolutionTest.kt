package g1501_1600.s1502_can_make_arithmetic_progression_from_sequence

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMakeArithmeticProgression() {
        MatcherAssert.assertThat(
            Solution().canMakeArithmeticProgression(intArrayOf(3, 5, 1)),
            CoreMatchers.equalTo(true)
        )
    }

    @Test
    fun canMakeArithmeticProgression2() {
        MatcherAssert.assertThat(
            Solution().canMakeArithmeticProgression(intArrayOf(1, 2, 4)), CoreMatchers.equalTo(false)
        )
    }
}
