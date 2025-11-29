package g0701_0800.s0707_design_linked_list

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class MyLinkedListTest {
    @Test
    fun myLinkedList() {
        val myLinkedList = MyLinkedList()
        myLinkedList.addAtHead(1)
        myLinkedList.addAtTail(3)
        myLinkedList.addAtIndex(1, 2)
        assertThat(myLinkedList[1], equalTo(2))
        myLinkedList.deleteAtIndex(1)
        assertThat(myLinkedList[1], equalTo(3))
    }

    @Test
    fun myLinkedList2() {
        val myLinkedList = MyLinkedList()
        myLinkedList.addAtHead(1)
        myLinkedList.addAtTail(3)
        myLinkedList.addAtIndex(1, 2)
        assertThat(myLinkedList[1], equalTo(2))
        myLinkedList.deleteAtIndex(0)
        assertThat(myLinkedList[0], equalTo(2))
    }

    @Test
    fun myLinkedList3() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.addAtTail(2)
        list.addAtIndex(5, 3)
        assertThat(list.get(2), equalTo(-1))
    }

    @Test
    fun myLinkedList4() {
        val list = MyLinkedList()
        list.addAtIndex(0, 10)
        assertThat(list.get(0), equalTo(10))
    }

    @Test
    fun myLinkedList5() {
        val list = MyLinkedList()
        list.addAtTail(5)
        assertThat(list.get(0), equalTo(5))
    }

    @Test
    fun myLinkedList6() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.deleteAtIndex(5)
        assertThat(list.get(0), equalTo(1))
    }

    @Test
    fun myLinkedList7() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.addAtTail(2)
        list.addAtTail(3)
        list.deleteAtIndex(0)
        assertThat(list.get(0), equalTo(2))
        list.deleteAtIndex(1)
        assertThat(list.get(1), equalTo(-1))
    }

    @Test
    fun myLinkedList8() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.addAtTail(2)
        list.addAtTail(3)
        list.deleteAtIndex(1)
        assertThat(list.get(1), equalTo(3))
    }

    @Test
    fun myLinkedList9() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.addAtTail(2)
        assertThat(list.get(5), equalTo(-1))
        assertThat(list.get(-1), equalTo(2))
    }

    @Test
    fun myLinkedList10() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.addAtTail(2)
        list.addAtIndex(1, 3)
        list.deleteAtIndex(0)
        list.addAtTail(4)
        assertThat(list.get(0), equalTo(3))
        assertThat(list.get(1), equalTo(2))
        assertThat(list.get(2), equalTo(4))
    }

    @Test
    fun myLinkedList11() {
        val list = MyLinkedList()
        list.addAtHead(1)
        list.addAtHead(2)
        assertThat(list.get(0), equalTo(2))
        assertThat(list.get(1), equalTo(1))
    }
}
