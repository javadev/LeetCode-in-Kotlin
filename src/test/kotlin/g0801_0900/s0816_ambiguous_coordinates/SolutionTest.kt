package g0801_0900.s0816_ambiguous_coordinates

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun ambiguousCoordinates() {
        assertThat(
            Solution().ambiguousCoordinates("(123)"),
            equalTo(listOf("(1, 23)", "(1, 2.3)", "(12, 3)", "(1.2, 3)")),
        )
    }

    @Test
    fun ambiguousCoordinates2() {
        assertThat(
            Solution().ambiguousCoordinates("(0123)"),
            equalTo(
                listOf(
                    "(0, 123)",
                    "(0, 1.23)",
                    "(0, 12.3)",
                    "(0.1, 23)",
                    "(0.1, 2.3)",
                    "(0.12, 3)",
                ),
            ),
        )
    }

    @Test
    fun ambiguousCoordinates3() {
        assertThat(
            Solution().ambiguousCoordinates("(00011)"),
            equalTo(listOf("(0, 0.011)", "(0.001, 1)")),
        )
    }
}
