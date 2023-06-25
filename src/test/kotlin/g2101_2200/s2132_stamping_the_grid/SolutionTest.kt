package g2101_2200.s2132_stamping_the_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun possibleToStamp() {
        assertThat(
            Solution()
                .possibleToStamp(
                    arrayOf(
                        intArrayOf(1, 0, 0, 0),
                        intArrayOf(1, 0, 0, 0),
                        intArrayOf(1, 0, 0, 0),
                        intArrayOf(1, 0, 0, 0),
                        intArrayOf(1, 0, 0, 0)
                    ),
                    4,
                    3
                ),
            equalTo(true)
        )
    }

    @Test
    fun possibleToStamp2() {
        assertThat(
            Solution()
                .possibleToStamp(
                    arrayOf(
                        intArrayOf(1, 0, 0, 0),
                        intArrayOf(0, 1, 0, 0),
                        intArrayOf(0, 0, 1, 0),
                        intArrayOf(0, 0, 0, 1)
                    ),
                    2,
                    2
                ),
            equalTo(false)
        )
    }

    @Test
    fun possibleToStamp3() {
        assertThat(
            Solution()
                .possibleToStamp(
                    arrayOf(
                        intArrayOf(0, 0, 0, 0, 0),
                        intArrayOf(0, 0, 0, 0, 0),
                        intArrayOf(0, 0, 1, 0, 0),
                        intArrayOf(0, 0, 0, 0, 1),
                        intArrayOf(0, 0, 0, 1, 1)
                    ),
                    2,
                    2
                ),
            equalTo(false)
        )
    }

    @Test
    fun possibleToStamp4() {
        assertThat(
            Solution()
                .possibleToStamp(
                    arrayOf(
                        intArrayOf(0),
                        intArrayOf(0),
                        intArrayOf(0),
                        intArrayOf(0),
                        intArrayOf(1),
                        intArrayOf(1),
                        intArrayOf(0),
                        intArrayOf(0),
                        intArrayOf(1)
                    ),
                    9, 1
                ),
            equalTo(false)
        )
    }

    @Test
    fun possibleToStamp5() {
        assertThat(
            Solution().possibleToStamp(arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(0), intArrayOf(0)), 3, 1),
            equalTo(false)
        )
    }

    @Test
    fun possibleToStamp6() {
        assertThat(
            Solution().possibleToStamp(arrayOf(intArrayOf(0, 1), intArrayOf(0, 0)), 2, 2), equalTo(false)
        )
    }

    @Test
    fun possibleToStamp7() {
        assertThat(
            Solution().possibleToStamp(arrayOf(intArrayOf(1, 1, 0, 0)), 1, 3), equalTo(false)
        )
    }
}
