package g1201_1300.s1203_sort_items_by_groups_respecting_dependencies

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortItems() {
        MatcherAssert.assertThat(
            Solution()
                .sortItems(
                    8,
                    2, intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1),
                    listOf(
                        emptyList(), listOf(6), listOf(5), listOf(6),
                        listOf(3, 6), emptyList(), emptyList(), emptyList()
                    )
                ),
            CoreMatchers.equalTo(intArrayOf(6, 3, 4, 5, 2, 0, 7, 1))
        )
    }

    @Test
    fun sortItems2() {
        MatcherAssert.assertThat(
            Solution()
                .sortItems(
                    8,
                    2, intArrayOf(-1, -1, 1, 0, 0, 1, 0, -1),
                    listOf(
                        emptyList(),
                        listOf(6),
                        listOf(5),
                        listOf(6),
                        listOf(3),
                        emptyList(),
                        listOf(4),
                        emptyList()
                    )
                ),
            CoreMatchers.equalTo(intArrayOf())
        )
    }
}
