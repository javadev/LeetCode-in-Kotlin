package g3101_3200.s3187_peaks_in_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countOfPeaks() {
        assertThat(
            Solution()
                .countOfPeaks(
                    intArrayOf(3, 1, 4, 2, 5), arrayOf(intArrayOf(2, 3, 4), intArrayOf(1, 0, 4))
                ),
            equalTo(listOf(0))
        )
    }

    @Test
    fun countOfPeaks2() {
        assertThat(
            Solution()
                .countOfPeaks(
                    intArrayOf(4, 1, 4, 2, 1, 5),
                    arrayOf(intArrayOf(2, 2, 4), intArrayOf(1, 0, 2), intArrayOf(1, 0, 4))
                ),
            equalTo(listOf(0, 1))
        )
    }
}
