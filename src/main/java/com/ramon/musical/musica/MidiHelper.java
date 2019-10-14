package com.ramon.musical.musica;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.VoiceStatus;

/*
 * Baseado no codigo do Baralaborn
 * link: https://www.youtube.com/watch?v=nUKya2DvYSo
 */
public class MidiHelper {
	
	
	public static VoiceStatus[] playSomething(int nota) throws MidiUnavailableException {
		Synthesizer synthesizer = MidiSystem.getSynthesizer();
		
		long startTime = System.nanoTime();
		synthesizer.open();
		long estimatedTime = System.nanoTime() - startTime;
		
		MidiChannel[] midiChannel = synthesizer.getChannels();
		Instrument[] instruments = synthesizer.getDefaultSoundbank().getInstruments();
		boolean loadSucesso = synthesizer.loadInstrument(instruments[0]);
		
		
		 midiChannel[0].noteOn(nota, 100);
		 return synthesizer.getVoiceStatus();
	}

}
