package g2001_2100.s2011_final_value_of_variable_after_performing_operations

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finalValueAfterOperations() {
        MatcherAssert.assertThat(
            Solution().finalValueAfterOperations(arrayOf("--X", "X++", "X++")),
            CoreMatchers.equalTo(1)
        )
    }

    @Test
    fun finalValueAfterOperations2() {
        MatcherAssert.assertThat(
            Solution().finalValueAfterOperations(arrayOf("++X", "++X", "X++")),
            CoreMatchers.equalTo(3)
        )
    }

    @Test
    fun finalValueAfterOperations3() {
        MatcherAssert.assertThat(
            Solution().finalValueAfterOperations(arrayOf("X++", "++X", "--X", "X--")),
            CoreMatchers.equalTo(0)
        )
    }
}
