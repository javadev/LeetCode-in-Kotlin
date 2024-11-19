package g1601_1700.s1610_maximum_number_of_visible_points

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun visiblePoints() {
        assertThat(
            Solution()
                .visiblePoints(
                    listOf(
                        listOf(2, 1),
                        listOf(2, 2),
                        listOf(2, 3),
                    ),
                    90,
                    listOf(1, 1),
                ),
            equalTo(3),
        )
    }

    @Test
    fun visiblePoints2() {
        assertThat(
            Solution()
                .visiblePoints(
                    listOf(
                        listOf(2, 1),
                        listOf(2, 2),
                        listOf(3, 4),
                        listOf(1, 1),
                    ),
                    90,
                    listOf(1, 1),
                ),
            equalTo(4),
        )
    }

    @Test
    fun visiblePoints3() {
        assertThat(
            Solution()
                .visiblePoints(
                    listOf(listOf(1, 0), listOf(2, 1)),
                    13,
                    listOf(1, 1),
                ),
            equalTo(1),
        )
    }
}
