package g1501_1600.s1574_shortest_subarray_to_be_removed_to_make_array_sorted

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLengthOfShortestSubarray() {
        assertThat(
            Solution().findLengthOfShortestSubarray(intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)),
            equalTo(3)
        )
    }

    @Test
    fun findLengthOfShortestSubarray2() {
        assertThat(
            Solution().findLengthOfShortestSubarray(intArrayOf(5, 4, 3, 2, 1)), equalTo(4)
        )
    }

    @Test
    fun findLengthOfShortestSubarray3() {
        assertThat(Solution().findLengthOfShortestSubarray(intArrayOf(1, 2, 3)), equalTo(0))
    }
}
