package g3101_3200.s3174_clear_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun clearDigits() {
        assertThat(Solution().clearDigits("abc"), equalTo("abc"))
    }

    @Test
    fun clearDigits2() {
        assertThat(Solution().clearDigits("cb34"), equalTo(""))
    }
}
