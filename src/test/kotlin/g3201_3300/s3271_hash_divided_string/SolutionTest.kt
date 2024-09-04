package g3201_3300.s3271_hash_divided_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stringHash() {
        assertThat(Solution().stringHash("abcd", 2), equalTo("bf"))
    }

    @Test
    fun stringHash2() {
        assertThat(Solution().stringHash("mxz", 3), equalTo("i"))
    }
}
