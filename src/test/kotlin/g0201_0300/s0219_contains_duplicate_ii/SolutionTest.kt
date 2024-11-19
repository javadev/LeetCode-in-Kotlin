package g0201_0300.s0219_contains_duplicate_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun containsNearbyDuplicate() {
        assertThat(
            Solution().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3),
            equalTo(true),
        )
    }

    @Test
    fun containsNearbyDuplicate2() {
        assertThat(
            Solution().containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1),
            equalTo(true),
        )
    }

    @Test
    fun containsNearbyDuplicate3() {
        assertThat(
            Solution().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2),
            equalTo(false),
        )
    }
}
