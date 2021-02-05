package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class FactoryInGameScreen extends MyScreen {
    public FactoryInGameScreen(MyGame game) {
        super(game);
    }

    @Override
    protected void afterAssetsLoaded() {
        addStage(new FactoryInGameStage(game),1,true);
        ((FactoryGame)game).setMusic(FactoryGame.MusicType.GAME);
    }

    @Override
    public AssetList getAssetList() {
        return null;
    }
}
