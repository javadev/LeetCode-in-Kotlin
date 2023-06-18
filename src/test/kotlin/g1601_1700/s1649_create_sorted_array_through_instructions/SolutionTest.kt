package g1601_1700.s1649_create_sorted_array_through_instructions

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun createSortedArray() {
        MatcherAssert.assertThat(Solution().createSortedArray(intArrayOf(1, 5, 6, 2)), CoreMatchers.equalTo(1))
    }

    @Test
    fun createSortedArray2() {
        MatcherAssert.assertThat(Solution().createSortedArray(intArrayOf(1, 2, 3, 6, 5, 4)), CoreMatchers.equalTo(3))
    }

    @Test
    fun createSortedArray3() {
        MatcherAssert.assertThat(
            Solution().createSortedArray(intArrayOf(1, 3, 3, 3, 2, 4, 2, 1, 2)),
            CoreMatchers.equalTo(4)
        )
    }
}
