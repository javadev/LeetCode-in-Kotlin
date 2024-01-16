package g2901_3000.s2956_find_common_elements_between_two_arrays

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findIntersectionValues() {
        MatcherAssert.assertThat(
            Solution()
                .findIntersectionValues(
                    intArrayOf(4, 3, 2, 3, 1), intArrayOf(2, 2, 5, 2, 3, 6)
                ),
            CoreMatchers.equalTo(intArrayOf(3, 4))
        )
    }

    @Test
    fun findIntersectionValues2() {
        MatcherAssert.assertThat(
            Solution().findIntersectionValues(intArrayOf(3, 4, 2, 3), intArrayOf(1, 5)),
            CoreMatchers.equalTo(intArrayOf(0, 0))
        )
    }
}
