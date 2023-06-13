package g1501_1600.s1559_detect_cycles_in_2d_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsCycle() {
        assertThat(
            Solution()
                .containsCycle(
                    arrayOf(
                        charArrayOf('a', 'a', 'a', 'a'),
                        charArrayOf('a', 'b', 'b', 'a'),
                        charArrayOf('a', 'b', 'b', 'a'),
                        charArrayOf('a', 'a', 'a', 'a')
                    )
                ),
            equalTo(true)
        )
    }

    @Test
    fun containsCycle2() {
        assertThat(
            Solution()
                .containsCycle(
                    arrayOf(
                        charArrayOf('c', 'c', 'c', 'a'),
                        charArrayOf('c', 'd', 'c', 'c'),
                        charArrayOf('c', 'c', 'e', 'c'),
                        charArrayOf('f', 'c', 'c', 'c')
                    )
                ),
            equalTo(true)
        )
    }

    @Test
    fun containsCycle3() {
        assertThat(
            Solution()
                .containsCycle(
                    arrayOf(
                        charArrayOf('a', 'b', 'b'),
                        charArrayOf('b', 'z', 'b'),
                        charArrayOf('b', 'b', 'a')
                    )
                ),
            equalTo(false)
        )
    }
}
