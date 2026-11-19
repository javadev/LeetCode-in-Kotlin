package g4001_4100.s4017_peaks_in_array_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfPeaks() {
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(1, 3, 2, 4),
                    arrayOf<IntArray>(intArrayOf(1, 0, 3), intArrayOf(2, 1, 1), intArrayOf(1, 0, 3)),
                ),
            equalTo<LongArray>(longArrayOf(2L, 0L)),
        )
    }

    @Test
    fun countOfPeaks2() {
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(9, 8, 9, 8),
                    arrayOf<IntArray>(intArrayOf(1, 1, 3), intArrayOf(2, 2, 1), intArrayOf(1, 0, 2)),
                ),
            equalTo<LongArray>(longArrayOf(1L, 0L)),
        )
    }

    @Test
    fun countOfPeaks3() {
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(3, 6, 2, 7, 1),
                    arrayOf<IntArray>(intArrayOf(1, 1, 3), intArrayOf(2, 3, 0), intArrayOf(1, 0, 4)),
                ),
            equalTo<LongArray>(longArrayOf(0L, 3L)),
        )
    }

    @Test
    fun countOfPeaks4() {
        // n < 3, no peaks can exist
        assertThat<LongArray>(
            Solution().countOfPeaks(intArrayOf(5, 10), arrayOf<IntArray>(intArrayOf(1, 0, 1))),
            equalTo<LongArray>(longArrayOf(0L)),
        )
    }

    @Test
    fun countOfPeaks5() {
        assertThat<LongArray>(
            Solution().countOfPeaks(intArrayOf(7), arrayOf<IntArray>(intArrayOf(1, 0, 0))),
            equalTo<LongArray>(longArrayOf(0L)),
        )
    }

    @Test
    fun countOfPeaks6() {
        // Range with fewer than 3 elements yields 0
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(1, 3, 2, 4, 1),
                    arrayOf<IntArray>(intArrayOf(1, 0, 1), intArrayOf(1, 2, 3)),
                ),
            equalTo<LongArray>(longArrayOf(0L, 0L)),
        )
    }

    @Test
    fun countOfPeaks7() {
        assertThat<LongArray>(
            Solution().countOfPeaks(intArrayOf(1, 2, 3, 4, 5), arrayOf<IntArray>(intArrayOf(1, 0, 4))),
            equalTo<LongArray>(longArrayOf(0L)),
        )
    }

    @Test
    fun countOfPeaks8() {
        assertThat<LongArray>(
            Solution().countOfPeaks(intArrayOf(5, 4, 3, 2, 1), arrayOf<IntArray>(intArrayOf(1, 0, 4))),
            equalTo<LongArray>(longArrayOf(0L)),
        )
    }

    @Test
    fun countOfPeaks9() {
        // No type-1 queries, result array is empty
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(1, 3, 2, 4, 1),
                    arrayOf<IntArray>(intArrayOf(2, 1, 10), intArrayOf(2, 3, 0)),
                ),
            equalTo<LongArray>(longArrayOf()),
        )
    }

    @Test
    fun countOfPeaks10() {
        // Initially no peak in [0,3]; update makes index 2 a peak
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(1, 2, 3, 4),
                    arrayOf<IntArray>(intArrayOf(1, 0, 3), intArrayOf(2, 2, 10), intArrayOf(1, 0, 3)),
                ),
            equalTo<LongArray>(longArrayOf(0L, 2L)),
        )
    }

    @Test
    fun countOfPeaks11() {
        // Initially a peak at index 1; update removes it
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(1, 5, 1, 2),
                    arrayOf<IntArray>(intArrayOf(1, 0, 3), intArrayOf(2, 1, 0), intArrayOf(1, 0, 3)),
                ),
            equalTo<LongArray>(longArrayOf(2L, 0L)),
        )
    }

    @Test
    fun countOfPeaks12() {
        // All equal -> no peaks (peak requires strictly greater)
        assertThat<LongArray>(
            Solution().countOfPeaks(intArrayOf(3, 3, 3, 3, 3), arrayOf<IntArray>(intArrayOf(1, 0, 4))),
            equalTo<LongArray>(longArrayOf(0L)),
        )
    }

    @Test
    fun countOfPeaks13() {
        assertThat<LongArray>(
            Solution()
                .countOfPeaks(
                    intArrayOf(4, 2, 0, 4, 2, 14, 13),
                    arrayOf<IntArray>(intArrayOf(1, 5, 6), intArrayOf(1, 5, 6), intArrayOf(1, 2, 6)),
                ),
            equalTo<LongArray>(longArrayOf(0L, 0L, 5L)),
        )
    }
}
