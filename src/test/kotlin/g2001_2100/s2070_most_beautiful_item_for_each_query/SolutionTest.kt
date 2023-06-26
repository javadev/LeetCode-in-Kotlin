package g2001_2100.s2070_most_beautiful_item_for_each_query

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumBeauty() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(3, 2), intArrayOf(2, 4), intArrayOf(5, 6), intArrayOf(3, 5))
        val queries = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = intArrayOf(2, 4, 5, 5, 6, 6)
        MatcherAssert.assertThat(Solution().maximumBeauty(items, queries), CoreMatchers.equalTo(expected))
    }

    @Test
    fun maximumBeauty2() {
        val items = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(1, 4))
        val queries = intArrayOf(1)
        val expected = intArrayOf(4)
        MatcherAssert.assertThat(Solution().maximumBeauty(items, queries), CoreMatchers.equalTo(expected))
    }

    @Test
    fun maximumBeauty3() {
        val items = arrayOf(intArrayOf(10, 1000))
        val queries = intArrayOf(5)
        val expected = intArrayOf(0)
        MatcherAssert.assertThat(Solution().maximumBeauty(items, queries), CoreMatchers.equalTo(expected))
    }
}
