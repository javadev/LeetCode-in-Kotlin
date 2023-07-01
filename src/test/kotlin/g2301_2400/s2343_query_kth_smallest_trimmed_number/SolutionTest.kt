package g2301_2400.s2343_query_kth_smallest_trimmed_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestTrimmedNumbers() {
        assertThat(
            Solution()
                .smallestTrimmedNumbers(
                    arrayOf("102", "473", "251", "814"),
                    arrayOf(intArrayOf(1, 1), intArrayOf(2, 3), intArrayOf(4, 2), intArrayOf(1, 2))
                ),
            equalTo(intArrayOf(2, 2, 1, 0))
        )
    }

    @Test
    fun smallestTrimmedNumbers2() {
        assertThat(
            Solution()
                .smallestTrimmedNumbers(arrayOf("24", "37", "96", "04"), arrayOf(intArrayOf(2, 1), intArrayOf(2, 2))),
            equalTo(intArrayOf(3, 0))
        )
    }
}
