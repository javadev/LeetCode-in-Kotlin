package g3701_3800.s3703_remove_k_balanced_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeSubstring() {
        assertThat<String>(Solution().removeSubstring("(())", 1), equalTo<String>(""))
    }

    @Test
    fun removeSubstring2() {
        assertThat<String>(Solution().removeSubstring("(()(", 1), equalTo<String>("(("))
    }

    @Test
    fun removeSubstring3() {
        assertThat<String>(
            Solution().removeSubstring("((()))()()()", 3),
            equalTo<String>("()()()"),
        )
    }
}
