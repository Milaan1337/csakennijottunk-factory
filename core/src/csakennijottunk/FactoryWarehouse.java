package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class FactoryWarehouse extends OneSpriteStaticActor {
    FactoryWarehouse(MyGame game) {
        super(game, "Factory/warehouse.jpg");
        this.setSize(50, 50);

    }
}
