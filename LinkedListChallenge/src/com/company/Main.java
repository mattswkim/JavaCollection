package com.company;

import java.util.*;

public class Main {

  private static ArrayList<Album> albums = new ArrayList<Album>();

  public static void main(String[] args) {
    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have been added to the playlist, create a menu of options to: -
    // Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
    // List the songs in the playlist
    // A song must exist in an album before it can be added to the playlist (so you can only play songs that
    // you own)
    // Hint: To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were going.
    // As an extra, provide an option to remove the current song from the playlist
    // (hint: ListIterator.remove())

    Album album = new Album("Strombringer");
    album.addSong("Strombringer", 4.6);
    album.addSong("Love don't mean a thing", 4.22);
    album.addSong("Holy man", 5.6);
    album.addSong("Hold on", 4.3);
    album.addSong("Lady double dealer", 3.21);
    album.addSong("You can't do it right", 6.23);
    album.addSong("Highball shooter", 4.2);
    album.addSong("The gypsy", 3.13);
    album.addSong("Soldier of fortune", 5.23);
    albums.add(album);

    album = new Album("For those about to rock");
    album.addSong("For those about to rock", 4.6);
    album.addSong("I put the finger on you", 3.25);
    album.addSong("Let's go", 5.21);
    album.addSong("Inject the venom", 3.11);
    album.addSong("Snowballed", 6.23);
    album.addSong("Evil walks", 4.3);
    album.addSong("C.O.D", 1.24);
    album.addSong("Breaking the rules", 4.32);
    album.addSong("Night of the long knives", 5.5);

    albums.add(album);

    LinkedList<Song> playList = new LinkedList<Song>();
    albums.get(0).addToPlayList("You can't do it right", playList);
    albums.get(0).addToPlayList("Holy man", playList);
    albums.get(0).addToPlayList("Speed king", playList); //Does not exist
    albums.get(0).addToPlayList(9,playList);
    albums.get(1).addToPlayList(8,playList);
    albums.get(1).addToPlayList(3,playList);
    albums.get(1).addToPlayList(2,playList);
    albums.get(1).addToPlayList(91,playList); // Does not exist

    play(playList);




  }

  private static void play(LinkedList<Song> playList) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;
    ListIterator<Song> listIterator = playList.listIterator();
    if (playList.size() == 0) {
      System.out.println("No songs in the list");
      return;
    } else {
      System.out.println("Now playing ...\n" + listIterator.next().toString());
      printMenu();
    }

    while (!quit) {
      int action = scanner.nextInt();
      scanner.nextLine();

      switch (action) {
        case 0:
          System.out.println("Playlist complete.");
          quit = true;
          break;
        case 1:
          if (!forward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            forward = true;
          }
          if (listIterator.hasNext()) {
            System.out.println("Now playing " + listIterator.next().toString());
          } else {
            System.out.println("We have reached the end of the playlist.");
            forward = false;
          }
          break;

        case 2:
          if (forward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            forward = false;
          }

          if (listIterator.hasPrevious()) {
            System.out.println("Now playing " + listIterator.previous().toString());
          } else {
            System.out.println("We are at the start of the playlist.");
            forward = true;
          }
          break;

        case 3:
          if (forward) {
            if (listIterator.hasPrevious()) {
              System.out.println("Now replaying " + listIterator.previous());
              forward = false;
            } else {
              System.out.println("We are at the start of the list.");
            }
          } else {
            if (listIterator.hasNext()) {
              System.out.println("Now replaying " + listIterator.next());
              forward = true;
            } else {
              System.out.println("We have reached the end of the list.");
            }
          }
          break;

        case 4:
          printList(playList);
          break;

        case 5:
          printMenu();
          break;

        case 6:
          if (playList.size() > 0) {
            listIterator.remove();
            if (listIterator.hasNext()) {
              System.out.println("Now playing " + listIterator.next());
            } else if (listIterator.hasPrevious()) {
              System.out.println("Now playing " + listIterator.previous());
            }
          }
          break;
      }
    }
  }

  private static void printMenu() {
    System.out.println("Available options: \n press");
    System.out.println("0 - to quit");
    System.out.println("1 - to play next song");
    System.out.println("2 - to play previous song");
    System.out.println("3 - to replay the current song");
    System.out.println("4 - list songs in the playlist");
    System.out.println("5 - print available actions");
    System.out.println("6 - delete current song from the playlist");
  }

  private static void printList(LinkedList<Song> playList) {
    Iterator<Song> iterator = playList.iterator();
    System.out.println("==================================");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("==================================");
  }

}
