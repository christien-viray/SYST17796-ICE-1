/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Christien Viray 991626599
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(1,14));
            c.setSuit(Card.SUITS[rand.nextInt(4)]); 
            magicHand[i] = c;
           
            System.out.println(c.getSuit() + " " + c.getValue());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[2]);

        // and search magicHand here
        boolean match = false;
       
        for (Card c: magicHand) {
            if(luckyCard.getValue() == c.getValue() && luckyCard.getSuit().equals(c.getSuit())) {
                match = true;
                break;
            }
        }
        //Then report the result here
        if(match) {
            System.out.println("Winner! Your card is in the magic hand");
        }
        else {
            System.out.println("Sorry, your card is not in the magic hand");
        }
        // add one luckcard hard code 2,clubs
        
    }
   
}
