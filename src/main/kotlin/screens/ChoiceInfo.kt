package screens

data class ChoiceInfo(
    var category: String,
    var difficulty: String,
    var players: String,
){
    companion object {
        val info = ChoiceInfo("", "", "")
    }
    fun getTopic(): String {
        return category
    }
}
