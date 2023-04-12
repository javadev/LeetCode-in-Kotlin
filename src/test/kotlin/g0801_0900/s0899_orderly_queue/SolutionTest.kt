package g0801_0900.s0899_orderly_queue

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun orderlyQueue() {
        assertThat(Solution().orderlyQueue("cba", 1), equalTo("acb"))
    }

    @Test
    fun orderlyQueue2() {
        assertThat(Solution().orderlyQueue("baaca", 3), equalTo("aaabc"))
    }
}
