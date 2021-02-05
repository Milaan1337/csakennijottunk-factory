package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class CoinIcon extends OneSpriteStaticActor {
     CoinIcon(MyGame game) {
        super(game, "Factory/coin.jpg");
        this.setSize(20,20);

    }
}
