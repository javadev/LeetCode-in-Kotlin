package g4001_4100.s4020_elevator_requests_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun elevatorRequests() {
        assertThat<Int>(
            Solution().elevatorRequests(5, intArrayOf(2, 1, 4, 3)),
            equalTo<Int>(7),
        )
    }

    @Test
    fun elevatorRequests2() {
        assertThat<Int>(
            Solution().elevatorRequests(3, intArrayOf(2, 0, 0)),
            equalTo<Int>(4),
        )
    }
}
