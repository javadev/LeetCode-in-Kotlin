package g3001_3100.s3039_apply_operations_to_make_string_empty

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastNonEmptyString() {
        assertThat(Solution().lastNonEmptyString("aabcbbca"), equalTo("ba"))
    }

    @Test
    fun lastNonEmptyString2() {
        assertThat(Solution().lastNonEmptyString("abcd"), equalTo("abcd"))
    }
}
