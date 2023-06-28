package g2201_2300.s2296_design_a_text_editor

// #Hard #String #Stack #Design #Simulation #Linked_List #Doubly_Linked_List
class TextEditor {
    private val sb: StringBuilder
    private var cursor = 0

    init {
        sb = StringBuilder()
    }

    fun addText(text: String) {
        sb.insert(cursor, text)
        cursor += text.length
    }

    fun deleteText(k: Int): Int {
        val prevPos = cursor
        if (cursor - k >= 0) {
            cursor -= k
            sb.delete(cursor, cursor + k)
        } else {
            sb.delete(0, cursor)
            cursor = 0
        }
        return prevPos - cursor
    }

    fun cursorLeft(k: Int): String {
        cursor = Math.max(cursor - k, 0)
        return sb.substring(Math.max(cursor - 10, 0), cursor)
    }

    fun cursorRight(k: Int): String {
        cursor = Math.min(cursor + k, sb.length)
        return sb.substring(Math.max(cursor - 10, 0), cursor)
    }
}
