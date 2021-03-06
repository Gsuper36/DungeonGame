package com.mygdx.game.objects;

import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelBatch;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.decals.Decal;
import com.badlogic.gdx.graphics.g3d.decals.DecalBatch;
import com.mygdx.game.ai.controller.AIController;
import com.mygdx.game.enumerations.Classification;
import com.mygdx.game.enumerations.Direction;
import com.mygdx.game.enumerations.Status;
import com.mygdx.game.graphics.RenderType3D;
import com.mygdx.game.interfaces.*;
import com.mygdx.game.tools.BuffPool;
import com.mygdx.game.weaponry.buffs.Buff;

import java.util.ArrayList;

/**
 * Created by Даниил on 27.04.2018.
 */
public class ModelEntity extends Entity
        implements RenderType3D {

    protected ModelInstance model;


    public ModelEntity(String n, Model s){
        super(n, 1, -1, -1);
        model = new ModelInstance(s);

    }
    public ModelEntity(String n, Model m, int hp){
        super(n, hp, -1, -1);
        model = new ModelInstance(m);
    }

    @Override
    public void addProperty(Property property) {

    }

    @Override
    public void setInitiative(int i) {

    }

    @Override
    public void makeStep(int c) {}

    @Override
    public int getMP() {return 0;}

    @Override
    public void resetMP() {}

    @Override
    public int getInitiativebonus() {return 0;}

    @Override
    public int getInitiative() {
        return 0;
    }

    @Override
    public Status getStatus() {return null;}


    @Override
    public Direction getDirection() {return null;}

    @Override
    public void setDirection(Direction direction) {}

    @Override
    public void setClassification(Classification classification) {}

    @Override
    public void setStatus(Status status) {}

    @Override
    public float getX() {return x;}

    @Override
    public float getY() {return y;}

    @Override
    public void setXY(int x, int y) {

        this.x = x;
        this. y = y;
        model.transform.translate(x,0,y);

    }

    @Override
    public void show() {}

    @Override
    public void equipWeapon(Weapon weapon) {}
    @Override
    public void equipArmor(Armor armor) {}

    @Override
    public void putItem(Item item) {}

    @Override
    public void deleteItem(Item item) {

    }

    @Override
    public void takeDamage(GameObject gameObject) {}

    @Override
    public void takeDamage(Weapon weapon) {

    }

    @Override
    public void takeDamage(int dmg) {

    }

    @Override
    public ArrayList<Property> getProperties() {
        return null;
    }

    @Override
    public Weapon getWeapon() {return null;}

    @Override
    public Armor getArmor() {return null;}

    @Override
    public int getHP() {return hp;}

    @Override
    public void setHp(int hp) {

        this.hp = hp;

    }

    @Override
    public BuffPool getBuffPool() {
        return null;
    }

    @Override
    public void addBuff(Buff buff) {

    }

    @Override
    public Direction getWatchDirection() {return null;}

    @Override
    public AIController getController() {
        return null;
    }

    @Override
    public String getName() {return name;}

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getStrength() {
        return 0;
    }

    @Override
    public int getDexterity() {
        return 0;
    }

    @Override
    public int getConstitution() {
        return 0;
    }

    @Override
    public int getArmorClass() {
        return 0;
    }

    @Override
    public int getDEX() {
        return 0;
    }

    @Override
    public int getSTR() {
        return 0;
    }

    @Override
    public int getCON() {
        return 0;
    }

    @Override
    public void draw(ModelBatch modelBatch, DecalBatch decalBatch, Environment environment)
    {modelBatch.render(model, environment);}

    @Override
    public boolean isDecal() {
        return false;
    }

    @Override
    public Decal getDecal() {
        return null;
    }

    @Override
    public ModelInstance getModelInstance() {
        return model;
    }
}
