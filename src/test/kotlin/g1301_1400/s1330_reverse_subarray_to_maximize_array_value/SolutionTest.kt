package g1301_1400.s1330_reverse_subarray_to_maximize_array_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxValueAfterReverse() {
        assertThat(Solution().maxValueAfterReverse(intArrayOf(2, 3, 1, 5, 4)), equalTo(10))
    }

    @Test
    fun maxValueAfterReverse2() {
        assertThat(
            Solution().maxValueAfterReverse(intArrayOf(2, 4, 9, 24, 2, 1, 10)),
            equalTo(68),
        )
    }
}
