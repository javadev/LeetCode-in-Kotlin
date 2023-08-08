package g2701_2800.s2749_minimum_operations_to_make_the_integer_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeTheIntegerZero() {
        assertThat(Solution().makeTheIntegerZero(3, -2), equalTo(3))
    }

    @Test
    fun makeTheIntegerZero2() {
        assertThat(Solution().makeTheIntegerZero(5, 7), equalTo(-1))
    }
}
