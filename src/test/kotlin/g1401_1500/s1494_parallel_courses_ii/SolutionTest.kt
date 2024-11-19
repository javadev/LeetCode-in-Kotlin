package g1401_1500.s1494_parallel_courses_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNumberOfSemesters() {
        assertThat(
            Solution().minNumberOfSemesters(4, arrayOf(intArrayOf(2, 1), intArrayOf(3, 1), intArrayOf(1, 4)), 2),
            equalTo(3),
        )
    }

    @Test
    fun minNumberOfSemesters2() {
        assertThat(
            Solution()
                .minNumberOfSemesters(
                    5,
                    arrayOf(intArrayOf(2, 1), intArrayOf(3, 1), intArrayOf(4, 1), intArrayOf(1, 5)),
                    2,
                ),
            equalTo(4),
        )
    }

    @Test
    fun minNumberOfSemesters3() {
        assertThat(Solution().minNumberOfSemesters(11, arrayOf(), 2), equalTo(6))
    }
}
