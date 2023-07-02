package g2201_2300.s2270_number_of_ways_to_split_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun waysToSplitArray() {
        assertThat(Solution().waysToSplitArray(intArrayOf(10, 4, -8, 7)), equalTo(2))
    }

    @Test
    fun waysToSplitArray2() {
        assertThat(Solution().waysToSplitArray(intArrayOf(2, 3, 1, 0)), equalTo(2))
    }
}
