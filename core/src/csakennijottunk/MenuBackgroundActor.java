package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class MenuBackgroundActor extends OneSpriteStaticActor {
    public MenuBackgroundActor(MyGame game, int x, int y) {
        super(game, "Factory/menubg.png");
        setSize(90, 160);
    }
}
