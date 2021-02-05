package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class PointAdderButton extends OneSpriteStaticActor {
    public PointAdderButton(MyGame game) {
        super(game, "Factory/steal_button.png");
        this.setSize(30,30);
    }
}
