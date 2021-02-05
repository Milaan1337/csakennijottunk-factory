package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class TesztIndito extends MyGame {
    public TesztIndito(boolean debug) {
        super(debug);
    }

    @Override
    public void create() {
        super.create();
        setScreen(new FactoryInGameScreen(this));
    }

    @Override
    public void setScreen(FactoryCreditStage factoryCreditStage) {

    }
}
