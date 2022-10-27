package com.xworkz.criminals.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.criminals.dto.CriminalsDTO;
import com.xworkz.criminals.service.CriminalService;

@Controller
@RequestMapping("/Criminal")
public class CriminalController {
	@Autowired
	private CriminalService criminalService;

	public CriminalController() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(CriminalsDTO criminalsDTO, Model model, @RequestParam("image") MultipartFile file)
			throws IOException {
		System.out.println("Calling onSave method");
		byte[] bytes = file.getBytes();
		Path path = Paths.get("F://temp-files/" + file.getOriginalFilename());
		Files.write(path, bytes);
		criminalsDTO.setFileName(file.getOriginalFilename() + System.currentTimeMillis());
		System.out.println("CriminalsDTO" + criminalsDTO);
		boolean validateAndSave = criminalService.validateAndSave(criminalsDTO);
		if (validateAndSave) {
			System.out.println("Data is valid and Save");
			model.addAttribute("records", "Records are Saved");
			return "index";
		} else {
			System.out.println("Data is notvalid and notSave");
			return "index";
		}

	}

	@GetMapping("/image")
	public void sendFile(@RequestParam String fileName, HttpServletResponse response) throws IOException {

		System.out.println("Running SendFile......" + fileName);
		File file = new File("F://temp-files//" + fileName);
		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		response.setContentType(mimeType);
		try (OutputStream outputStream = response.getOutputStream()) {
			outputStream.write(Files.readAllBytes(file.toPath()));
		}

	}

	@GetMapping
	public String readAll(Model model) {
		System.out.println("Calling Read All Method");
		List<CriminalsDTO> dtos = criminalService.findAll();
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("dtos are found" + dtos.size());
			model.addAttribute("CriminalDetails", dtos);
			model.addAttribute("size", "Total Criminals found:" + dtos.size());

		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is Empty");
		}

		return "ShowAll";

	}

	@GetMapping("/findByName")
	public String findByName(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		List<CriminalsDTO> dtos = criminalService.validateFindByName(name);
		System.out.println("CriminalDetails" + dtos);
		System.out.println("Dtos are null" + dtos.isEmpty());
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("dtos are found" + dtos.size());
			model.addAttribute("CriminalDetails", dtos);
			model.addAttribute("size", "Total Criminals found:" + dtos.size());
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is Empty");

		}
		return "ShowAll";

	}

	@GetMapping("/findByGenderCountryAndCriminalType")
	public String findByAgeCountryAndCriminalType(HttpServletRequest req, Model model) {
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String criminalType = req.getParameter("criminalType");
		List<CriminalsDTO> dtos = criminalService.validateAndfindByGenderCountryAndCriminalType(gender, country,
				criminalType);
		if (dtos != null && !dtos.isEmpty()) {
			System.out.println("CriminalDetails" + dtos.size());
			model.addAttribute("CriminalDetails", dtos);
			model.addAttribute("size", "Criminals found:" + dtos.size());
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is not found");
		}
		return "ShowAll";

	}

}
