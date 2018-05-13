package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.io.Serializable;

/**
 * Created by Даниил on 13.04.2018.
 */
public class Terrain{

    private Sprite sprite;
    private int movementCost;
    public String name;
    public boolean flag;
    private int x, y;

    public Terrain(int m, String n, Texture texture){

        movementCost = m;
        sprite = new Sprite(texture);
        sprite.setSize(1,1);//debug code
        name = n;
        flag = false;

    }

    public Terrain(int m, String n, Sprite sprite){

        movementCost = m;
        this.sprite = sprite;
        name = n;

    }

    public void draw(SpriteBatch batch){sprite.draw(batch);}

    public int getMovementCost(){return movementCost;}
    public Sprite getSprite(){return sprite;}
    public void setSprite(Sprite sprite){this.sprite = sprite;}
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

}
