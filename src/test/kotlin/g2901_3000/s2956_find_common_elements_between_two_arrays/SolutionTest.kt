package g2901_3000.s2956_find_common_elements_between_two_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findIntersectionValues() {
        assertThat(
            Solution()
                .findIntersectionValues(
                    intArrayOf(4, 3, 2, 3, 1),
                    intArrayOf(2, 2, 5, 2, 3, 6),
                ),
            equalTo(intArrayOf(3, 4)),
        )
    }

    @Test
    fun findIntersectionValues2() {
        assertThat(
            Solution().findIntersectionValues(intArrayOf(3, 4, 2, 3), intArrayOf(1, 5)),
            equalTo(intArrayOf(0, 0)),
        )
    }
}
