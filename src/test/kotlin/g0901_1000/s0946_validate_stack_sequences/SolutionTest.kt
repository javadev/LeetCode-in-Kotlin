package g0901_1000.s0946_validate_stack_sequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validateStackSequences() {
        assertThat(
            Solution()
                .validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1)),
            equalTo(true),
        )
    }

    @Test
    fun validateStackSequences2() {
        assertThat(
            Solution()
                .validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 3, 5, 1, 2)),
            equalTo(false),
        )
    }
}
