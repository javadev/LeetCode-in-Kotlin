package g0301_0400.s0381_insert_delete_getrandom_o1_duplicates_allowed

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class RandomizedCollectionTest {
    @Test
    fun randomizedCollectionTest() {
        val result: MutableList<String> = ArrayList()
        var randomizedCollection: RandomizedCollection? = null
        result.add(randomizedCollection.toString() + "")
        randomizedCollection = RandomizedCollection()
        result.add(randomizedCollection.insert(1).toString() + "")
        result.add(randomizedCollection.insert(1).toString() + "")
        result.add(randomizedCollection.insert(2).toString() + "")
        val random = randomizedCollection.getRandom()
        result.add(random.toString() + "")
        result.add(randomizedCollection.remove(1).toString() + "")
        val random2 = randomizedCollection.getRandom()
        result.add(random2.toString() + "")
        val expected: List<String> = ArrayList(
            listOf(
                "null",
                "true",
                "false",
                "true",
                random.toString() + "",
                "true",
                random2.toString() + ""
            )
        )
        assertThat(result, equalTo(expected))
    }
}
