package g1901_2000.s1901_find_a_peak_element_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findPeakGrid() {
        assertThat(
            Solution().findPeakGrid(arrayOf(intArrayOf(1, 4), intArrayOf(3, 2))),
            equalTo(intArrayOf(1, 0)),
        )
    }

    @Test
    fun findPeakGrid2() {
        assertThat(
            Solution().findPeakGrid(arrayOf(intArrayOf(10, 20, 15), intArrayOf(21, 30, 14), intArrayOf(7, 16, 32))),
            equalTo(intArrayOf(1, 1)),
        )
    }

    @Test
    fun findPeakGrid3() {
        assertThat(
            Solution().findPeakGrid(arrayOf(intArrayOf(1, 3, 2, 4))),
            equalTo(intArrayOf(0, 1)),
        )
    }

    @Test
    fun findPeakGrid4() {
        assertThat(
            Solution().findPeakGrid(
                arrayOf(
                    intArrayOf(1),
                    intArrayOf(3),
                    intArrayOf(2),
                    intArrayOf(4),
                ),
            ),
            equalTo(intArrayOf(3, 0)),
        )
    }

    @Test
    fun findPeakGrid5() {
        assertThat(
            Solution().findPeakGrid(
                arrayOf(
                    intArrayOf(2, 2),
                    intArrayOf(2, 2),
                ),
            ),
            equalTo(intArrayOf(0, 1)),
        )
    }

    @Test
    fun findPeakGrid6() {
        val mat = arrayOf(
            intArrayOf(1, 2, 3, 6),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(4, 3, 2, 1),
        )

        val peak = Solution().findPeakGrid(mat)

        assertTrue(peak[0] >= 0 && peak[1] >= 0)

        val value = mat[peak[0]][peak[1]]
        val up = if (peak[0] > 0) mat[peak[0] - 1][peak[1]] else -1
        val down = if (peak[0] < mat.size - 1) mat[peak[0] + 1][peak[1]] else -1
        val left = if (peak[1] > 0) mat[peak[0]][peak[1] - 1] else -1
        val right = if (peak[1] < mat[0].size - 1) mat[peak[0]][peak[1] + 1] else -1

        assertTrue(value > up && value > down && value > left && value > right)
    }

    @Test
    fun findPeakGrid7() {
        assertThat(
            Solution().findPeakGrid(arrayOf(intArrayOf(5))),
            equalTo(intArrayOf(0, 0)),
        )
    }
}
