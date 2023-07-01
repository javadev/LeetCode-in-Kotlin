package g2301_2400.s2336_smallest_number_in_infinite_set

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SmallestInfiniteSetTest {
    @Test
    fun smallestInfiniteSet() {
        val smallestInfiniteSet = SmallestInfiniteSet()
        // 2 is already in the set, so no change is made.
        smallestInfiniteSet.addBack(2)
        // return 1, since 1 is the smallest number, and remove it from the set.
        assertThat(smallestInfiniteSet.popSmallest(), equalTo(1))
        // return 2, and remove it from the set.
        assertThat(smallestInfiniteSet.popSmallest(), equalTo(2))
        // return 3, and remove it from the set.
        assertThat(smallestInfiniteSet.popSmallest(), equalTo(3))
        // 1 is added back to the set.
        smallestInfiniteSet.addBack(1)
        // return 1, since 1 was added back to the set and
        // is the smallest number, and remove it from the set.
        assertThat(smallestInfiniteSet.popSmallest(), equalTo(1))
        // return 4, and remove it from the set.
        assertThat(smallestInfiniteSet.popSmallest(), equalTo(4))
        // return 5, and remove it from the set.
        assertThat(smallestInfiniteSet.popSmallest(), equalTo(5))
    }
}