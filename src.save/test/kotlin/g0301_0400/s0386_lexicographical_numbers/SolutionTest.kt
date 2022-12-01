package g0301_0400.s0386_lexicographical_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun lexicalOrder() {
        assertThat(
            Solution().lexicalOrder(13),
            equalTo(Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9))
        )
    }

    @Test
    fun lexicalOrder2() {
        assertThat(Solution().lexicalOrder(2), equalTo(Arrays.asList(1, 2)))
    }
}
