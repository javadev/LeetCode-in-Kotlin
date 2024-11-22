package g3301_3400.s3336_find_the_number_of_subsequences_with_equal_gcd

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subsequencePairCount() {
        assertThat<Int>(
            Solution().subsequencePairCount(intArrayOf(1, 2, 3, 4)),
            equalTo<Int>(10),
        )
    }

    @Test
    fun subsequencePairCount2() {
        assertThat<Int>(
            Solution().subsequencePairCount(intArrayOf(10, 20, 30)),
            equalTo<Int>(2),
        )
    }
}
