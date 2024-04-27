package g3101_3200.s3115_maximum_prime_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumPrimeDifference() {
        assertThat(Solution().maximumPrimeDifference(intArrayOf(4, 2, 9, 5, 3)), equalTo(3))
    }

    @Test
    fun maximumPrimeDifference2() {
        assertThat(Solution().maximumPrimeDifference(intArrayOf(4, 8, 2, 8)), equalTo(0))
    }
}
