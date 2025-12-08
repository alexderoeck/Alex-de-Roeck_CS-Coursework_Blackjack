import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList; // For linked lists

public class Player extends Actor
{
    private int playerMoney;
    private int totalBet;
    private boolean playerLost;
    private int currentHand;
    private LinkedList<Hand> handsList;
    private int lastHand;
    private boolean isTurn;
    //  Have a List for the hands.
    //  Will need to check if the list is empty.

    public void act()
    {
        //System.out.println(this.playerMoney);
    }

    public Player ()
    {
        this.playerMoney = 500;
        this.totalBet = 0;
        this.playerLost = false;
        this.currentHand = 0;
        this.handsList = new LinkedList<Hand>();
        this.lastHand = 0;
        this.isTurn = false;
    }

    public int getLastHand (){
        return(this.lastHand);
    }

    public void setLastHand (int value){
        this.lastHand = value;
    }

    public Boolean getPlayerTurn(){
        return(this.isTurn);
    }

    public void setPlayerTurn (Boolean value){
        this.isTurn = value;
    }

    public Hand getPlayerHand (int index){
        if (!this.handsList.isEmpty()){
            return (this.handsList.get(index));
        }
        return(null);
    }

    public void addToHandList (Hand hand){
        this.handsList.add(hand);
    }

    public int getCurrentHand(){
        return this.currentHand;
    }

    public int getPlayerMoney(){
        return this.playerMoney;
    }

    public int getTotalBet()
    {
        return totalBet;
    }

    public void addToTotalBet(int value)
    {
        this.totalBet = this.totalBet + value;
    }

    public void emptyBet()
    {
        this.totalBet = 0;
    }

    public void addPlayerMoney(int value)
    {
        this.playerMoney = this.playerMoney + value;
    }

    public void subPlayerMoney(int value)
    {
        this.playerMoney = this.playerMoney - value;
    }

    public void stand(World world)
    {
        this.isTurn = false;
        //world.dealerTurn();
    }
}
