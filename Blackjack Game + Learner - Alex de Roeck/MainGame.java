import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MainGame extends World
{
    private DeckOfCards deck = new DeckOfCards();
    private Dealer dealer = new Dealer();
    private Player player = new Player();
    private Hand hand1 = new Hand();

    public MainGame()
    {    
        super(1200, 700, 1);
        System.out.println();
        System.out.println();
        System.out.println("-------------------- GAME START --------------------");
        System.out.println();
        
        
        /*  TESTING
        System.out.println(deck.getUnusedCards());
        System.out.println("Card Value = " + deck.dealCard().getCardValue());
        deck.shuffleDeck();
        System.out.println(deck.getUnusedCards());
        System.out.println("Card Value = " + deck.dealCard().getCardValue());

        System.out.println(player.getPlayerTurn());
        player.setPlayerTurn(true);
        System.out.println(player.getPlayerTurn());
        
        System.out.println("Hand total is: " + hand1.getHandTotal());
        
        System.out.println("Dealer hand total is: " + dealer.getHandTotal());
        System.out.println("The dealer isTurn attribute is currently: " + dealer.getDealerTurn());
        
        
        System.out.println("Balance: " + player.getPlayerMoney());
        System.out.println("Total Bet: " + player.getTotalBet());
        
        PokerChip200 chip200 = new PokerChip200();
        chip200.pressed();
        
        System.out.println("Balance: " + player.getPlayerMoney());
        System.out.println("Total Bet: " + player.getTotalBet());
        */
        
        
        //  Making objects such as buttons and boxes --------------------------------

        MoneyBox moneyBox = new MoneyBox();
        addObject(moneyBox, 1052, 586);

        TotalValueCounter hand1Counter = new TotalValueCounter(hand1);
        addObject(hand1Counter, 500, 500);

        TotalValueCounter dealerHandCounter = new TotalValueCounter(dealer);
        addObject(dealerHandCounter, 695, 190);

        TotalValueCounter playerMoney = new TotalValueCounter(player);
        addObject(playerMoney, 1052, 584);

        TotalValueCounter totalBet = new TotalValueCounter(player, true);
        addObject(totalBet, 495, 540);

        DealButton dealButton = new DealButton();
        addObject(dealButton, 305, 560);

        ResetButton resetButton = new ResetButton();
        addObject(resetButton, 305, 645);

        HitButton hitButton = new HitButton();
        addObject(hitButton, 690, 650);

        StandButton standButton = new StandButton();
        addObject(standButton, 835, 650);

        DoubleButton doubleButton = new DoubleButton();
        addObject(doubleButton, 980, 650);

        SplitButton splitButton = new SplitButton();
        addObject(splitButton, 1125, 650);

        //  CHIPS ------------------------------------------------
        PokerChip1 chip1 = new PokerChip1();
        addObject(chip1, 50, 560);

        PokerChip5 chip5 = new PokerChip5();
        addObject(chip5, 125, 560);

        PokerChip10 chip10 = new PokerChip10();
        addObject(chip10, 200, 560);

        PokerChip25 chip25 = new PokerChip25();
        addObject(chip25, 50, 645);

        PokerChip100 chip100 = new PokerChip100();
        addObject(chip100, 125, 645);

        PokerChip200 chip200 = new PokerChip200();
        addObject(chip200, 200, 645);

        //  BACKGROUND ------------------------------------------------
        GreenfootImage image = getBackground();
        image.scale(1205, 700);
        setBackground(image);

        //  Game start --------------------------------
        //deck.shuffleDeck();
        //dealer.startDealer(this);
        //hand1.startHand(this);

        //gameStart();
        //playerTurn();

    }

    public void gameStart(){
        deck.shuffleDeck();
        dealer.startDealer(this);
        hand1.startHand(this);
        playerTurn();
    }

    public void playerTurn(){
        player.setPlayerTurn(true);
    }

    public void dealerTurn(){
        player.setPlayerTurn(false);
        dealer.setDealerTurn(true);
    }

    public void displayEndGameInfo()
    {
        InformationOutputter infoOutter = new InformationOutputter(this);
        addObject(infoOutter, 600, 350);
        player.emptyBet();
    }

    public DeckOfCards getDeck()
    {
        return deck;
    }

    public Player getPlayer()
    {
        return player;
    }

    public Dealer getDealer()
    {
        return dealer;
    }
}
