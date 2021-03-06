package com.mygdx.game.playable;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.decals.Decal;
import com.mygdx.game.ai.controller.SimpleTestController;
import com.mygdx.game.armor.LeatherArmor;
import com.mygdx.game.build.NewTexturePack;
import com.mygdx.game.enumerations.Classification;
import com.mygdx.game.interfaces.Property;
import com.mygdx.game.weaponry.meleeweapon.SpiderBite;

import java.util.ArrayList;

public class Spider extends DollSprite {
    public Spider(String name, int hp, int capacity, int movementsPoints, int level, int experience, int strength,
                  int dexterity, int constitution, int initiativebonus, Classification classification,
                  ArrayList<Property> properties, Sprite sprite) {
        super(name, hp, capacity, movementsPoints, level, experience, strength, dexterity, constitution,
                initiativebonus, classification, properties, sprite);
    }

    public Spider (){

        super("Spider", 16, 3,  4, 1,
                400, 10, 16,12,
                3, Classification.Nonplayable,
                new ArrayList<Property>(), new Sprite(NewTexturePack.spider));
        this.equipWeapon(new SpiderBite());
        equipArmor(new LeatherArmor());


    }

    {//TODO контроллер паука
        setController(new SimpleTestController(this));
    }

}
