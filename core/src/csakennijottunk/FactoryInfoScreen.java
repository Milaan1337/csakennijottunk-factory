package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class FactoryInfoScreen extends MyScreen {
    public FactoryInfoScreen(MyGame game) {super(game);}

    @Override
    protected void afterAssetsLoaded() {
        addStage(new FactoryInfoStage(game), 1, true);
        ((FactoryGame)game).setMusic(FactoryGame.MusicType.GAME);

    }

    @Override
    public AssetList getAssetList() {
        return null;
    }
}
