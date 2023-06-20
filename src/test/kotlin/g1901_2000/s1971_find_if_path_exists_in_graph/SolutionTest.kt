package g1901_2000.s1971_find_if_path_exists_in_graph

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validPath() {
        assertThat(
            Solution().validPath(3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0)), 0, 2),
            equalTo(true)
        )
    }

    @Test
    fun validPath2() {
        assertThat(
            Solution()
                .validPath(
                    6,
                    arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(3, 5), intArrayOf(5, 4), intArrayOf(4, 3)),
                    0,
                    5
                ),
            equalTo(false)
        )
    }
}
