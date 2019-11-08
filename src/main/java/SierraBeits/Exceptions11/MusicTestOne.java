package SierraBeits.Exceptions11;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class MusicTestOne {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("We have get synthesizer");
        } catch (MidiUnavailableException e) {
            System.out.println("Unsuccessful attempt");
        }

    }

    public static void main(String[] args) {
        MusicTestOne musicTest = new MusicTestOne();
        musicTest.play();
    }
}
