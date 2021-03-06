package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class FactoryMenuScreen extends MyScreen {
    public FactoryMenuScreen(MyGame game) {
        super(game);
    }

    @Override
    protected void afterAssetsLoaded() {
        addStage(new FactoryMenuStage(game),0,true);
        ((FactoryGame)game).setMusic(FactoryGame.MusicType.MAIN);
    }

    @Override
    public AssetList getAssetList() {
        return new AssetList();
    }
}
