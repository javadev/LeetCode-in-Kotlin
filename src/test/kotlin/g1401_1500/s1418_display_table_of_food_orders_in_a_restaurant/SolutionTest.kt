package g1401_1500.s1418_display_table_of_food_orders_in_a_restaurant

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun displayTable() {
        val orders = listOf(
            mutableListOf("David", "3", "Ceviche"),
            mutableListOf("Corina", "10", "Beef Burrito"),
            mutableListOf("David", "3", "Fried Chicken"),
            mutableListOf("Carla", "5", "Water"),
            mutableListOf("Carla", "5", "Ceviche"),
            mutableListOf("Rous", "3", "Ceviche"),
        )
        val output = listOf(
            mutableListOf("Table", "Beef Burrito", "Ceviche", "Fried Chicken", "Water"),
            mutableListOf("3", "0", "2", "1", "0"),
            mutableListOf("5", "0", "1", "0", "1"),
            mutableListOf("10", "1", "0", "0", "0"),
        )
        assertThat(Solution().displayTable(orders), equalTo(output))
    }

    @Test
    fun displayTable2() {
        val orders = listOf(
            mutableListOf("James", "12", "Fried Chicken"),
            mutableListOf("Ratesh", "12", "Fried Chicken"),
            mutableListOf("Amadeus", "12", "Fried Chicken"),
            mutableListOf("Adam", "1", "Canadian Waffles"),
            mutableListOf("Brianna", "1", "Canadian Waffles"),
        )
        val output = listOf(
            mutableListOf("Table", "Canadian Waffles", "Fried Chicken"),
            mutableListOf("1", "2", "0"),
            mutableListOf("12", "0", "3"),
        )
        assertThat(Solution().displayTable(orders), equalTo(output))
    }

    @Test
    fun displayTable3() {
        val orders = listOf(
            mutableListOf("Laura", "2", "Bean Burrito"),
            mutableListOf("Jhon", "2", "Beef Burrito"),
            mutableListOf("Melissa", "2", "Soda"),
        )
        val output = listOf(
            mutableListOf("Table", "Bean Burrito", "Beef Burrito", "Soda"),
            mutableListOf("2", "1", "1", "1"),
        )
        assertThat(Solution().displayTable(orders), equalTo(output))
    }
}
