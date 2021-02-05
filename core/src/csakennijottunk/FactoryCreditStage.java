package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;

public class FactoryCreditStage extends MyStage {
    BackButton backButton;
    ClickListener c1;
    public FactoryCreditStage(MyGame game) {
            super(new ExtendViewport(90, 160), game);
            addBackButtonScreenBackByStackPopListener();
            setCameraResetToCenterOfScreen();

            backButton = new BackButton(game);
            backButton.setPosition(0, 0);
            backButton.setSize(15, 15);

        }
    }

