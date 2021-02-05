package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BuyButton extends OneSpriteStaticActor {
    public BuyButton(MyGame game) {
        super(game, "badlogic.jpg");
        this.setSize(20,20);
        this.setPosition(20,60);
    }
}
