package com.ramon.musical.musica;

public class Note {

	private int nota;
	private int notaFixa = 52;

	public double getFrequency() {
		// TODO Auto-generated method stub
		return nota;
	}

	public String getNoteName() {
		// TODO Auto-generated method stub
		return nota + "1";
	}

	public void setNoteValue(int noteValueToPlay) {
			nota = notaFixa + noteValueToPlay;
		
	}

	public int getMidiNoteNumber() {
		// TODO Auto-generated method stub
		return nota;
	}

}
