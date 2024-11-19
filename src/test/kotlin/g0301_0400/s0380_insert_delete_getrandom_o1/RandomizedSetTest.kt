package g0301_0400.s0380_insert_delete_getrandom_o1

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RandomizedSetTest {
    @Test
    fun randomizedSet() {
        val result: MutableList<String> = ArrayList()
        var randomizedSet: RandomizedSet? = null
        result.add(randomizedSet.toString() + "")
        randomizedSet = RandomizedSet()
        result.add(randomizedSet.insert(1).toString() + "")
        result.add(randomizedSet.remove(2).toString() + "")
        result.add(randomizedSet.insert(2).toString() + "")
        val random = randomizedSet.getRandom()
        result.add(random.toString() + "")
        result.add(randomizedSet.remove(1).toString() + "")
        result.add(randomizedSet.insert(2).toString() + "")
        result.add(randomizedSet.getRandom().toString() + "")
        val expected: List<String> = ArrayList(

            listOf("null", "true", "false", "true", "1", "true", "false", "2"),
        )
        val expected2: List<String> = ArrayList(
            listOf("null", "true", "false", "true", "2", "true", "false", "2"),
        )
        if (random == 1) {
            assertThat(result, equalTo(expected))
        } else {
            assertThat(result, equalTo(expected2))
        }
    }
}
