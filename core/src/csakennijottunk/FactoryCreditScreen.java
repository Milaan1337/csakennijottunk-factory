package csakennijottunk;

import hu.csanyzeg.master.MyBaseClasses.Assets.AssetList;
import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyScreen;

public class FactoryCreditScreen extends MyScreen {
    public FactoryCreditScreen(MyGame game) {
        super(game);
    }

    @Override
    protected void afterAssetsLoaded() {

    }

    @Override
    public AssetList getAssetList() { addStage(new FactoryCreditStage(game), 0, true);
        return null;
    }
}
