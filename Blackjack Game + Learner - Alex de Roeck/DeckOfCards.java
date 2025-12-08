import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists
import java.util.Collections;   // Used to randomise the order of data in an ArrayList

public class DeckOfCards extends Actor
{
    private ArrayList<Card> unusedCards;   // UNUSED cards go here
    private ArrayList<Card> inUseCards;    // IN USE cards go here
    private ArrayList<Card> playedCards;   // PLAYED cards go here

    public void act()
    {
        // Add your action code here.
    }

    public DeckOfCards (){
        this.unusedCards = new ArrayList<Card>();    // UNUSED cards go here
        this.inUseCards = new ArrayList<Card>();     // IN USE cards go here
        this.playedCards = new ArrayList<Card>();    // PLAYED cards go here
        createDeck();
    }
    
    public void shuffleDeck()
    {
        // Puts all playedCards and inUseCards into the unusedCards ArrayList and randomises their order.
        unusedCards.addAll(inUseCards);
        unusedCards.addAll(playedCards);
        inUseCards.clear();
        playedCards.clear();
        Collections.shuffle(unusedCards);   // Randomises the order of the data in 'unusedCards'
    }

    public Card dealCard(){
        //  Take card from deck
        Card newCard = unusedCards.get(unusedCards.size()-1);
        useCard(newCard);
        return newCard;
    }

    public void useCard(Card c){
        // Adds a passed card object to the 'inUseCards' ArrayList
        inUseCards.add(c);
        unusedCards.remove(c);
    }
    
    public void playCard(Card c){
        // Adds a passed card object to the 'playedCards' ArrayList
        playedCards.add(c);
        inUseCards.remove(c);
    }

    public void createDeck(){
        // Adds all card to 'unusedCards'
        // Card (int cardValue, int valueOfCard, String cardSuit, String cardIs, boolean faceDown)

        //SPADES ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "S", "AS", false)); //Ace of Spades
        unusedCards.add(new Card(2, 2, "S", "2S", false)); //Two of Spades
        unusedCards.add(new Card(3, 3, "S", "3S", false)); //Three of Spades
        unusedCards.add(new Card(4, 4, "S", "4S", false)); //Four of Spades
        unusedCards.add(new Card(5, 5, "S", "5S", false)); //Five of Spades
        unusedCards.add(new Card(6, 6, "S", "6S", false)); //Six of Spades
        unusedCards.add(new Card(7, 7, "S", "7S", false)); //Seven of Spades
        unusedCards.add(new Card(8, 8, "S", "8S", false)); //Eight of Spades
        unusedCards.add(new Card(9, 9, "S", "9S", false)); //Nine of Spades
        unusedCards.add(new Card(10, 10, "S", "10S", false)); //Ten of Spades
        unusedCards.add(new Card(11, 10, "S", "JS", false)); //Jack of Spades
        unusedCards.add(new Card(12, 10, "S", "QS", false)); //Queen of Spades
        unusedCards.add(new Card(13, 10, "S", "KS", false)); //King of Spades
        //-----------------------------------------------------------

        //HEARTS ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "H", "AH", false)); //Ace of Hearts
        unusedCards.add(new Card(2, 2, "H", "2H", false)); //Two of Hearts
        unusedCards.add(new Card(3, 3, "H", "3H", false)); //Three of Hearts
        unusedCards.add(new Card(4, 4, "H", "4H", false)); //Four of Hearts
        unusedCards.add(new Card(5, 5, "H", "5H", false)); //Five of Hearts
        unusedCards.add(new Card(6, 6, "H", "6H", false)); //Six of Hearts
        unusedCards.add(new Card(7, 7, "H", "7H", false)); //Seven of Hearts
        unusedCards.add(new Card(8, 8, "H", "8H", false)); //Eight of Hearts
        unusedCards.add(new Card(9, 9, "H", "9H", false)); //Nine of Hearts
        unusedCards.add(new Card(10, 10, "H", "10H", false)); //Ten of Hearts
        unusedCards.add(new Card(11, 10, "H", "JH", false)); //Jack of Hearts
        unusedCards.add(new Card(12, 10, "H", "QH", false)); //Queen of Hearts
        unusedCards.add(new Card(13, 10, "H", "KH", false)); //King of Hearts
        //-----------------------------------------------------------

        //CLUBS ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "C", "AC", false)); //Ace of Clubs
        unusedCards.add(new Card(2, 2, "C", "2C", false)); //Two of Clubs
        unusedCards.add(new Card(3, 3, "C", "3C", false)); //Three of Clubs
        unusedCards.add(new Card(4, 4, "C", "4C", false)); //Four of Clubs
        unusedCards.add(new Card(5, 5, "C", "5C", false)); //Five of Clubs
        unusedCards.add(new Card(6, 6, "C", "6C", false)); //Six of Clubs
        unusedCards.add(new Card(7, 7, "C", "7C", false)); //Seven of Clubs
        unusedCards.add(new Card(8, 8, "C", "8C", false)); //Eight of Clubs
        unusedCards.add(new Card(9, 9, "C", "9C", false)); //Nine of Clubs
        unusedCards.add(new Card(10, 10, "C", "10C", false)); //Ten of Clubs
        unusedCards.add(new Card(11, 10, "C", "JC", false)); //Jack of Clubs
        unusedCards.add(new Card(12, 10, "C", "QC", false)); //Queen of Clubs
        unusedCards.add(new Card(13, 10, "C", "KC", false)); //King of Clubs
        //-----------------------------------------------------------

        //DIAMONDS ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "D", "AD", false)); //Ace of Diamonds
        unusedCards.add(new Card(2, 2, "D", "2D", false)); //Two of Diamonds
        unusedCards.add(new Card(3, 3, "D", "3D", false)); //Three of Diamonds
        unusedCards.add(new Card(4, 4, "D", "4D", false)); //Four of Diamonds
        unusedCards.add(new Card(5, 5, "D", "5D", false)); //Five of Diamonds
        unusedCards.add(new Card(6, 6, "D", "6D", false)); //Six of Diamonds
        unusedCards.add(new Card(7, 7, "D", "7D", false)); //Seven of Diamonds
        unusedCards.add(new Card(8, 8, "D", "8D", false)); //Eight of Diamonds
        unusedCards.add(new Card(9, 9, "D", "9D", false)); //Nine of Diamonds
        unusedCards.add(new Card(10, 10, "D", "10D", false)); //Ten of Diamonds
        unusedCards.add(new Card(11, 10, "D", "JD", false)); //Jack of Diamonds
        unusedCards.add(new Card(12, 10, "D", "QD", false)); //Queen of Diamonds
        unusedCards.add(new Card(13, 10, "D", "KD", false)); //King of Diamonds
        //-----------------------------------------------------------
    }

    //  FOR TESTING
    public ArrayList<Card> getUnusedCards(){
        return this.unusedCards;
    }
    
    // UNUSED CODE BELOW -----------------------------------------------------------------------------------------------------------------

    public void UNUSED_CODE1(){
        // Randomly select a card
        String cardValue = "N";
        String cardSuit = "N";
        int rand1 = -1;
        int rand2 = -1;

        // Might need to check if there are cards left in the deck later on **************************
        while (UNUSED_CODE2(rand1, rand2) == true){
            rand1 = Greenfoot.getRandomNumber(13); // (0 <= x < 13), one more than array because array starts at 0
            rand2 = Greenfoot.getRandomNumber(4);
        }

        if (rand1 < 10){
            cardValue = String.valueOf(rand1+1);
        }
        else{
            switch (rand1){
                case 10:
                    cardValue = "J";
                    break;
                case 11:
                    cardValue = "Q";
                    break;
                case 12:
                    cardValue = "K";
                    break;
            } //Converts >10 valued cards to court cards
        } //Converts rand1 into the value of the card

        switch (rand2){ 
            case 0:
                cardSuit = "S";
                break;
            case 1:
                cardSuit = "H";
                break;
            case 2:
                cardSuit = "C";
                break;
            case 3:
                cardSuit = "D";
                break;
        } // Sets cardSuit to the card's suit

        //String cardIs = cardValue + cardSuit;
        //playedCards.add(cardIs);
        //Card card = new Card(rand1, cardSuit, cardIs);
        //instantiate new card with rand1 as value and cardSuit as suit
    }

    private boolean UNUSED_CODE2(int rand1, int rand2){
        // Check it is not in playedCards
        if (rand1 == -1 && rand2 == -1){
            return true;
        } //Makes the while a DoWhile

        String randSuit = "N";
        switch (rand2){ 
            case 0:
                randSuit = "S";
                break;
            case 1:
                randSuit = "H";
                break;
            case 2:
                randSuit = "C";
                break;
            case 3:
                randSuit = "D";
                break;
        } //Finds the randomly generated suit

        String randValue = "N";
        if (rand1 < 10){
            randValue = String.valueOf(rand1+1);
        }
        else{
            switch (rand1){
                case 10:
                    randValue = "J";
                    break;
                case 11:
                    randValue = "Q";
                    break;
                case 12:
                    randValue = "K";
                    break;
            } //Converts >10 valued cards to court cards
        } //Converts rand1 into the value of the card

        String genCard = randValue + randSuit; //Merge Value and Suit
        if (randValue == "N" || randSuit == "N"){
            return true;
        } //Catches errors
        //else{
        //    for(int i = 0; i < playedCards.size(); i++){
        //       if (playedCards.get(i) == genCard){
        //            return true;
        //        }
        //    }
        return false;
        //} //Loops through playedCards[] to check if the card has been played yet
    }
}
