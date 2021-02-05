package csakennijottunk;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimer;
import hu.csanyzeg.master.MyBaseClasses.Timers.OneTickTimerListener;
import hu.csanyzeg.master.MyBaseClasses.UI.MyLabel;

public class TimerLabel extends MyLabel {
    public TimerLabel(MyGame game, CharSequence text) {
        super(game, text, new LabelStyle(game.getMyAssetManager().getFont("Factory/font-factory.ttf"), Color.BROWN)  );
        addTimer(new OneTickTimer(2f, new OneTickTimerListener(){
            @Override
            public void onTick(OneTickTimer sender, float correction) {
                super.onTick(sender, correction);
                TimerLabel.this.remove();
            }

            @Override
            public void onStop(OneTickTimer sender) {
                super.onStop(sender);
            }

            @Override
            public void onStart(OneTickTimer sender) {
                super.onStart(sender);
            }
        }));
    }
}
