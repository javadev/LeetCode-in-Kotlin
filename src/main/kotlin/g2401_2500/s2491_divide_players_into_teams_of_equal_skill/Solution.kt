package g2401_2500.s2491_divide_players_into_teams_of_equal_skill

// #Medium #Array #Hash_Table #Sorting #Two_Pointers
class Solution {
    fun dividePlayers(skill: IntArray): Long {
        var i = 0
        var j = skill.size - 1
        skill.sort()
        val sum = skill[i] + skill[j]
        var p: Long = 0
        while (i < j) {
            if (skill[i] + skill[j] != sum) {
                return -1
            }
            p += skill[i].toLong() * skill[j]
            i++
            j--
        }
        return p
    }
}
