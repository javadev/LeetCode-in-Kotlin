package g3101_3200.s3138_minimum_length_of_anagram_concatenation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minAnagramLength() {
        assertThat(Solution().minAnagramLength("abba"), equalTo(2))
    }

    @Test
    fun minAnagramLength2() {
        assertThat(Solution().minAnagramLength("cdef"), equalTo(4))
    }
}
