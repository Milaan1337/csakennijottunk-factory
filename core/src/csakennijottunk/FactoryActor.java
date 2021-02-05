package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class FactoryActor extends OneSpriteStaticActor {
    public FactoryActor(MyGame game) {
        super(game, "Factory/factory.png");
        this.setSize(35,35);
        this.setPosition(30,70);
    }
}
