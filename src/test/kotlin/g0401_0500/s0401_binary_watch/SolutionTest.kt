package g0401_0500.s0401_binary_watch

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun readBinaryWatch() {
        assertThat(
            Solution().readBinaryWatch(1),
            equalTo(
                Arrays.asList(
                    "0:01", "0:02", "0:04", "0:08", "0:16", "0:32", "1:00", "2:00",
                    "4:00", "8:00"
                )
            )
        )
    }

    @Test
    fun readBinaryWatch2() {
        assertThat(
            Solution().readBinaryWatch(1),
            equalTo(
                Arrays.asList()
            )
        )
    }
}
