package g2801_2900.s2894_divisible_and_non_divisible_sums_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun differenceOfSums() {
        assertThat(Solution().differenceOfSums(10, 3), equalTo(19))
    }

    @Test
    fun differenceOfSums2() {
        assertThat(Solution().differenceOfSums(5, 6), equalTo(15))
    }

    @Test
    fun differenceOfSums3() {
        assertThat(Solution().differenceOfSums(5, 1), equalTo(-15))
    }
}
