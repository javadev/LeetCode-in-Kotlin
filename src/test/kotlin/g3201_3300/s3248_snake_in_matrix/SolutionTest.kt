package g3201_3300.s3248_snake_in_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finalPositionOfSnake() {
        assertThat(Solution().finalPositionOfSnake(2, listOf("RIGHT", "DOWN")), equalTo(3))
    }

    @Test
    fun finalPositionOfSnake2() {
        assertThat(
            Solution().finalPositionOfSnake(3, listOf("DOWN", "RIGHT", "UP")), equalTo(1)
        )
    }

    @Test
    fun testFinalPositionOfSnakeAllCommands() {
        val commands: List<String> = listOf("UP", "DOWN", "LEFT", "RIGHT")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(4, result)
    }

    @Test
    fun testFinalPositionOfSnakeOnlyUp() {
        val commands: List<String> = listOf("UP", "UP")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(0, result)
    }

    @Test
    fun testFinalPositionOfSnakeOnlyDown() {
        val commands: List<String> = listOf("DOWN", "DOWN")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(6, result)
    }

    @Test
    fun testFinalPositionOfSnakeOnlyLeft() {
        val commands: List<String> = listOf("LEFT", "LEFT")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(0, result)
    }

    @Test
    fun testFinalPositionOfSnakeOnlyRight() {
        val commands: List<String> = listOf("RIGHT", "RIGHT")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(2, result)
    }

    @Test
    fun testFinalPositionOfSnakeEmptyCommands() {
        val commands: List<String> = listOf()
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(0, result)
    }

    @Test
    fun testFinalPositionOfSnakeMixedCommands() {
        val commands: List<String> = listOf("DOWN", "RIGHT", "UP", "LEFT", "UP", "DOWN", "RIGHT")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(4, result)
    }

    @Test
    fun testFinalPositionOfSnakeInvalidCommands() {
        val commands: List<String> = listOf("DOWN", "RIGHT", "JUMP", "LEFT", "UP", "DOWN", "RIGHT")
        val result = Solution().finalPositionOfSnake(3, commands)
        assertEquals(4, result)
    }
}
