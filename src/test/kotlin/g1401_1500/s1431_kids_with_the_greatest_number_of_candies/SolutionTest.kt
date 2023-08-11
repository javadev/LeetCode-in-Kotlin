package g1401_1500.s1431_kids_with_the_greatest_number_of_candies

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kidsWithCandies() {
        assertThat(
            Solution().kidsWithCandies(intArrayOf(2, 3, 5, 1, 3), 3),
            equalTo(mutableListOf(true, true, true, false, true))
        )
    }

    @Test
    fun kidsWithCandies2() {
        assertThat(
            Solution().kidsWithCandies(intArrayOf(4, 2, 1, 1, 2), 1),
            equalTo(mutableListOf(true, false, false, false, false))
        )
    }

    @Test
    fun kidsWithCandies3() {
        assertThat(
            Solution().kidsWithCandies(intArrayOf(12, 1, 12), 10),
            equalTo(mutableListOf(true, false, true))
        )
    }
}
