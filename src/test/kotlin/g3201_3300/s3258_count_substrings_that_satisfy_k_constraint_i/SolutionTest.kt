package g3201_3300.s3258_count_substrings_that_satisfy_k_constraint_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countKConstraintSubstrings() {
        assertThat(Solution().countKConstraintSubstrings("10101", 1), equalTo(12))
    }

    @Test
    fun countKConstraintSubstrings2() {
        assertThat(Solution().countKConstraintSubstrings("1010101", 2), equalTo(25))
    }
}
