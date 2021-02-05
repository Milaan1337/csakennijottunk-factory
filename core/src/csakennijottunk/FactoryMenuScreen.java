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
        addStage(new FactoryMenuStage(game),1,true);
    }

    @Override
    public AssetList getAssetList() {
        return new AssetList();
    }
}
