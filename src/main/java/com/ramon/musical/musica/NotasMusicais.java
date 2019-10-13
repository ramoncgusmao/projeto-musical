package com.ramon.musical.musica;

public enum NotasMusicais {

	DO(0),
	DOs(1),
	RE(2),
	REs(3),
	MI(4),
	FA(5),
	FAs(6),
	SOL(7),
	SOLS(8),
	LA(9),
	LAS(10),
	SI(11);
	
	private final int valor;
	private final int valorReferencia = 48;
	NotasMusicais(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valorReferencia + valor;
    }
}
