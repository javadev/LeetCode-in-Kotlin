package g2001_2100.s2011_final_value_of_variable_after_performing_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finalValueAfterOperations() {
        assertThat(
            Solution().finalValueAfterOperations(arrayOf("--X", "X++", "X++")),
            equalTo(1),
        )
    }

    @Test
    fun finalValueAfterOperations2() {
        assertThat(
            Solution().finalValueAfterOperations(arrayOf("++X", "++X", "X++")),
            equalTo(3),
        )
    }

    @Test
    fun finalValueAfterOperations3() {
        assertThat(
            Solution().finalValueAfterOperations(arrayOf("X++", "++X", "--X", "X--")),
            equalTo(0),
        )
    }
}
