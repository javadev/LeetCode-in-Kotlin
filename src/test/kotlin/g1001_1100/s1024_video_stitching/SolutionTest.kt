package g1001_1100.s1024_video_stitching

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun videoStitching() {
        assertThat(
            Solution()
                .videoStitching(
                    arrayOf(
                        intArrayOf(0, 2),
                        intArrayOf(4, 6),
                        intArrayOf(8, 10),
                        intArrayOf(1, 9),
                        intArrayOf(1, 5),
                        intArrayOf(5, 9),
                    ),
                    10,
                ),
            equalTo(3),
        )
    }

    @Test
    fun videoStitching2() {
        assertThat(
            Solution()
                .videoStitching(
                    arrayOf(
                        intArrayOf(0, 1),
                        intArrayOf(6, 8),
                        intArrayOf(0, 2),
                        intArrayOf(5, 6),
                        intArrayOf(0, 4),
                        intArrayOf(0, 3),
                        intArrayOf(6, 7),
                        intArrayOf(1, 3),
                        intArrayOf(4, 7),
                        intArrayOf(1, 4),
                        intArrayOf(2, 5),
                        intArrayOf(2, 6),
                        intArrayOf(3, 4),
                        intArrayOf(4, 5),
                        intArrayOf(5, 7),
                        intArrayOf(6, 9),
                    ),
                    9,
                ),
            equalTo(3),
        )
    }

    @Test
    fun videoStitching3() {
        assertThat(Solution().videoStitching(arrayOf(intArrayOf(0, 1), intArrayOf(1, 2)), 5), equalTo(-1))
    }
}
