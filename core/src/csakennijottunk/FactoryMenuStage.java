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

        addActor(new MenuBackgroundActor(game, 0, 0));


        startButton = new StartButton(game);
        startButton.setPosition(35, 93 );
        startButton.setSize(25, 25);
        addActor(startButton);

        creditButton = new CreditButton(game);
        creditButton.setPosition(35, 78);
        creditButton.setSize(25, 25);
        addActor(creditButton);

        infoButton = new InfoButton(game);
        infoButton.setPosition(35, 63);
        infoButton.setSize(25, 25);
        addActor(infoButton);

        exitButton = new ExitButton(game);
        exitButton.setPosition(35, 48);
        exitButton.setSize(25, 25);
        addActor(exitButton);





    }

}
