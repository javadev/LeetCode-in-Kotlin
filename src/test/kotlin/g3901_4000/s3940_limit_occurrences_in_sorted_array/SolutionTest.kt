package g3901_4000.s3940_limit_occurrences_in_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun limitOccurrences() {
        assertThat<IntArray>(
            Solution().limitOccurrences(intArrayOf(1, 1, 1, 2, 2, 3), 2),
            equalTo<IntArray>(intArrayOf(1, 1, 2, 2, 3)),
        )
    }

    @Test
    fun limitOccurrences2() {
        assertThat<IntArray>(
            Solution().limitOccurrences(intArrayOf(1, 2, 3), 1),
            equalTo<IntArray>(intArrayOf(1, 2, 3)),
        )
    }

    @Test
    fun limitOccurrences3() {
        assertThat<IntArray>(
            Solution().limitOccurrences(intArrayOf(5, 5, 5), 1),
            equalTo<IntArray>(intArrayOf(5)),
        )
    }

    @Test
    fun limitOccurrences4() {
        assertThat<IntArray>(
            Solution().limitOccurrences(intArrayOf(100), 1),
            equalTo<IntArray>(intArrayOf(100)),
        )
    }

    @Test
    fun limitOccurrences5() {
        assertThat<IntArray>(
            Solution().limitOccurrences(intArrayOf(1, 1, 2, 2), 4),
            equalTo<IntArray>(intArrayOf(1, 1, 2, 2)),
        )
    }
}
