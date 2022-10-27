package com.xworkz.users.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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

import com.xworkz.users.dto.UsersDTO;
import com.xworkz.users.service.UsersService;

@Controller
@RequestMapping("/strat")
public class UsersController {

	@Autowired
	private UsersService usersService;

	public UsersController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(UsersDTO usersDTO, Model model, @RequestParam("files") MultipartFile file) throws IOException {

		System.out.println("Calling OnSave Method");
		System.out.println("UsersDTO" + usersDTO);
		byte[] bytes = file.getBytes();
		String string = System.currentTimeMillis() + "_" + file.getOriginalFilename();
		Path path = Paths.get("F://temp-files/" + string);
		System.out.println(path);
		Files.write(path, bytes);
		usersDTO.setFileName(string);
		Boolean validateAndSave = usersService.validateAndSave(usersDTO);
		if (validateAndSave) {

			System.out.println("Data is validateAndSave");
			model.addAttribute("UsersDTO", usersDTO);
			model.addAttribute("Msg", "FileName is saved");
			return "index";
		} else {
			System.out.println("Data is not ValidAndNotSave");
			model.addAttribute("Msg1", "FileName is saved");
			return "index";
		}
	}

	@GetMapping("**/image")
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
		List<UsersDTO> dtos = usersService.validateAndFindAll();
		if (dtos != null && !dtos.isEmpty()) {
			model.addAttribute("UsersDTO", dtos);

		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is Empty");
		}

		return "DisPlay";

	}

	@GetMapping("/findByName")
	public String findByUserName(HttpServletRequest req, Model model) {
		String name = req.getParameter("userName");
		List<UsersDTO> dtos = usersService.validateAndFindByUserName(name);
		System.out.println("UsersDTO" + dtos);
		if (dtos != null) {
			model.addAttribute("UsersDTO", dtos);
		} else {
			System.out.println("dtos are not found");
			model.addAttribute("msg", "Data is Empty");

		}
		return "DisPlay";

	}

}
