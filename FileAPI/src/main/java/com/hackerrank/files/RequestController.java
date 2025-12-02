package com.hackerrank.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class RequestController {
	public static final String UPLOAD_DIR = "uploads/";

	@PostMapping("/uploader")
	public ResponseEntity uploader(@RequestParam("fileName") String fileName,
			@RequestParam("file") MultipartFile file) {

		try {
			Path uploadPath = Paths.get(UPLOAD_DIR);
			if (!Files.exists(uploadPath)) {
				Files.createDirectories(uploadPath);
			}
			Path filePath = Paths.get(UPLOAD_DIR + fileName);
			file.transferTo(filePath);
			return new ResponseEntity<>(HttpStatus.CREATED);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/downloader")
	public ResponseEntity downloader(@RequestParam String fileName) {
		try {
			Path uploadPath = Paths.get(UPLOAD_DIR);
			Path filePath = Paths.get(UPLOAD_DIR + fileName);
			if(Files.exists(filePath)) {
				byte[] fileContent = Files.readAllBytes(filePath);
			    HttpHeaders headers = new HttpHeaders();
			    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			    headers.setContentDispositionFormData("attachment", fileName);
			    return new ResponseEntity<>(fileContent, headers, HttpStatus.OK);
			} else {
			    return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<String> handleMaxSizeException(MaxUploadSizeExceededException exc) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("File size exceeds limit of 100KB");
    }
}
