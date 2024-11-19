package g0501_0600.s0554_brick_wall

import com_github_leetcode.ArrayUtils
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun leastBricks() {
        assertThat(
            Solution()
                .leastBricks(
                    ArrayUtils.getLists(
                        arrayOf(
                            intArrayOf(1, 2, 2, 1),
                            intArrayOf(3, 1, 2),
                            intArrayOf(1, 3, 2),
                            intArrayOf(2, 4),
                            intArrayOf(3, 1, 2),
                            intArrayOf(1, 3, 1, 1),
                        ),
                    ),
                ),
            equalTo(2),
        )
    }

    @Test
    fun leastBricks2() {
        assertThat(
            Solution().leastBricks(ArrayUtils.getLists(arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1)))),
            equalTo(3),
        )
    }
}
