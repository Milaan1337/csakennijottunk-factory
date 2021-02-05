package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class ProductIcon extends OneSpriteStaticActor {
    public ProductIcon(MyGame game) {
        super(game, "Factory/product.png");
        this.setSize(20,20);
    }
}
