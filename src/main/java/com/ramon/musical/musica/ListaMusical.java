package com.ramon.musical.musica;

import java.util.ArrayList;
import java.util.List;

public class ListaMusical {

	private static final List<NotasMusicais> notas;

	
	static {
		notas = new ArrayList();
		
		notas.add(NotasMusicais.DO);
		notas.add(NotasMusicais.DOs);
		notas.add(NotasMusicais.RE);
		notas.add(NotasMusicais.REs);
		notas.add(NotasMusicais.MI);
		notas.add(NotasMusicais.FA);
		notas.add(NotasMusicais.FAs);
		notas.add(NotasMusicais.SOL);
		notas.add(NotasMusicais.SOLS);
		notas.add(NotasMusicais.LA);
		notas.add(NotasMusicais.LAS);
		notas.add(NotasMusicais.SI);
	}
	
	public ListaMusical() {}
	
	public static NotasMusicais getNota(int index) {
		return notas.get(index);
	}
	
	
}
