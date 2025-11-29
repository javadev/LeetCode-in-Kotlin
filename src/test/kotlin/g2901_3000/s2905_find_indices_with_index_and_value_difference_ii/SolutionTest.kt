package g2901_3000.s2905_find_indices_with_index_and_value_difference_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findIndices() {
        assertThat(
            Solution().findIndices(intArrayOf(5, 1, 4, 1), 2, 4),
            equalTo(intArrayOf(0, 3)),
        )
    }

    @Test
    fun findIndices2() {
        assertThat(Solution().findIndices(intArrayOf(2, 1), 0, 0), equalTo(intArrayOf(0, 0)))
    }

    @Test
    fun findIndices3() {
        assertThat(
            Solution().findIndices(intArrayOf(1, 2, 3), 2, 4),
            equalTo(intArrayOf(-1, -1)),
        )
    }

    @Test
    fun findIndices4() {
        val big = IntArray(100_000)
        val result = Solution().findIndices(big, 1, 1_000_000_000)
        assertThat(result, equalTo(intArrayOf(49998, 50000)))
    }

    @Test
    fun findIndices5() {
        val big = IntArray(100_001)
        val result = Solution().findIndices(big, 2, 100_000)
        assertThat(result, equalTo(intArrayOf(-1, -1)))
    }

    @Test
    fun findIndices6() {
        val big = IntArray(100_001)
        val result = Solution().findIndices(big, 5, 1_000_000_000)
        assertThat(result, equalTo(intArrayOf(-1, -1)))
    }

    @Test
    fun findIndices7() {
        val result = Solution().findIndices(intArrayOf(1, 1, 10), 1, 5)
        assertThat(result, equalTo(intArrayOf(0, 2)))
    }

    @Test
    fun findIndices8() {
        val result = Solution().findIndices(intArrayOf(7, 7, 7), 3, 1)
        assertThat(result, equalTo(intArrayOf(-1, -1)))
    }

    @Test
    fun findIndices9() {
        val result = Solution().findIndices(intArrayOf(9, 3, 5), 0, 0)
        assertThat(result, equalTo(intArrayOf(0, 0)))
    }

    @Test
    fun findIndices10() {
        val result = Solution().findIndices(intArrayOf(3, 10, 3), 1, 7)
        assertThat(result, equalTo(intArrayOf(0, 1)))
    }
}
