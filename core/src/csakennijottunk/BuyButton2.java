package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BuyButton2 extends OneSpriteStaticActor {
    public BuyButton2(MyGame game) {
        super(game, "Factory/factoryvasarlas2.jpg");
        this.setSize(40,40);
        this.setPosition(0,60);
    }
}
