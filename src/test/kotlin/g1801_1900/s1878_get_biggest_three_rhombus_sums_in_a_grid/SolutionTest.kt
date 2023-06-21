package g1801_1900.s1878_get_biggest_three_rhombus_sums_in_a_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val biggestThree: Unit
        get() {
            assertThat(
                Solution()
                    .getBiggestThree(
                        arrayOf(
                            intArrayOf(3, 4, 5, 1, 3),
                            intArrayOf(3, 3, 4, 2, 3),
                            intArrayOf(20, 30, 200, 40, 10),
                            intArrayOf(1, 5, 5, 4, 1),
                            intArrayOf(4, 3, 2, 2, 5)
                        )
                    ),
                equalTo(intArrayOf(228, 216, 211))
            )
        }

    @get:Test
    val biggestThree2: Unit
        get() {
            assertThat(
                Solution().getBiggestThree(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
                equalTo(intArrayOf(20, 9, 8))
            )
        }

    @get:Test
    val biggestThree3: Unit
        get() {
            assertThat(
                Solution().getBiggestThree(arrayOf(intArrayOf(7, 7, 7))),
                equalTo(
                    intArrayOf(7)
                )
            )
        }
}
