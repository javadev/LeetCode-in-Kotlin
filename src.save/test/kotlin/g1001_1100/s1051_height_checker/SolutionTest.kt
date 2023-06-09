package g1001_1100.s1051_height_checker

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun heightChecker() {
        assertThat(Solution().heightChecker(intArrayOf(1, 1, 4, 2, 1, 3)), equalTo(3))
    }

    @Test
    fun heightChecker2() {
        assertThat(Solution().heightChecker(intArrayOf(5, 1, 2, 3, 4)), equalTo(5))
    }

    @Test
    fun heightChecker3() {
        assertThat(Solution().heightChecker(intArrayOf(1, 2, 3, 4, 5)), equalTo(0))
    }
}
