package g3601_3700.s3686_number_of_stable_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countStableSubsequences() {
        assertThat<Int>(
            Solution().countStableSubsequences(intArrayOf(1, 3, 5)),
            equalTo<Int>(6)
        )
    }

    @Test
    fun countStableSubsequences2() {
        assertThat<Int>(
            Solution().countStableSubsequences(intArrayOf(2, 3, 4, 2)),
            equalTo<Int>(14)
        )
    }
}
