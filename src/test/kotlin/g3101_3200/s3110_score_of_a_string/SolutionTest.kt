package g3101_3200.s3110_score_of_a_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scoreOfString() {
        assertThat(Solution().scoreOfString("hello"), equalTo(13))
    }

    @Test
    fun scoreOfString2() {
        assertThat(Solution().scoreOfString("zaz"), equalTo(50))
    }
}
