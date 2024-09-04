package g3201_3300.s3270_find_the_key_of_the_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateKey() {
        assertThat(Solution().generateKey(1, 10, 1000), equalTo(0))
    }

    @Test
    fun generateKey2() {
        assertThat(Solution().generateKey(987, 879, 798), equalTo(777))
    }

    @Test
    fun generateKey3() {
        assertThat(Solution().generateKey(1, 2, 3), equalTo(1))
    }
}
