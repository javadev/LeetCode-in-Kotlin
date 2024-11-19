package g2901_3000.s2948_make_lexicographically_smallest_array_by_swapping_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lexicographicallySmallestArray() {
        assertThat(
            Solution().lexicographicallySmallestArray(intArrayOf(1, 5, 3, 9, 8), 2),
            equalTo(intArrayOf(1, 3, 5, 8, 9)),
        )
    }

    @Test
    fun lexicographicallySmallestArray2() {
        assertThat(
            Solution().lexicographicallySmallestArray(intArrayOf(1, 7, 6, 18, 2, 1), 3),
            equalTo(intArrayOf(1, 6, 7, 18, 1, 2)),
        )
    }

    @Test
    fun lexicographicallySmallestArray3() {
        assertThat(
            Solution().lexicographicallySmallestArray(intArrayOf(1, 7, 28, 19, 10), 3),
            equalTo(intArrayOf(1, 7, 28, 19, 10)),
        )
    }
}
