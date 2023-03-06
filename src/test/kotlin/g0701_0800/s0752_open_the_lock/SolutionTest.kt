package g0701_0800.s0752_open_the_lock

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun openLock() {
        assertThat(
            Solution()
                .openLock(arrayOf("0201", "0101", "0102", "1212", "2002"), "0202"),
            equalTo(6)
        )
    }

    @Test
    fun openLock2() {
        assertThat(Solution().openLock(arrayOf("8888"), "0009"), equalTo(1))
    }

    @Test
    fun openLock3() {
        assertThat(
            Solution()
                .openLock(
                    arrayOf(
                        "8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"
                    ),
                    "8888"
                ),
            equalTo(-1)
        )
    }
}
