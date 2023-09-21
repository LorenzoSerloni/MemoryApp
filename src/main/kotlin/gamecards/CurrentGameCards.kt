package gamecards

data class CurrentGameCards(
    val gameCards: MutableSet<GamingCard>
) {
    companion object{
        val gameSession = mutableSetOf<GamingCard>()
    }
    fun addCard(card: GamingCard) {
        gameCards.add(card)
    }
}

data class GamingCard(
    var id: Int,
    var name: String,
    var fileName: String,
    var isFaceUp: Boolean = false,
    var isMatched: Int = 0
)
