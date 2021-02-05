package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class FactoryGame  extends MyGame {
    public FactoryGame(boolean debug) {
        super(debug);
    }

    @Override
    public void create() {
        super.create();
        setScreen(new FactoryMenuScreen(this));
    }
}
