package g0601_0700.s0641_design_circular_deque

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyCircularDequeTest {
    @Test
    fun myCircularDequeTest() {
        val myCircularDeque = MyCircularDeque(3)
        assertThat(myCircularDeque.insertLast(1), equalTo(true))
        assertThat(myCircularDeque.insertLast(2), equalTo(true))
        assertThat(myCircularDeque.insertFront(3), equalTo(true))
        assertThat(myCircularDeque.insertFront(4), equalTo(false))
        assertThat(myCircularDeque.getRear(), equalTo(2))
        assertThat(myCircularDeque.isFull(), equalTo(true))
        assertThat(myCircularDeque.deleteLast(), equalTo(true))
        assertThat(myCircularDeque.insertFront(4), equalTo(true))
        assertThat(myCircularDeque.getFront(), equalTo(4))
    }

    @Test
    fun myCircularDequeTest2() {
        val deque = MyCircularDeque(2)
        assertThat(deque.insertFront(10), equalTo(true))
        assertThat(deque.insertFront(20), equalTo(true))
        assertThat(deque.insertFront(30), equalTo(false))
        assertThat(deque.getFront(), equalTo(20))
        assertThat(deque.deleteFront(), equalTo(true))
        assertThat(deque.getFront(), equalTo(10))
    }

    @Test
    fun myCircularDequeTest3() {
        val deque = MyCircularDeque(1)
        assertThat(deque.deleteFront(), equalTo(false))
        assertThat(deque.deleteLast(), equalTo(false))
        assertThat(deque.getFront(), equalTo(-1))
        assertThat(deque.getRear(), equalTo(-1))
        assertThat(deque.isEmpty(), equalTo(true))
        assertThat(deque.isFull(), equalTo(false))
    }

    @Test
    fun myCircularDequeTest4() {
        val deque = MyCircularDeque(2)
        assertThat(deque.insertLast(5), equalTo(true))
        assertThat(deque.insertFront(6), equalTo(true))
        assertThat(deque.isFull(), equalTo(true))
        assertThat(deque.insertFront(7), equalTo(false))
        assertThat(deque.getFront(), equalTo(6))
        assertThat(deque.getRear(), equalTo(5))
    }

    @Test
    fun myCircularDequeTest5() {
        val deque = MyCircularDeque(3)
        assertThat(deque.insertFront(10), equalTo(true))
        assertThat(deque.deleteFront(), equalTo(true))
        assertThat(deque.insertLast(20), equalTo(true))
        assertThat(deque.deleteLast(), equalTo(true))
        assertThat(deque.isEmpty(), equalTo(true))
    }

    @Test
    fun myCircularDequeTest6() {
        val deque = MyCircularDeque(1)
        assertThat(deque.insertFront(100), equalTo(true))
        assertThat(deque.isFull(), equalTo(true))
        assertThat(deque.getFront(), equalTo(100))
        assertThat(deque.getRear(), equalTo(100))
        assertThat(deque.deleteFront(), equalTo(true))
        assertThat(deque.isEmpty(), equalTo(true))
    }

    @Test
    fun myCircularDequeTest7() {
        val deque = MyCircularDeque(5)
        deque.insertFront(1)
        deque.insertLast(2)
        deque.insertFront(3)
        deque.insertLast(4)
        deque.insertFront(5)
        assertThat(deque.isFull(), equalTo(true))
        deque.deleteFront()
        deque.deleteLast()
        assertThat(deque.insertFront(6), equalTo(true))
        assertThat(deque.insertLast(7), equalTo(true))
        assertThat(deque.getFront(), equalTo(6))
        assertThat(deque.getRear(), equalTo(7))
    }
}
