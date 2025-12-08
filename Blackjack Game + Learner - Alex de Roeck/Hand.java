import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class Hand extends Actor
{
    private boolean handLost;
    private boolean blackjack;
    private ArrayList<Card> cardsInHand;//  An ArrayList for the card objects in each hand.
    private int card1Value;
    private int card2Value;
    private int handTotal;
    private int lastPos;

    public void act()
    {
        // Add your action code here.
    }

    //FOR FIRST HAND --------------------------------------------------------------
    public Hand (){
        this.handLost = false;
        this.blackjack = false;
        this.lastPos = 575;
        this.cardsInHand = new ArrayList<Card>();
    }

    public void startHand(World world){
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        player.addToHandList(this);

        Card card1 = deck.dealCard();
        this.cardsInHand.add(card1);
        this.card1Value = card1.getCardValue();
        mainGame.addObject(card1, 490, 430);

        Card card2 = deck.dealCard();
        this.cardsInHand.add(card2);
        this.card2Value = card2.getCardValue();
        mainGame.addObject(card2, 575, 430);

        this.handTotal = card1Value + card2Value;
    }

    //FOR SPLITTING ---------------------------------------------------------------
    public Hand (Card cardTwo){
        this.handLost = false;
        this.blackjack = false;

        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        player.addToHandList(this);

        this.cardsInHand = new ArrayList<Card>();

        Card card1 = cardTwo;
        this.cardsInHand.add(card1);
        this.card1Value = card1.getCardValue();

        Card card2 = deck.dealCard();
        this.cardsInHand.add(card2);
        this.card2Value = card2.getCardValue();

        this.handTotal = card1Value + card2Value;
    }   //polymorhphism for splitting

    public int getHandTotal(){
        return (this.handTotal);
    }

    public boolean getBlackjack(){
        return (this.blackjack);
    }

    public boolean getHandLost(){
        return this.handLost;
    }

    public void setHandLost(Boolean value){
        this.handLost = value;
    }

    public void checkHandStatus(){
        if (this.handTotal >= 22){
            this.handLost = true;
        }
        else{
            this.handLost = false;
        }

        if ((this.card1Value + this.card2Value) == 21){
            this.blackjack = true;
        }
        else{
            this.blackjack = false;
        }

        System.out.println("*Hand total = " + this.handTotal);
        System.out.println("*Blackjack = " + this.blackjack);
        System.out.println("*Hand Lost = " + this.handLost);
    }

    public void hit(World world)
    {
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        Card newCard = deck.dealCard();
        this.cardsInHand.add(newCard);
        this.handTotal = this.handTotal + newCard.getCardValue();
        mainGame.addObject(newCard, this.lastPos + 85, 430);
        lastPos = lastPos + 85;

        checkHandStatus();

        System.out.println("*Hit, Hand total = " + this.handTotal);
    }

    public void stand(World world)
    {
        //
        MainGame mainGame = (MainGame)world;
        Player player = mainGame.getPlayer();
        Dealer dealer = mainGame.getDealer();

        player.setPlayerTurn(false);

        System.out.println("*Stood, Hand total = " + this.handTotal);

        //if( player.getCurrentHand() == player.getLastHand() ){
        dealer.dealerTurn(world);
        //}
    }

    public void split()
    {
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        if (card1Value == card2Value && (player.getPlayerTurn() == true)){

        }
    }

    public void doubleDown(World world)
    {
        //
        MainGame mainGame = (MainGame)world;

        this.hit(mainGame);
        this.stand(mainGame);

        System.out.println("*Doubled Down, Hand total = " + this.handTotal);
    }
}
