package g3801_3900.s3834_merge_adjacent_equal_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mergeAdjacent() {
        assertThat<MutableList<Long>>(
            Solution().mergeAdjacent(intArrayOf(3, 1, 1, 2)),
            equalTo<MutableList<Long>>(mutableListOf<Long>(3L, 4L)),
        )
    }

    @Test
    fun mergeAdjacent2() {
        assertThat<MutableList<Long>>(
            Solution().mergeAdjacent(intArrayOf(2, 2, 4)),
            equalTo<MutableList<Long>>(mutableListOf<Long>(8L)),
        )
    }

    @Test
    fun mergeAdjacent3() {
        assertThat<MutableList<Long>>(
            Solution().mergeAdjacent(intArrayOf(3, 7, 5)),
            equalTo<MutableList<Long>>(mutableListOf<Long>(3L, 7L, 5L)),
        )
    }
}
