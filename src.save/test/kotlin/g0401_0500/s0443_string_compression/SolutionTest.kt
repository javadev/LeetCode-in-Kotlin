package g0401_0500.s0443_string_compression

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun compress() {
        assertThat(
            Solution().compress(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')),
            equalTo(6)
        )
    }

    @Test
    fun compress2() {
        assertThat(Solution().compress(charArrayOf('a')), equalTo(1))
    }

    @Test
    fun compress3() {
        assertThat(
            Solution()
                .compress(
                    charArrayOf(
                        'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'
                    )
                ),
            equalTo(4)
        )
    }
}
