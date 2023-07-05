package g2401_2500.s2441_largest_positive_integer_that_exists_with_its_negative

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findMaxK() {
        assertThat(Solution().findMaxK(intArrayOf(-1, 2, -3, 3)), equalTo(3))
    }

    @Test
    fun findMaxK2() {
        assertThat(Solution().findMaxK(intArrayOf(-1, 10, 6, 7, -7, 1)), equalTo(7))
    }

    @Test
    fun findMaxK3() {
        assertThat(Solution().findMaxK(intArrayOf(-10, 8, 6, 7, -2, -3)), equalTo(-1))
    }
}
