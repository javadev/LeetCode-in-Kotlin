package g0701_0800.s0785_is_graph_bipartite

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isBipartite() {
        assertThat(
            Solution().isBipartite(
                arrayOf(
                    intArrayOf(1, 2, 3),
                    intArrayOf(0, 2),
                    intArrayOf(0, 1, 3),
                    intArrayOf(0, 2),
                ),
            ),
            equalTo(false),
        )
    }

    @Test
    fun isBipartite2() {
        assertThat(
            Solution().isBipartite(arrayOf(intArrayOf(1, 3), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(0, 2))),
            equalTo(true),
        )
    }
}
