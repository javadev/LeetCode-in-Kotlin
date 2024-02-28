package g3001_3100.s3014_minimum_number_of_pushes_to_type_word_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumPushes() {
        assertThat(Solution().minimumPushes("abcde"), equalTo(5))
    }

    @Test
    fun minimumPushes2() {
        assertThat(Solution().minimumPushes("xycdefghij"), equalTo(12))
    }
}
