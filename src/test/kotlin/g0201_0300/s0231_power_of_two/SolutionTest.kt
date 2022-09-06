package g0201_0300.s0231_power_of_two

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val isPowerOfTwo: Unit
        get() {
            assertThat(Solution().isPowerOfTwo(1), equalTo(true))
        }

    @get:Test
    val isPowerOfTwo2: Unit
        get() {
            assertThat(Solution().isPowerOfTwo(16), equalTo(true))
        }

    @get:Test
    val isPowerOfTwo3: Unit
        get() {
            assertThat(Solution().isPowerOfTwo(3), equalTo(false))
        }

    @get:Test
    val isPowerOfTwo4: Unit
        get() {
            assertThat(Solution().isPowerOfTwo(4), equalTo(true))
        }

    @get:Test
    val isPowerOfTwo5: Unit
        get() {
            assertThat(Solution().isPowerOfTwo(5), equalTo(false))
        }
}
