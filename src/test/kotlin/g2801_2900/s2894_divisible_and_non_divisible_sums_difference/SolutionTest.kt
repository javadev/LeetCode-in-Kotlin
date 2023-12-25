package g2801_2900.s2894_divisible_and_non_divisible_sums_difference

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun differenceOfSums() {
        MatcherAssert.assertThat(Solution().differenceOfSums(10, 3), CoreMatchers.equalTo(19))
    }

    @Test
    fun differenceOfSums2() {
        MatcherAssert.assertThat(Solution().differenceOfSums(5, 6), CoreMatchers.equalTo(15))
    }

    @Test
    fun differenceOfSums3() {
        MatcherAssert.assertThat(Solution().differenceOfSums(5, 1), CoreMatchers.equalTo(-15))
    }
}
