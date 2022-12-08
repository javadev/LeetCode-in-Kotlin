package g0401_0500.s0427_construct_quad_tree

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun construct() {
        assertThat(
            Solution().construct(arrayOf(intArrayOf(0, 1), intArrayOf(1, 0))).toString(),
            equalTo("[0,1][1,0][1,1][1,1][1,0]")
        )
    }

    @Test
    fun construct2() {
        assertThat(
            Solution()
                .construct(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1, 0, 0, 0, 0),
                        intArrayOf(1, 1, 1, 1, 0, 0, 0, 0),
                        intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1, 1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1, 0, 0, 0, 0),
                        intArrayOf(1, 1, 1, 1, 0, 0, 0, 0),
                        intArrayOf(1, 1, 1, 1, 0, 0, 0, 0),
                        intArrayOf(1, 1, 1, 1, 0, 0, 0, 0)
                    )
                )
                .toString(),
            equalTo("[0,1][1,1][0,1][1,1][1,0]")
        )
    }
}
