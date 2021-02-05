package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteAnimatedActor;

public class SmokeActor extends OneSpriteAnimatedActor {
    public SmokeActor(MyGame game) {
        super(game, "Flipper/smoke.atlas");
        setSize(16,16);
        setFps(5);
        setPosition(24,64);
    }
}
