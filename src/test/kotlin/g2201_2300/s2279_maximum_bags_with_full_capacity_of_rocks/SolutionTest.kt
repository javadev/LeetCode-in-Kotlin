package g2201_2300.s2279_maximum_bags_with_full_capacity_of_rocks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumBags() {
        assertThat(
            Solution().maximumBags(intArrayOf(2, 3, 4, 5), intArrayOf(1, 2, 4, 4), 2),
            equalTo(3)
        )
    }

    @Test
    fun maximumBags2() {
        assertThat(
            Solution().maximumBags(intArrayOf(10, 2, 2), intArrayOf(2, 2, 0), 100),
            equalTo(3)
        )
    }

    @Test
    fun maximumBags3() {
        assertThat(
            Solution()
                .maximumBags(
                    intArrayOf(91, 54, 63, 99, 24, 45, 78), intArrayOf(35, 32, 45, 98, 6, 1, 25),
                    17
                ),
            equalTo(1)
        )
    }
}
