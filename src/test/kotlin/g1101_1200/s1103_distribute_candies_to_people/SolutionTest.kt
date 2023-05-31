package g1101_1200.s1103_distribute_candies_to_people

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCandies() {
        assertThat(Solution().distributeCandies(7, 4), equalTo(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun distributeCandies2() {
        assertThat(Solution().distributeCandies(10, 3), equalTo(intArrayOf(5, 2, 3)))
    }
}
