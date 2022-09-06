package g0201_0300.s0231_power_of_two

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPowerOfTwo() {
        assertThat(Solution().isPowerOfTwo(1), equalTo(true))
    }

    @Test
    fun isPowerOfTwo2() {
        assertThat(Solution().isPowerOfTwo(16), equalTo(true))
    }

    @Test
    fun isPowerOfTwo3() {
        assertThat(Solution().isPowerOfTwo(3), equalTo(false))
    }

    @Test
    fun isPowerOfTwo4() {
        assertThat(Solution().isPowerOfTwo(4), equalTo(true))
    }

    @Test
    fun isPowerOfTwo5() {
        assertThat(Solution().isPowerOfTwo(5), equalTo(false))
    }
}
