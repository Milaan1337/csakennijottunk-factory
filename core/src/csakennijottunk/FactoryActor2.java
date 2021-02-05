package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class FactoryActor2 extends OneSpriteStaticActor {
    public FactoryActor2(MyGame game) {
        super(game, "Factory/factory2.jpg");
        this.setSize(20,20);
    }
}
