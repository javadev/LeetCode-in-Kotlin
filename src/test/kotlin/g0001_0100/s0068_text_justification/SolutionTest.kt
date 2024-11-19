package g0001_0100.s0068_text_justification

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fullJustify() {
        val input = arrayOf("This", "is", "an", "example", "of", "text", "justification.")
        val actual = Solution().fullJustify(input, 16)
        val expected: MutableList<String> = ArrayList()
        expected.add("This    is    an")
        expected.add("example  of text")
        expected.add("justification.  ")
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun fullJustify2() {
        val input = arrayOf("What", "must", "be", "acknowledgment", "shall", "be")
        val actual = Solution().fullJustify(input, 16)
        val expected: MutableList<String> = ArrayList()
        expected.add("What   must   be")
        expected.add("acknowledgment  ")
        expected.add("shall be        ")
        assertThat(actual, equalTo(expected))
    }

    @Test
    fun fullJustify3() {
        val input = arrayOf(
            "Science",
            "is",
            "what",
            "we",
            "understand",
            "well",
            "enough",
            "to",
            "explain",
            "to",
            "a",
            "computer.",
            "Art",
            "is",
            "everything",
            "else",
            "we",
            "do",
        )
        val actual = Solution().fullJustify(input, 20)
        val expected: MutableList<String> = ArrayList()
        expected.add("Science  is  what we")
        expected.add("understand      well")
        expected.add("enough to explain to")
        expected.add("a  computer.  Art is")
        expected.add("everything  else  we")
        expected.add("do                  ")
        assertThat(actual, equalTo(expected))
    }
}
