package g0601_0700.s0636_exclusive_time_of_functions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun exclusiveTime() {
        assertThat(
            Solution()
                .exclusiveTime(
                    2,
                    listOf("0:start:0", "1:start:2", "1:end:5", "0:end:6"),
                ),
            equalTo(intArrayOf(3, 4)),
        )
    }

    @Test
    fun exclusiveTime2() {
        assertThat(
            Solution()
                .exclusiveTime(
                    1,
                    listOf(
                        "0:start:0",
                        "0:start:2",
                        "0:end:5",
                        "0:start:6",
                        "0:end:6",
                        "0:end:7",
                    ),
                ),
            equalTo(intArrayOf(8)),
        )
    }

    @Test
    fun exclusiveTime3() {
        assertThat(
            Solution()
                .exclusiveTime(
                    2,
                    listOf(
                        "0:start:0",
                        "0:start:2",
                        "0:end:5",
                        "1:start:6",
                        "1:end:6",
                        "0:end:7",
                    ),
                ),
            equalTo(intArrayOf(7, 1)),
        )
    }
}
