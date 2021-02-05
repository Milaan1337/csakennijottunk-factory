package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BuyButton extends OneSpriteStaticActor {
    public BuyButton(MyGame game) {
        super(game, "Factory/buyfactory.png");
        this.setSize(40,40);
        this.setPosition(20,60);
    }
}
