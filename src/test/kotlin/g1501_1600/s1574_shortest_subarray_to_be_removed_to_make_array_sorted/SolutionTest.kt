package g1501_1600.s1574_shortest_subarray_to_be_removed_to_make_array_sorted

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findLengthOfShortestSubarray() {
        MatcherAssert.assertThat(
            Solution().findLengthOfShortestSubarray(intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)),
            CoreMatchers.equalTo(3)
        )
    }

    @Test
    fun findLengthOfShortestSubarray2() {
        MatcherAssert.assertThat(
            Solution().findLengthOfShortestSubarray(intArrayOf(5, 4, 3, 2, 1)), CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun findLengthOfShortestSubarray3() {
        MatcherAssert.assertThat(Solution().findLengthOfShortestSubarray(intArrayOf(1, 2, 3)), CoreMatchers.equalTo(0))
    }
}
