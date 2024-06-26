package com.example.ommpproject.projectommp.controller;
import com.example.ommpproject.projectommp.models.*;

import com.example.ommpproject.projectommp.services.*;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/PiecesJointes")
@CrossOrigin(origins = "http://localhost:4200")
public class PiecesController {
	
	
	@Autowired
	    private PiecesService piecesService;

	    @GetMapping
	    public List<PiecesJointes> getAllpieces() {
	        return this.piecesService.getAllPieces();
	    }

	  

	    @DeleteMapping("/{id}")
	    public void deletePiecesJointesById(@PathVariable Long id) {
	        this.piecesService.deletePiecesJointesById(id);
	    }

	    @PostMapping
	    public PiecesJointes addPieces(@RequestBody PiecesJointes PiecesJointes) {
	        return this.piecesService.addPieces(PiecesJointes);
	    }

	    @PutMapping("/{id}")
	    public PiecesJointes editPiecesJointes(@PathVariable Long id, @RequestBody PiecesJointes PiecesJointes) {
	        return this.piecesService.editPiecesJointes(PiecesJointes);
	    }
	    
	    
	    
	    @PostMapping("/upload")
	    public ResponseEntity<ResponseMessage> uploadFiles(@RequestParam("files") MultipartFile[] files) {
	        String message = "";
	        try {
	            List<PiecesJointes> uploadedFiles = this.piecesService.store(files);
	            if (!uploadedFiles.isEmpty()) {
	                message = "Uploaded files successfully!";
	                return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	            } else {
	                message = "No files uploaded!";
	                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	            }
	        } catch (Exception e) {
	            message = "Could not upload files!";
	            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	        }
	    }





	    @GetMapping("/files")
	    public ResponseEntity<List<ResponseFile>> getListFiles() {
	      List<ResponseFile> files = this.piecesService.getAllFiles().map(dbFile -> {
	        String fileDownloadUri = ServletUriComponentsBuilder
	            .fromCurrentContextPath()
	            .path("/PiecesJointes/files/") // Assuming your files are stored relative to this endpoint
	            .path(dbFile.getIdPiecesJointes().toString())
	            .toUriString();


	        return new ResponseFile(
	            dbFile.getName(),
	            fileDownloadUri,
	            dbFile.getType(),
	            dbFile.getData().length);
	      }).collect(Collectors.toList());

	      return ResponseEntity.status(HttpStatus.OK).body(files);
	    }

	    @GetMapping("/files/{id}")
	    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
	    	PiecesJointes fileDB = this.piecesService.getFile(id);

	      return ResponseEntity.ok()
	          .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
	          .body(fileDB.getData());
	    }
}
