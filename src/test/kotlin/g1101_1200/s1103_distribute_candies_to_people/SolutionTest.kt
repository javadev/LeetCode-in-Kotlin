package g1101_1200.s1103_distribute_candies_to_people

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distributeCandies() {
        MatcherAssert.assertThat(Solution().distributeCandies(7, 4), CoreMatchers.equalTo(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun distributeCandies2() {
        MatcherAssert.assertThat(Solution().distributeCandies(10, 3), CoreMatchers.equalTo(intArrayOf(5, 2, 3)))
    }
}