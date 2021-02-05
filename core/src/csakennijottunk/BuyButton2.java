package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class BuyButton2 extends OneSpriteStaticActor {
    public BuyButton2(MyGame game) {
        super(game, "Factory/factoryvasarlas2.jpg");
        this.setColor(255,0,0,160);
        this.setSize(20,20);
        this.setPosition(0,60);
    }
}
