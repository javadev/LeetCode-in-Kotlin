package g3301_3400.s3316_find_maximum_removals_from_source_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRemovals() {
        assertThat<Int?>(
            Solution().maxRemovals("abbaa", "aba", intArrayOf(0, 1, 2)),
            equalTo<Int?>(1),
        )
    }

    @Test
    fun maxRemovals2() {
        assertThat<Int?>(
            Solution().maxRemovals("bcda", "d", intArrayOf(0, 3)),
            equalTo<Int?>(2),
        )
    }

    @Test
    fun maxRemovals3() {
        assertThat<Int?>(
            Solution().maxRemovals("dda", "dda", intArrayOf(0, 1, 2)),
            equalTo<Int?>(0),
        )
    }

    @Test
    fun maxRemovals4() {
        assertThat<Int?>(
            Solution().maxRemovals("yeyeykyded", "yeyyd", intArrayOf(0, 2, 3, 4)),
            equalTo<Int?>(2),
        )
    }
}
