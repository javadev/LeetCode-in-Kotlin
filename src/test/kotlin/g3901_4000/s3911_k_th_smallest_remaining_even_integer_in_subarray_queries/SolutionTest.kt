package g3901_4000.s3911_k_th_smallest_remaining_even_integer_in_subarray_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthRemainingInteger() {
        assertThat<IntArray>(
            Solution()
                .kthRemainingInteger(
                    intArrayOf(1, 4, 7),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(1, 1, 2), intArrayOf(0, 0, 3)),
                ),
            equalTo<IntArray>(intArrayOf(2, 6, 6)),
        )
    }

    @Test
    fun kthRemainingInteger2() {
        assertThat<IntArray>(
            Solution()
                .kthRemainingInteger(
                    intArrayOf(2, 5, 8),
                    arrayOf<IntArray>(intArrayOf(0, 1, 2), intArrayOf(1, 2, 1), intArrayOf(0, 2, 4)),
                ),
            equalTo<IntArray>(intArrayOf(6, 2, 12)),
        )
    }

    @Test
    fun kthRemainingInteger3() {
        assertThat<IntArray>(
            Solution()
                .kthRemainingInteger(intArrayOf(3, 6), arrayOf<IntArray>(intArrayOf(0, 1, 1), intArrayOf(1, 1, 3))),
            equalTo<IntArray>(intArrayOf(2, 8)),
        )
    }

    @Test
    fun kthRemainingInteger4() {
        assertThat<IntArray>(
            Solution()
                .kthRemainingInteger(
                    intArrayOf(2, 4, 6),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 1000000000)),
                ),
            equalTo<IntArray>(intArrayOf(8, 2, 2000000006)),
        )
    }

    @Test
    fun kthRemainingInteger5() {
        assertThat<IntArray>(
            Solution()
                .kthRemainingInteger(
                    intArrayOf(2, 6, 10),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(0, 2, 2), intArrayOf(0, 2, 3)),
                ),
            equalTo<IntArray>(intArrayOf(4, 8, 12)),
        )
    }

    @Test
    fun kthRemainingInteger6() {
        assertThat<IntArray>(
            Solution()
                .kthRemainingInteger(
                    intArrayOf(1, 3, 5),
                    arrayOf<IntArray>(intArrayOf(0, 2, 1), intArrayOf(1, 2, 4)),
                ),
            equalTo<IntArray>(intArrayOf(2, 8)),
        )
    }
}
