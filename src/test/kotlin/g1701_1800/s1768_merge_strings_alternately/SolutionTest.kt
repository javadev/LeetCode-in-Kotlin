package g1701_1800.s1768_merge_strings_alternately

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeAlternately() {
        assertThat(Solution().mergeAlternately("abc", "pqr"), equalTo("apbqcr"))
    }

    @Test
    fun mergeAlternately2() {
        assertThat(Solution().mergeAlternately("ab", "pqrs"), equalTo("apbqrs"))
    }

    @Test
    fun mergeAlternately3() {
        assertThat(Solution().mergeAlternately("abcd", "pq"), equalTo("apbqcd"))
    }
}
