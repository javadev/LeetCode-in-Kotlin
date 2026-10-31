package g3701_3800.s3794_reverse_string_prefix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun reversePrefix() {
        assertThat<String>(Solution().reversePrefix("abcd", 2), equalTo<String>("bacd"))
    }

    @Test
    fun reversePrefix2() {
        assertThat<String>(Solution().reversePrefix("xyz", 3), equalTo<String>("zyx"))
    }

    @Test
    fun reversePrefix3() {
        assertThat<String>(Solution().reversePrefix("hey", 1), equalTo<String>("hey"))
    }
}
