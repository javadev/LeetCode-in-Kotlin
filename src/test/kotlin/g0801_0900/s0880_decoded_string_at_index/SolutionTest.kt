package g0801_0900.s0880_decoded_string_at_index

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun decodeAtIndex() {
        assertThat(Solution().decodeAtIndex("leet2code3", 10), equalTo("o"))
    }

    @Test
    fun decodeAtIndex2() {
        assertThat(Solution().decodeAtIndex("ha22", 5), equalTo("h"))
    }

    @Test
    fun decodeAtIndex3() {
        assertThat(Solution().decodeAtIndex("a2345678999999999999999", 1), equalTo("a"))
    }
}
