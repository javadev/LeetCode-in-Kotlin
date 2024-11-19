package g2101_2200.s2101_detonate_the_maximum_bombs

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumDetonation() {
        assertThat(
            Solution().maximumDetonation(arrayOf(intArrayOf(2, 1, 3), intArrayOf(6, 1, 4))),
            equalTo(2),
        )
    }

    @Test
    fun maximumDetonation2() {
        assertThat(
            Solution().maximumDetonation(arrayOf(intArrayOf(1, 1, 5), intArrayOf(10, 10, 5))),
            equalTo(1),
        )
    }

    @Test
    fun maximumDetonation3() {
        assertThat(
            Solution()
                .maximumDetonation(
                    arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(2, 3, 1),
                        intArrayOf(3, 4, 2),
                        intArrayOf(4, 5, 3),
                        intArrayOf(5, 6, 4),
                    ),
                ),
            equalTo(5),
        )
    }
}
