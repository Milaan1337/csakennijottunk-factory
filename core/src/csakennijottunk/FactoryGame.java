package csakennijottunk;

import com.badlogic.gdx.audio.Music;

import hu.csanyzeg.master.MyBaseClasses.Game.MyGame;

public class FactoryGame  extends MyGame {
    public FactoryGame(boolean debug) {
        super(debug);
    }
    public enum MusicType{
        MAIN,
        GAME,
        NONE
    }

    Music music = null;

    public MusicType musicType = MusicType.NONE;

    public void setMusic(MusicType type){
        if (type != musicType){
            musicType = type;
            if (music != null){
                music.stop();
            }
            switch (musicType){
                case MAIN:
                    music = getMyAssetManager().getMusic("Factory/mainmusic.mp3");
                    music.setLooping(true);
                    music.play();
                    music.setVolume(0.5f);
                    break;
                case GAME:
                    music = getMyAssetManager().getMusic("Factory/ingame.mp3");
                    music.setLooping(true);
                    music.play();
                    music.setVolume(0.5f);
                    break;
                case NONE:
                    break;
            }
        }
    }

    @Override
    public void create() {
        super.create();
        setScreen(new FactoryMenuScreen(this));
    }

    @Override
    public void setScreen(FactoryCreditStage factoryCreditStage) {

    }
}
