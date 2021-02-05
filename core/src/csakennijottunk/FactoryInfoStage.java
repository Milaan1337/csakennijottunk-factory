package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;

public class FactoryInfoStage extends MyStage {
    ClickListener c1;
    BackButton backButton;
    public FactoryInfoStage(MyGame game) {
        super(new ExtendViewport(90, 160), game);
        setCameraResetToCenterOfScreen();
        addBackButtonScreenBackByStackPopListener();

        backButton = new BackButton(game);
        backButton.setSize(15, 15);
        backButton.setPosition(0, 0);
        addActor(backButton);
    }
}
