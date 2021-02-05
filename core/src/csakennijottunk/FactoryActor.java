package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class FactoryActor extends OneSpriteStaticActor {
    public FactoryActor(MyGame game) {
        super(game, "Factory/factory.png");
        this.setSize(20,20);
    }
}
