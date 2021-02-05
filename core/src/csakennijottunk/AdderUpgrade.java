package csakennijottunk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Scene2D.OneSpriteStaticActor;

public class AdderUpgrade extends OneSpriteStaticActor {
    ClickListener c1;
    FactoryInGameStage factoryInGameStage;

    public AdderUpgrade(MyGame game){
        super(game, "badlogic.jpg");
        this.setSize(50,50);
        this.addListener(c1 = new ClickListener(){

            @Override
            public void clicked(InputEvent event, float x, float y) {
                super.clicked(event, x, y);
                if(factoryInGameStage.getPoints()<0){
                    System.out.println("Nincs eleg penzed");
                }
                else {

                    System.out.println("Koszonjuk a vasarlast");

                }



            }
        });









    }



}
