package g3401_3500.s3456_find_special_substring_of_length_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasSpecialSubstring() {
        assertThat<Boolean>(
            Solution().hasSpecialSubstring("aaabaaa", 3),
            equalTo<Boolean>(true),
        )
    }

    @Test
    fun hasSpecialSubstring2() {
        assertThat<Boolean>(
            Solution().hasSpecialSubstring("abc", 2),
            equalTo<Boolean>(false),
        )
    }
}
