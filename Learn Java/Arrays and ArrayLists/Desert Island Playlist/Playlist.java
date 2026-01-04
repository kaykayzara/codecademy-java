/*
Project: Desert Island Playlist (Codecademy – Learn Java)

Summary:
- Build a music playlist manager using Java Arrays and ArrayLists.
- Combine favorite songs from an array into a dynamic ArrayList.
- Practice adding, removing, swapping, and accessing playlist elements.
- Simulate curating a "desert island" playlist with your top songs.

Concepts practiced:
- Arrays vs ArrayLists (fixed vs dynamic collections)
- ArrayList methods: add(), addAll(), remove(), indexOf(), set(), get(), size()
- Arrays.asList() for array-to-list conversion
- Variable swapping algorithm
- String manipulation and console output

Run:
javac Playlist.java
java Playlist
*/

import java.util.Arrays;
import java.util.ArrayList;

class Playlist {
    public static void main(String[] args) {

    // favoriteSongs Array
    String [] favoriteSongs = {"YES IT IS", "OUT OF BODY", "get me started", "Form of You", "Changes", "Atencion", "Honey", "Switch Up", "Jump", "Sun/Son", "Love Me JeJe"};

    System.out.println(favoriteSongs[0]);
    System.out.println(favoriteSongs[1]);
    System.out.println(favoriteSongs[2] + "\n");

    // deserIslandPlaylist ArrayList
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    desertIslandPlaylist.add("Silk Pillows");
    desertIslandPlaylist.add("Maria Joana");
    desertIslandPlaylist.add("love nwantiti (ah ah ah)");
    desertIslandPlaylist.add("Blackberry Sap");
    desertIslandPlaylist.add("Louie Bag");

    System.out.println(desertIslandPlaylist + "\n");

    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));
    System.out.println(desertIslandPlaylist + "\n");

    System.out.println(desertIslandPlaylist.size() + "\n");

    desertIslandPlaylist.remove("Silk Pillows");
    desertIslandPlaylist.remove("Blackberry Sap");
    desertIslandPlaylist.remove("Louie Bag");
    desertIslandPlaylist.remove("get me started");
    desertIslandPlaylist.remove("Changes");
    desertIslandPlaylist.remove("Honey");
    desertIslandPlaylist.remove("OUT OF BODY");
    desertIslandPlaylist.remove("Switch Up");
    desertIslandPlaylist.remove("Sun/Son");
    desertIslandPlaylist.remove("Love Me JeJe");

    System.out.println(desertIslandPlaylist + "\n");

    int songA = desertIslandPlaylist.indexOf("Form of You");
    int songB = desertIslandPlaylist.indexOf("Atencion");

    String tempA = desertIslandPlaylist.get(songA);
    desertIslandPlaylist.set(songA, "Atencion");
    System.out.println(desertIslandPlaylist + "\n"); 

    desertIslandPlaylist.set(songA, tempA);
    }
}