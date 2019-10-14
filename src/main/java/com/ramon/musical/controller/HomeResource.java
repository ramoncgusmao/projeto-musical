package com.ramon.musical.controller;

import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.VoiceStatus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
	public String home(ModelMap model) {
		
		NotasMusicais nota = ListaMusical.getNota(0);
		System.out.println(nota.getValor());
		VoiceStatus[] vt = null;
		try {
			vt = MidiHelper.playSomething(nota.getValor());
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		model.addAttribute("som", vt);
		
		return "home";
	}
	
	@RequestMapping("/nota/")
	public String nota(@RequestParam(value="action", required=true) int id, ModelMap model)  {
		
		NotasMusicais nota = ListaMusical.getNota(id);
		System.out.println(nota.getValor());
		VoiceStatus[] vt = null;
		try {
			vt = MidiHelper.playSomething(nota.getValor());
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("som", vt);
		return "home";
	}
}
