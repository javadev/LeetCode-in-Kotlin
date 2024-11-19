package g1101_1200.s1122_relative_sort_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun relativeSortArray() {
        assertThat(
            Solution()
                .relativeSortArray(intArrayOf(2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19), intArrayOf(2, 1, 4, 3, 9, 6)),
            equalTo(intArrayOf(2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19)),
        )
    }

    @Test
    fun relativeSortArray2() {
        assertThat(
            Solution()
                .relativeSortArray(intArrayOf(28, 6, 22, 8, 44, 17), intArrayOf(22, 28, 8, 6)),
            equalTo(intArrayOf(22, 28, 8, 6, 17, 44)),
        )
    }
}
