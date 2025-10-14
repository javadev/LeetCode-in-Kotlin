package g3701_3800.s3712_sum_of_elements_with_frequency_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumDivisibleByK() {
        assertThat<Int>(
            Solution().sumDivisibleByK(intArrayOf(1, 2, 2, 3, 3, 3, 3, 4), 2), equalTo<Int>(16)
        )
    }

    @Test
    fun sumDivisibleByK2() {
        assertThat<Int>(
            Solution().sumDivisibleByK(intArrayOf(1, 2, 3, 4, 5), 2),
            equalTo<Int>(0)
        )
    }

    @Test
    fun sumDivisibleByK3() {
        assertThat<Int>(
            Solution().sumDivisibleByK(intArrayOf(4, 4, 4, 1, 2, 3), 3),
            equalTo<Int>(12)
        )
    }
}
