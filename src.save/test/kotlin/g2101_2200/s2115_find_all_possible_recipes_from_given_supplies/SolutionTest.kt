package g2101_2200.s2115_find_all_possible_recipes_from_given_supplies

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findAllRecipes() {
        assertThat(
            Solution()
                .findAllRecipes(
                    arrayOf("bread"),
                    listOf<List<String>>(mutableListOf("yeast", "flour")),
                    arrayOf("yeast", "flour", "corn")
                ),
            equalTo(listOf("bread"))
        )
    }

    @Test
    fun findAllRecipes2() {
        assertThat(
            Solution()
                .findAllRecipes(
                    arrayOf("bread", "sandwich"),
                    listOf(mutableListOf("yeast", "flour"), mutableListOf("bread", "meat")),
                    arrayOf("yeast", "flour", "meat")
                ),
            equalTo(mutableListOf("bread", "sandwich"))
        )
    }

    @Test
    fun findAllRecipes3() {
        assertThat(
            Solution()
                .findAllRecipes(
                    arrayOf("bread", "sandwich", "burger"),
                    listOf(
                        mutableListOf("yeast", "flour"),
                        mutableListOf("bread", "meat"),
                        mutableListOf("sandwich", "meat", "bread")
                    ),
                    arrayOf("yeast", "flour", "meat")
                ),
            equalTo(mutableListOf("bread", "sandwich", "burger"))
        )
    }
}
