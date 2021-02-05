package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimerListener;

public class ExitButton extends OneSpriteStaticActor {
    ClickListener c1;

    public ExitButton(MyGame game) {
        super(game, "Factory/exitbutton.jpg");
        this.addListener(c1 = new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                addTimer(new OneTickTimer(1, new OneTickTimerListener() {
                    @Override
                    public void onTick(OneTickTimer sender, float correction) {
                        super.onTick(sender, correction);
                        game.getMyAssetManager().getSound("Factory/onclick.mp3").play();
                        game.setScreenBackByStackPop();
                    }


                }));
            }
            });
    }
}
