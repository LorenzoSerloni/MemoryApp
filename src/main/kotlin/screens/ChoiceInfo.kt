package screens

import java.util.Objects

data class ChoiceInfo(
    var category: String,
    var difficulty: Pair<String, Int>,
    var players: String,
){
    companion object {
        val info = ChoiceInfo("", Pair("", 0), "")
    }
    fun getTopic(): String {
        return category
    }
}



