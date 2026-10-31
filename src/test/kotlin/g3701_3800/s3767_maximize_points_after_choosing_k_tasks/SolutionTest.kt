package g3701_3800.s3767_maximize_points_after_choosing_k_tasks

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPoints() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(5, 1, 3), intArrayOf(4, 10, 2), 1),
            equalTo<Long>(18L),
        )
    }

    @Test
    fun maxPoints2() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(1, 2), intArrayOf(3, 4), 0),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maxPoints3() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(7, 2, 5), intArrayOf(1, 8, 4), 3),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxPoints4() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(5, 4, 3), intArrayOf(3, 4, 1), 3),
            equalTo<Long>(12L),
        )
    }

    @Test
    fun maxPoints5() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(1, 2, 3), intArrayOf(5, 5, 1), 1),
            equalTo<Long>(13L),
        )
    }

    @Test
    fun maxPoints6() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(1, 1, 1, 1), intArrayOf(3, 4, 2, 6), 2),
            equalTo<Long>(12L),
        )
    }

    @Test
    fun maxPoints7() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(1, 1, 1, 1), intArrayOf(6, 5, 4, 0), 2),
            equalTo<Long>(13L),
        )
    }

    @Test
    fun maxPoints8() {
        assertThat<Long>(
            Solution().maxPoints(intArrayOf(7, 8, 9), intArrayOf(100, 100, 100), 3),
            equalTo<Long>(24L),
        )
    }
}
