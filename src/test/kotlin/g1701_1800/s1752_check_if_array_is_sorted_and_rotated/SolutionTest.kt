package g1701_1800.s1752_check_if_array_is_sorted_and_rotated

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun check() {
        assertThat(Solution().check(intArrayOf(3, 4, 5, 1, 2)), equalTo(true))
    }

    @Test
    fun check2() {
        assertThat(Solution().check(intArrayOf(2, 1, 3, 4)), equalTo(false))
    }

    @Test
    fun check3() {
        assertThat(Solution().check(intArrayOf(1, 2, 3)), equalTo(true))
    }
}
