package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class InfoButton extends OneSpriteStaticActor {
    ClickListener c1;

    public InfoButton(MyGame game) {
        super(game, "Factory/infobutton.jpg");
        this.addListener( c1 = new ClickListener() {
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.getMyAssetManager().getSound("Factory/onclick.mp3").play();
                        game.setScreen(new FactoryInfoScreen(game));
                    }
                }
        );
    }



    }

