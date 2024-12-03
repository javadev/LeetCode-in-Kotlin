package g3301_3400.s3365_rearrange_k_substrings_to_form_target_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPossibleToRearrange() {
        assertThat<Boolean>(
            Solution()
                .isPossibleToRearrange("abcd", "cdab", 2),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isPossibleToRearrange2() {
        assertThat<Boolean>(
            Solution()
                .isPossibleToRearrange("aabbcc", "bbaacc", 3),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun isPossibleToRearrange3() {
        assertThat<Boolean>(
            Solution()
                .isPossibleToRearrange("aabbcc", "bbaacc", 2),
            equalTo<Boolean>(false),
        )
    }
}
