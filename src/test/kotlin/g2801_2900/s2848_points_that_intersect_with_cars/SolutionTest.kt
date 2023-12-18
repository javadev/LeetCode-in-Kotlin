package g2801_2900.s2848_points_that_intersect_with_cars

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.*

internal class SolutionTest {
    @Test
    fun numberOfPoints() {
        assertThat(
            Solution()
                .numberOfPoints(
                    Arrays.asList<List<Int>>(
                        mutableListOf(3, 6),
                        mutableListOf(1, 5),
                        mutableListOf(4, 7)
                    )
                ),
            equalTo(7)
        )
    }

    @Test
    fun numberOfPoints2() {
        assertThat(
            Solution()
                .numberOfPoints(Arrays.asList<List<Int>>(mutableListOf(1, 3), mutableListOf(5, 8))),
            equalTo(7)
        )
    }
}
