package com.mygdx.game.weaponry.rangeweapon;

import com.mygdx.game.build.Room;
import com.mygdx.game.build.TexturePack;
import com.mygdx.game.enumerations.WeaponType;
import com.mygdx.game.interfaces.Attack;
import com.mygdx.game.interfaces.GameObject;
import com.mygdx.game.particles.ArrowParticle;
import com.mygdx.game.screens.GameScreen;
import com.mygdx.game.systems.GameScreenManager;
import com.mygdx.game.tools.Dice;
import com.mygdx.game.weaponry.attacks.D4Attack;

import static com.mygdx.game.enumerations.WeaponType.*;

public class Arrow extends Shell {

    public Arrow(int amount, Bow holder) {
        super("Arrow", amount, STABBING, holder, new D4Attack());
    }


    @Override
    public void drop(Room room, GameObject gameObject) {

    }
}
