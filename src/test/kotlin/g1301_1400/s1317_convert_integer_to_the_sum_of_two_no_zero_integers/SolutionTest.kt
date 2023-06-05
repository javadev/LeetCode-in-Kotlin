package g1301_1400.s1317_convert_integer_to_the_sum_of_two_no_zero_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val noZeroIntegers: Unit
        get() {
            assertThat(Solution().getNoZeroIntegers(2), equalTo(intArrayOf(1, 1)))
        }

    @get:Test
    val noZeroIntegers2: Unit
        get() {
            assertThat(Solution().getNoZeroIntegers(11), equalTo(intArrayOf(2, 9)))
        }
}
