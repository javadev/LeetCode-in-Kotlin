package g3001_3100.s3016_minimum_number_of_pushes_to_type_word_ii

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
        assertThat(Solution().minimumPushes("xyzxyzxyzxyz"), equalTo(12))
    }

    @Test
    fun minimumPushes3() {
        assertThat(Solution().minimumPushes("aabbccddeeffgghhiiiiii"), equalTo(24))
    }
}
