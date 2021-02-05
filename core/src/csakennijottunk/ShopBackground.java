package csakennijottunk;

import com.badlogic.gdx.Game;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class ShopBackground extends OneSpriteStaticActor {
    ShopBackground(MyGame game){
        super(game, "Factory/shopback.jpg");
        this.setSize(100, 100);


    }
}
