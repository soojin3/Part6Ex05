package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@GetMapping("/uploadForm")
	public void uploadForm() {
		
	}
	
	@PostMapping("uploadFormAction")
	public void uploadFormAction(MultipartFile[] file1) {
		for(MultipartFile justfile : file1) {
			System.out.println("파일이름"+justfile.getOriginalFilename());
			System.out.println("파일사이즈"+justfile.getSize());
			System.out.println("파라미터 이름"+justfile.getName());
			justfile.transferTo(dest);//파일저장
		}
		
	}
	
}
