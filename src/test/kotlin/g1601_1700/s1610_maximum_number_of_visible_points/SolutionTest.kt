package g1601_1700.s1610_maximum_number_of_visible_points

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun visiblePoints() {
        MatcherAssert.assertThat(
            Solution()
                .visiblePoints(
                    listOf(
                        listOf(2, 1),
                        listOf(2, 2),
                        listOf(2, 3)
                    ),
                    90,
                    listOf(1, 1)
                ),
            CoreMatchers.equalTo(3)
        )
    }

    @Test
    fun visiblePoints2() {
        MatcherAssert.assertThat(
            Solution()
                .visiblePoints(
                    listOf(
                        listOf(2, 1),
                        listOf(2, 2),
                        listOf(3, 4),
                        listOf(1, 1)
                    ),
                    90,
                    listOf(1, 1)
                ),
            CoreMatchers.equalTo(4)
        )
    }

    @Test
    fun visiblePoints3() {
        MatcherAssert.assertThat(
            Solution()
                .visiblePoints(
                    listOf(listOf(1, 0), listOf(2, 1)),
                    13,
                    listOf(1, 1)
                ),
            CoreMatchers.equalTo(1)
        )
    }
}
