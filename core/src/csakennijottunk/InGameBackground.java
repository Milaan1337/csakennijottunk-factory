package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class InGameBackground extends OneSpriteStaticActor {
    public InGameBackground(MyGame game, int x, int y) {
        super(game, "Factory/ingamebackground.png");
        this.setPosition(x,y);
        this.setSize(90, 160);
    }

}
