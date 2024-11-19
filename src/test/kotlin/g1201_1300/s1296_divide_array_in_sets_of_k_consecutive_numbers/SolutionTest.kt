package g1201_1300.s1296_divide_array_in_sets_of_k_consecutive_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPossibleDivide() {
        assertThat(
            Solution().isPossibleDivide(intArrayOf(1, 2, 3, 3, 4, 4, 5, 6), 4),
            equalTo(true),
        )
    }

    @Test
    fun isPossibleDivide2() {
        assertThat(
            Solution()
                .isPossibleDivide(intArrayOf(3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11), 3),
            equalTo(true),
        )
    }

    @Test
    fun isPossibleDivide3() {
        assertThat(Solution().isPossibleDivide(intArrayOf(1, 2, 3, 4), 3), equalTo(false))
    }
}
