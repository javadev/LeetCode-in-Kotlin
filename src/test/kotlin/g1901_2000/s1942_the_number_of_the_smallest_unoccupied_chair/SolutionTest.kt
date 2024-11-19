package g1901_2000.s1942_the_number_of_the_smallest_unoccupied_chair

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestChair() {
        assertThat(
            Solution().smallestChair(arrayOf(intArrayOf(1, 4), intArrayOf(2, 3), intArrayOf(4, 6)), 1),
            equalTo(1),
        )
    }

    @Test
    fun smallestChair2() {
        assertThat(
            Solution().smallestChair(arrayOf(intArrayOf(3, 10), intArrayOf(1, 5), intArrayOf(2, 6)), 0),
            equalTo(2),
        )
    }
}
