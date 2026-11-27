package g4001_4100.s4027_elevator_requests_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun elevatorRequests() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, arrayOf<IntArray>()),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun elevatorRequests2() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, arrayOf<IntArray>(intArrayOf(0, 5), intArrayOf(0, 5))),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun elevatorRequests3() {
        assertThat<Long>(
            Solution().elevatorRequests(10, 5, arrayOf<IntArray>(intArrayOf(0, 7))),
            equalTo<Long>(2L),
        )
    }
}
