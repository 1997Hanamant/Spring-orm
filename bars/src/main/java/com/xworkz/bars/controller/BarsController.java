package com.xworkz.bars.controller;

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

import com.xworkz.bars.dto.BarsDTO;
import com.xworkz.bars.service.BarsService;

@Controller
@RequestMapping("/drinks")
public class BarsController {
	@Autowired
	private BarsService barsService;

	public BarsController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSave(BarsDTO barsDTO, Model model, @RequestParam("files") MultipartFile file) throws IOException {
		System.out.println("Calling OnSave method");
		byte[] bytes = file.getBytes();
		String string = System.currentTimeMillis() + "_" + file.getOriginalFilename();
		Path path = Paths.get("F://temp-files/" + string);
		System.out.println(path);
		Files.write(path, bytes);
		barsDTO.setFileName(string);

		Boolean validateAndSave = barsService.validateAndSave(barsDTO);
		if (validateAndSave) {
			System.out.println("Data is ValidateAndSave");
			model.addAttribute("BarsDTO", barsDTO);
			model.addAttribute("Msg", "FileName is saved");
			return "index";
		} else {
			System.out.println("Data is not ValidateAn not Save ");
			model.addAttribute("Msg1", "FileName not saved");

			return "index";
		}

	}

	@GetMapping("**/send")
	public void sendFile(@RequestParam String fileName,HttpServletResponse response) throws IOException {
		System.out.println("Running SendFile...." + fileName);
		File file = new File("F://temp-files//" + fileName);
		String mimeType = URLConnection.guessContentTypeFromName(file.getName());
		response.setContentType(mimeType);
		try (OutputStream outputStream = response.getOutputStream()) {
			outputStream.write(Files.readAllBytes(file.toPath()));
		}
	}

	@GetMapping
	public String findAll(Model model) {
		System.out.println("Calling FindAll method");
		List<BarsDTO> validAndfindAll = barsService.validAndfindAll();
		if (validAndfindAll != null && !validAndfindAll.isEmpty()) {
			model.addAttribute("BarsDTO", validAndfindAll);
		} else {
			model.addAttribute("BarsDTO is not found");
			model.addAttribute("msg", "Data is not found");
		}
		return "ShowAll";

	}
	@GetMapping("/findByName")
	public String findByName(HttpServletRequest request,Model  model) {
		System.out.println("Calling findByName method");
		String name = request.getParameter("name");
		List<BarsDTO> validateAndFindByName = barsService.validateAndFindByName(name);
		if(validateAndFindByName!=null && !validateAndFindByName.isEmpty()) {
			model.addAttribute("BarsDTO", validateAndFindByName);
			model.addAttribute("msg", "Image is found");
		}
		else {
			model.addAttribute("Name is not found");
			model.addAttribute("msg", "Image is not found");
		}
		return "showFindByName";
		
	}
	@GetMapping("**/findByFileName")
	public String findByFileName(HttpServletRequest request,Model model) {
		System.out.println("Calling findByFileName");
		String price = request.getParameter("price");
		String location = request.getParameter("location");
		String validateAndFindFileName = barsService.ValidateAndFindFileNameByPriceAndLocation(Double.parseDouble(price), location);
		if(validateAndFindFileName!=null) {
			model.addAttribute("BarsDTO", validateAndFindFileName);
			model.addAttribute("msg", "FileName is not found");
			
		}
		else {
			model.addAttribute("FileName is Found");
			model.addAttribute("msg", "FileName is  found");
			
		}
		
		return "showFindFileName";
		
	}

}
