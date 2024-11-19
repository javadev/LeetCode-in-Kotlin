package g0201_0300.s0220_contains_duplicate_iii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsNearbyAlmostDuplicate() {
        assertThat(
            Solution().containsNearbyAlmostDuplicate(intArrayOf(1, 2, 3, 1), 3, 0),
            equalTo(true),
        )
    }

    @Test
    fun containsNearbyAlmostDuplicate2() {
        assertThat(
            Solution().containsNearbyAlmostDuplicate(intArrayOf(1, 0, 1, 1), 1, 2),
            equalTo(true),
        )
    }

    @Test
    fun containsNearbyAlmostDuplicate3() {
        assertThat(
            Solution().containsNearbyAlmostDuplicate(intArrayOf(1, 5, 9, 1, 5, 9), 2, 3),
            equalTo(false),
        )
    }
}
