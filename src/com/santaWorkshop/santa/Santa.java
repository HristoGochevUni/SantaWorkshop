package com.santaWorkshop.santa;

import com.santaWorkshop.commands.BikeWish;
import com.santaWorkshop.commands.DollWish;
import com.santaWorkshop.commands.ToyWish;

public class Santa {
    private Santa() {

    }

    private static Santa instance;

    public static Santa getInstance() {
        if (instance == null) instance = new Santa();
        return instance;
    }

    public void sayMagicWords(String words) {
        // Associating the correct wish with santa's words;
        ToyWish toyWish;
        switch (words) {
            case "Трябват ми кукли":
                toyWish = new DollWish();
                break;
            case "Трябват ми колелета":
                toyWish = new BikeWish();
                break;
            default:
                return;
        }
        // Making the wish come true
        toyWish.execute();
    }
}
