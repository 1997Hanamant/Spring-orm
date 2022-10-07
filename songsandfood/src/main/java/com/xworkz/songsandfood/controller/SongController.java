package com.xworkz.songsandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.songsandfood.dto.SongDTO;

@Component
@RequestMapping("/")
public class SongController {
	Collection<SongDTO> songDTOs = new ArrayList<SongDTO>();

	public SongController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@RequestMapping("/song.do")
	public String songAdd(SongDTO songDTO, Model model) {
		System.out.println("Calling songAdd");
		System.out.println("Fecthing the SongsDTo details" + songDTO);
		model.addAttribute("SongsDto", songDTO);
		boolean add = songDTOs.add(songDTO);
		System.out.println(add);

		return "Song.jsp";

	}

	@RequestMapping("/songsDisplay.do")
	public String viewSongs(Model model) {
		System.out.println("calling viewSongs");
		model.addAttribute("list", this.songDTOs);
		return "/DisplaySongs.jsp";

	}

}
