package com.mygdx.game.armor;

import com.mygdx.game.interfaces.Armor;
import com.mygdx.game.interfaces.GameObject;

/**
 * Created by Даниил on 09.09.2017.
 */
public class LeatherArmor extends Clothing {

    public LeatherArmor(int armor, int armorclass, String label) {
        super(armor, armorclass, label);
    }

    public LeatherArmor(){
        super(1,1,"Leather Armor");
    }
}
