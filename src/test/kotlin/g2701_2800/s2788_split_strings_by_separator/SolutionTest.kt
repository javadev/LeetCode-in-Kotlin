package g2701_2800.s2788_split_strings_by_separator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun splitWordsBySeparator() {
        assertThat(
            Solution().splitWordsBySeparator(
                listOf("one.two.three", "four.five", "six"),
                '.',
            ),
            equalTo(listOf("one", "two", "three", "four", "five", "six")),
        )
    }

    @Test
    fun splitWordsBySeparator2() {
        assertThat(
            Solution().splitWordsBySeparator(
                listOf("\$easy\$", "\$problem\$"),
                '$',
            ),
            equalTo(listOf("easy", "problem")),
        )
    }
}
