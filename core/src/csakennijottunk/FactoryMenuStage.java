package csakennijottunk;

import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import javax.sound.sampled.Line;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.MyStage;

public class FactoryMenuStage extends MyStage {
    StartButton startButton;
    InfoButton infoButton;
    CreditButton creditButton;
    ExitButton exitButton;
    public FactoryMenuStage(MyGame game) {
        super(new ExtendViewport(90,160), game);
        setCameraResetToCenterOfScreen();
        addBackButtonScreenBackByStackPopListener();

        startButton = new StartButton(game);
        startButton.setPosition(24, 100 );
        startButton.setSize(50, 50);
        addActor(startButton);

        creditButton = new CreditButton(game);
        creditButton.setPosition(24, 70);
        creditButton.setSize(50, 50);
        addActor(creditButton);

        infoButton = new InfoButton(game);
        infoButton.setPosition(24, 40);
        infoButton.setSize(50, 50);
        addActor(infoButton);

        exitButton = new ExitButton(game);
        exitButton.setPosition(24, 10);
        exitButton.setSize(50, 50);
        addActor(exitButton);





    }

}
