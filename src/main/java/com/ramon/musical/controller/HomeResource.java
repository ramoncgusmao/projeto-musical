package com.ramon.musical.controller;

import javax.sound.midi.MidiUnavailableException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ramon.musical.musica.ListaMusical;
import com.ramon.musical.musica.MidiHelper;
import com.ramon.musical.musica.NotasMusicais;



@Controller
public class HomeResource {

	
	@GetMapping("/")
	public String home() throws MidiUnavailableException {
      
		return "home";
	}
	
	@RequestMapping("/nota/")
	public String nota(@RequestParam(value="action", required=true) int id)  {
		
		NotasMusicais nota = ListaMusical.getNota(id);
		System.out.println(nota.getValor());
		try {
			MidiHelper.playSomething(nota.getValor());
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "home";
	}
}
