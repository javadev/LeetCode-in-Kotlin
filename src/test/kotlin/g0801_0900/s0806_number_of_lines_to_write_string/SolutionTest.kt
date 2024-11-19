package g0801_0900.s0806_number_of_lines_to_write_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfLines() {
        assertThat(
            Solution()
                .numberOfLines(
                    intArrayOf(
                        10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                        10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    ),
                    "abcdefghijklmnopqrstuvwxyz",
                ),
            equalTo(intArrayOf(3, 60)),
        )
    }

    @Test
    fun numberOfLines2() {
        assertThat(
            Solution()
                .numberOfLines(
                    intArrayOf(
                        4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                        10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    ),
                    "bbbcccdddaaa",
                ),
            equalTo(intArrayOf(2, 4)),
        )
    }
}
