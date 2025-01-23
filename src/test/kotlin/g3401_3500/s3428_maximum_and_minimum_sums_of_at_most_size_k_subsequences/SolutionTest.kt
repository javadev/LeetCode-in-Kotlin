package g3401_3500.s3428_maximum_and_minimum_sums_of_at_most_size_k_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMaxSums() {
        assertThat<Int>(Solution().minMaxSums(intArrayOf(1, 2, 3), 2), equalTo<Int>(24))
    }

    @Test
    fun minMaxSums2() {
        assertThat<Int>(Solution().minMaxSums(intArrayOf(5, 0, 6), 1), equalTo<Int>(22))
    }
}
