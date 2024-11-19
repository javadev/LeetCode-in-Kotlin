package g2201_2300.s2234_maximum_total_beauty_of_the_gardens

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumBeauty() {
        assertThat(
            Solution().maximumBeauty(intArrayOf(1, 3, 1, 1), 7, 6, 12, 1),
            equalTo(14L),
        )
    }

    @Test
    fun maximumBeauty2() {
        assertThat(
            Solution().maximumBeauty(intArrayOf(2, 4, 5, 3), 10, 5, 2, 6),
            equalTo(30L),
        )
    }
}
