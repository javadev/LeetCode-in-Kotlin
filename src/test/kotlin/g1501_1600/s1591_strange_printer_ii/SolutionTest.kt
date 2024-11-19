package g1501_1600.s1591_strange_printer_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPrintable() {
        assertThat(
            Solution()
                .isPrintable(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 2, 2, 1),
                        intArrayOf(1, 2, 2, 1),
                        intArrayOf(1, 1, 1, 1),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPrintable2() {
        assertThat(
            Solution()
                .isPrintable(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 3, 3),
                        intArrayOf(1, 1, 3, 4),
                        intArrayOf(5, 5, 1, 4),
                    ),
                ),
            equalTo(true),
        )
    }

    @Test
    fun isPrintable3() {
        assertThat(
            Solution().isPrintable(arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 1, 2), intArrayOf(1, 2, 1))),
            equalTo(false),
        )
    }
}
