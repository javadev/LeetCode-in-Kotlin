package g3201_3300.s3261_count_substrings_that_satisfy_k_constraint_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKConstraintSubstrings() {
        assertThat(
            Solution().countKConstraintSubstrings("0001111", 2, arrayOf(intArrayOf(0, 6))),
            equalTo(longArrayOf(26))
        )
    }

    @Test
    fun countKConstraintSubstrings2() {
        assertThat(
            Solution()
                .countKConstraintSubstrings(
                    "010101", 1, arrayOf(intArrayOf(0, 5), intArrayOf(1, 4), intArrayOf(2, 3))
                ),
            equalTo(longArrayOf(15, 9, 3))
        )
    }
}
