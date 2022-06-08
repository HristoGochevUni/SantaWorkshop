package com.santaWorkshop;

import com.santaWorkshop.dwarves.Dwarf;
import com.santaWorkshop.magicBoard.MagicBoard;
import com.santaWorkshop.santa.Santa;
import com.santaWorkshop.toysPile.ToysPile;

public class Main {

    public static void main(String[] args) {
        // Creating santa's 3 most trusted elves
        Dwarf askasleikir = new Dwarf("Askasleikir");
        Dwarf bjugnakraekir = new Dwarf("Bjugnakraekir");
        Dwarf faldafeykir = new Dwarf("Faldafeykir");
        // Subscribing each of them to Santa's magic board
        MagicBoard.getInstance().subscribe(askasleikir);
        MagicBoard.getInstance().subscribe(bjugnakraekir);
        MagicBoard.getInstance().subscribe(faldafeykir);
        // Santa saying the magic words for a doll
        Santa.getInstance().sayMagicWords("Трябват ми кукли");
        // Santa saying the magic words for a bike
        Santa.getInstance().sayMagicWords("Трябват ми колелета");
        // Printing each element of the toys pile
        ToysPile.getInstance().listPile();
    }
}
