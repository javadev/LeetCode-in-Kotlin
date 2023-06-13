package g1401_1500.s1478_allocate_mailboxes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDistance() {
        assertThat(Solution().minDistance(intArrayOf(1, 4, 8, 10, 20), 3), equalTo(5))
    }

    @Test
    fun minDistance2() {
        assertThat(Solution().minDistance(intArrayOf(2, 3, 5, 12, 18), 2), equalTo(9))
    }
}
