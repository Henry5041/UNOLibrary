/**
 * 
 */
package net.mcplugin.unolib.control;

import net.mcplugin.unolib.game.deck.AbstractCard;
import net.mcplugin.unolib.game.deck.ActionCard;
import net.mcplugin.unolib.game.gametable.CardPlayer;
import net.mcplugin.unolib.game.gametable.UNOGame;

/**
 * @author Henry Hu
 *
 */
public interface GameHandler {
	public void onAction(ActionCard card, CardPlayer invoker);

	public void onCardChange(CardPlayer player, int change, int totalCards);

	public void onCardNotExist(CardPlayer player, AbstractCard currentCard);

	public void onChooseColor(CardPlayer player);

	public void onDraw(CardPlayer player, int cardsNumber);

	public void onDrawInTurn(CardPlayer player, AbstractCard cardDrawn);

	public void onEnd(CardPlayer winner);

	public void onMismatch(CardPlayer player, AbstractCard currentCard);

	/**
	 * This method is called when a player successfully plays a card.
	 * 
	 * @param player
	 * @param afterDrawn
	 *            tells if the event of playing a card is after he drew a card
	 */
	public void onPlay(CardPlayer player, boolean afterDrawn, AbstractCard playedCard);

	public void onSkipAfterDrawn(CardPlayer player, AbstractCard currentCard);

	/**
	 * This method is called in the beginning of the game.
	 * 
	 * @param game
	 *            TODO
	 * @param firstPlayer
	 * @param firstCard
	 */
	public void onStart(UNOGame game, CardPlayer firstPlayer, AbstractCard firstCard);

	/**
	 * This method is called when a player's turn starts.
	 * 
	 * @param player
	 * @return the card to play in this turn, null for drawing a card
	 */
	public void onTurn(CardPlayer player, AbstractCard currentCard);

	public void onUndeclaredColor(CardPlayer player, AbstractCard currentCard);

}
