package com.company;

public class Main {

  public static void main(String[] args) {

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);


    System.out.println("New value " + calculateScore(true, 1200, 8, 100));

    if(gameOver){
      int calculatedScore = score + (levelCompleted * bonus);
    } else {
      System.out.println("Not Game Over");
    }

    System.out.println("Your final score was " + highScore);

    score = 10000;
    levelCompleted = 8;
    bonus = 200;

    highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("Your final score was " + highScore);


    int position1 = calculateHighScorePosition(1000);
    displayHighScorePosition("Tim", position1);

    position1 = calculateHighScorePosition(900);
    displayHighScorePosition("Sam", position1);

    position1 = calculateHighScorePosition(400);
    displayHighScorePosition("Bob", position1);

    position1 = calculateHighScorePosition(50);
    displayHighScorePosition("Percy", position1);
  }


  // Create a method called displayHighScorePosition
  // it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
  // You should display the players name along with a message like " managed to get into position " and the
  // position they got and a further message " on the high score table".
  //
  // Create a 2nd method called calculatedHighScorePosition
  // it should be sent one argument only, the player score
  // it should return an int
  // the return data should be
  // 1 if the score is > 1000
  // 2 if the score is > 500 and < 1000
  // 3 if the score is > 100 and < 500
  // 4 in all other cases
  // call both methods and display the results of the following
  // a score of 1500, 900, 400, and 50
  //

  public static void displayHighScorePosition (String playerName, int position) {
    System.out.println(playerName + " managed to get into position " + position + " on the high score table");
  }

  public static int calculateHighScorePosition (int myScore) {
//        if(myScore >= 1000) {
//            return 1;
//        } else if (myScore >= 500) {
//            return 2;
//        } else if (myScore >= 100) {
//            return 3;
//        }
//        return 4;

    int position2 = 4;

    if(myScore >= 1000) {
      position2 = 1;
    } else if (myScore >= 500) {
      position2 = 2;
    } else if (myScore >= 100) {
      position2 = 3;
    }
    return position2;
  }



  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

    if(gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      return finalScore;
    }

    return -1;
  }
}
