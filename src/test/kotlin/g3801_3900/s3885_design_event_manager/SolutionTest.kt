package g3801_3900.s3885_design_event_manager

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun eventManager() {
        val manager = EventManager(arrayOf<IntArray>(intArrayOf(5, 7), intArrayOf(2, 7), intArrayOf(9, 4)))
        assertThat<Int>(manager.pollHighest(), equalTo<Int>(2))
    }

    @Test
    fun eventManager2() {
        val manager = EventManager(arrayOf<IntArray>(intArrayOf(5, 7), intArrayOf(2, 7), intArrayOf(9, 4)))
        manager.pollHighest()
        manager.updatePriority(9, 7)
        assertThat<Int>(manager.pollHighest(), equalTo<Int>(5))
    }

    @Test
    fun eventManager3() {
        val manager = EventManager(arrayOf<IntArray>(intArrayOf(5, 7), intArrayOf(2, 7), intArrayOf(9, 4)))
        manager.pollHighest()
        manager.updatePriority(9, 7)
        manager.pollHighest()
        assertThat<Int>(manager.pollHighest(), equalTo<Int>(9))
    }

    @Test
    fun eventManager4() {
        val manager = EventManager(arrayOf<IntArray>(intArrayOf(4, 1), intArrayOf(7, 2)))
        assertThat<Int>(manager.pollHighest(), equalTo<Int>(7))
    }

    @Test
    fun eventManager5() {
        val manager = EventManager(arrayOf<IntArray>(intArrayOf(4, 1), intArrayOf(7, 2)))
        manager.pollHighest()
        assertThat<Int>(manager.pollHighest(), equalTo<Int>(4))
    }

    @Test
    fun eventManager6() {
        val manager = EventManager(arrayOf<IntArray>(intArrayOf(4, 1), intArrayOf(7, 2)))
        manager.pollHighest()
        manager.pollHighest()
        assertThat<Int>(manager.pollHighest(), equalTo<Int>(-1))
    }
}
