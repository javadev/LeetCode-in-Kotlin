package g0701_0800.s0722_remove_comments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeComments() {
        val input = arrayOf(
            "/*Test program */",
            "int main()",
            "{ ",
            "  // variable declaration ",
            "int a, b, c;",
            "/* This is a test",
            "   multiline  ",
            "   comment for ",
            "   testing */",
            "a = b + c;",
            "}"
        )
        val expected = listOf("int main()", "{ ", "  ", "int a, b, c;", "a = b + c;", "}")
        assertThat(Solution().removeComments(input), equalTo(expected))
    }

    @Test
    fun removeComments2() {
        val input = arrayOf("a/*comment", "line", "more_comment*/b")
        val expected = listOf("ab")
        assertThat(Solution().removeComments(input), equalTo(expected))
    }
}
