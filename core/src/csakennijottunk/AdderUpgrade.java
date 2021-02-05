package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class AdderUpgrade extends OneSpriteStaticActor {
    public AdderUpgrade(MyGame game){
        super(game, "Factory/2xupgrade.jpg");
        this.setSize(40,40);

    }

}
