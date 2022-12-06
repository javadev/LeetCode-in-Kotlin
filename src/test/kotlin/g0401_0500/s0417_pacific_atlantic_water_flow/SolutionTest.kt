package g0401_0500.s0417_pacific_atlantic_water_flow

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun pacificAtlantic() {
        val matrix = arrayOf(intArrayOf(2, 3, 5), intArrayOf(3, 4, 4), intArrayOf(5, 3, 1))
        assertThat(
            Solution().pacificAtlantic(matrix),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0, 2),
                        intArrayOf(1, 1),
                        intArrayOf(1, 2),
                        intArrayOf(2, 0)
                    )
                )
            )
        )
    }

    @Test
    fun pacificAtlantic2() {
        val matrix = arrayOf(intArrayOf(1,2,2,3,5), intArrayOf(3,2,3,4,4), intArrayOf(2,4,5,3,1), intArrayOf(6,7,1,4,5), intArrayOf(5,1,1,2,4))
        assertThat(
            Solution().pacificAtlantic(matrix),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0,4),
                        intArrayOf(1, 3),
                        intArrayOf(1, 4),
                        intArrayOf(2, 2),
                        intArrayOf(3,0),
                        intArrayOf(3,1),
                        intArrayOf(4, 0),
                    )
                )
            )
        )
    }

    @Test
    fun pacificAtlantic3() {
        val matrix = arrayOf(intArrayOf(1))
        assertThat(
            Solution().pacificAtlantic(matrix),
            equalTo(
                ArrayUtils.getLists(
                    arrayOf(
                        intArrayOf(0, 0)
                    )
                )
            )
        )
    }
}
