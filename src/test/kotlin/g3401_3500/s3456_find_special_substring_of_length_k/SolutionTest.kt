package g3401_3500.s3456_find_special_substring_of_length_k

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasSpecialSubstring() {
        MatcherAssert.assertThat<Boolean>(
            Solution().hasSpecialSubstring("aaabaaa", 3),
            CoreMatchers.equalTo<Boolean>(true),
        )
    }

    @Test
    fun hasSpecialSubstring2() {
        MatcherAssert.assertThat<Boolean>(
            Solution().hasSpecialSubstring("abc", 2),
            CoreMatchers.equalTo<Boolean>(false),
        )
    }
}
