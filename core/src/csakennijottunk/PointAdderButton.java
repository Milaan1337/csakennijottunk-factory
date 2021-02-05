package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class PointAdderButton extends OneSpriteStaticActor {
    public PointAdderButton(MyGame game) {
        super(game, "badlogic.jpg");
        this.setSize(30,30);
    }
}
