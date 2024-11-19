package g1601_1700.s1636_sort_array_by_increasing_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun frequencySort() {
        assertThat(
            Solution().frequencySort(intArrayOf(1, 1, 2, 2, 2, 3)),
            equalTo(intArrayOf(3, 1, 1, 2, 2, 2)),
        )
    }

    @Test
    fun frequencySort2() {
        assertThat(
            Solution().frequencySort(intArrayOf(2, 3, 1, 3, 2)),
            equalTo(intArrayOf(1, 3, 3, 2, 2)),
        )
    }

    @Test
    fun frequencySort3() {
        assertThat(
            Solution().frequencySort(intArrayOf(-1, 1, -6, 4, 5, -6, 1, 4, 1)),
            equalTo(intArrayOf(5, -1, 4, 4, -6, -6, 1, 1, 1)),
        )
    }
}
