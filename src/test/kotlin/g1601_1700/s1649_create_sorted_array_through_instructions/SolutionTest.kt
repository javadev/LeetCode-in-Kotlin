package g1601_1700.s1649_create_sorted_array_through_instructions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createSortedArray() {
        assertThat(Solution().createSortedArray(intArrayOf(1, 5, 6, 2)), equalTo(1))
    }

    @Test
    fun createSortedArray2() {
        assertThat(Solution().createSortedArray(intArrayOf(1, 2, 3, 6, 5, 4)), equalTo(3))
    }

    @Test
    fun createSortedArray3() {
        assertThat(
            Solution().createSortedArray(intArrayOf(1, 3, 3, 3, 2, 4, 2, 1, 2)),
            equalTo(4),
        )
    }
}
