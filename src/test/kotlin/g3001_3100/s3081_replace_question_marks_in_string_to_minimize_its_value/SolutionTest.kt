package g3001_3100.s3081_replace_question_marks_in_string_to_minimize_its_value

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeStringValue() {
        assertThat(Solution().minimizeStringValue("???"), equalTo("abc"))
    }

    @Test
    fun minimizeStringValue2() {
        assertThat(Solution().minimizeStringValue("a?a?"), equalTo("abac"))
    }
}
