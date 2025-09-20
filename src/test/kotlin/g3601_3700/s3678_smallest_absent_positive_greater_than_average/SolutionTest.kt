package g3601_3700.s3678_smallest_absent_positive_greater_than_average

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestAbsent() {
        assertThat<Int>(Solution().smallestAbsent(intArrayOf(3, 5)), equalTo<Int>(6))
    }

    @Test
    fun smallestAbsent2() {
        assertThat<Int>(Solution().smallestAbsent(intArrayOf(-1, 1, 2)), equalTo<Int>(3))
    }

    @Test
    fun smallestAbsent3() {
        assertThat<Int>(Solution().smallestAbsent(intArrayOf(4, -1)), equalTo<Int>(2))
    }

    @Test
    fun smallestAbsent4() {
        assertThat<Int>(Solution().smallestAbsent(intArrayOf(-2, -1)), equalTo<Int>(1))
    }
}
