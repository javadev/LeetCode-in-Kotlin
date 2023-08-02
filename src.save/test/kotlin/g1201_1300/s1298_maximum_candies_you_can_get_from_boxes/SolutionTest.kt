package g1201_1300.s1298_maximum_candies_you_can_get_from_boxes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxCandies() {
        assertThat(
            Solution()
                .maxCandies(
                    intArrayOf(1, 0, 1, 0), intArrayOf(7, 5, 4, 100),
                    arrayOf(
                        intArrayOf(), intArrayOf(), intArrayOf(1),
                        intArrayOf()
                    ),
                    arrayOf(
                        intArrayOf(1, 2), intArrayOf(3),
                        intArrayOf(), intArrayOf()
                    ),
                    intArrayOf(0)
                ),
            equalTo(16)
        )
    }

    @Test
    fun maxCandies2() {
        assertThat(
            Solution()
                .maxCandies(
                    intArrayOf(1, 0, 0, 0, 0, 0),
                    intArrayOf(1, 1, 1, 1, 1, 1),
                    arrayOf(
                        intArrayOf(1, 2, 3, 4, 5),
                        intArrayOf(), intArrayOf(), intArrayOf(), intArrayOf(), intArrayOf()
                    ),
                    arrayOf(
                        intArrayOf(1, 2, 3, 4, 5), intArrayOf(), intArrayOf(),
                        intArrayOf(), intArrayOf(), intArrayOf()
                    ),
                    intArrayOf(0)
                ),
            equalTo(6)
        )
    }
}
