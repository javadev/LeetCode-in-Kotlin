package g3101_3200.s3136_valid_word

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValid() {
        assertThat(Solution().isValid("234Adas"), equalTo(true))
    }

    @Test
    fun isValid2() {
        assertThat(Solution().isValid("b3"), equalTo(false))
    }

    @Test
    fun isValid3() {
        assertThat(Solution().isValid("a3\$e"), equalTo(false))
    }
}
