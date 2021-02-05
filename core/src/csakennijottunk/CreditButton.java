package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class CreditButton extends OneSpriteStaticActor {
    ClickListener c1;
    public CreditButton(MyGame game) {
        super(game, "badlogic.jpg");
        this.addListener( c1 = new ClickListener(){
            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                game.setScreen(new FactoryCreditStage(game));
            }
        });
    }
}

