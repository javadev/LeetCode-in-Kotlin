package g1501_1600.s1591_strange_printer_ii

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isPrintable: Unit
        get() {
            MatcherAssert.assertThat(
                Solution()
                    .isPrintable(
                        arrayOf(
                            intArrayOf(1, 1, 1, 1),
                            intArrayOf(1, 2, 2, 1),
                            intArrayOf(1, 2, 2, 1),
                            intArrayOf(1, 1, 1, 1)
                        )
                    ),
                CoreMatchers.equalTo(true)
            )
        }

    @get:Test
    val isPrintable2: Unit
        get() {
            MatcherAssert.assertThat(
                Solution()
                    .isPrintable(
                        arrayOf(
                            intArrayOf(1, 1, 1, 1),
                            intArrayOf(1, 1, 3, 3),
                            intArrayOf(1, 1, 3, 4),
                            intArrayOf(5, 5, 1, 4)
                        )
                    ),
                CoreMatchers.equalTo(true)
            )
        }

    @get:Test
    val isPrintable3: Unit
        get() {
            MatcherAssert.assertThat(
                Solution().isPrintable(arrayOf(intArrayOf(1, 2, 1), intArrayOf(2, 1, 2), intArrayOf(1, 2, 1))),
                CoreMatchers.equalTo(false)
            )
        }
}
