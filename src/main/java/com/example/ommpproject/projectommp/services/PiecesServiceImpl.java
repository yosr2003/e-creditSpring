package com.example.ommpproject.projectommp.services;
import com.example.ommpproject.projectommp.repositories.*;

import com.example.ommpproject.projectommp.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


@Service

public class PiecesServiceImpl implements PiecesService {
	 @Autowired
	    private PiecesRepository piecesRepository;
	 private static final String UPLOAD_DIR = "C:\\Users\\Yosra\\Downloads\\Gestion-Des-Ports-Maritimes-OMMP-main\\Gestion-Des-Ports-Maritimes-OMMP-main\\files";

	    @Override
	    public List<PiecesJointes> getAllPieces() {
	        return this.piecesRepository.findAll();
	    }

	 
		@Override
	
	    public PiecesJointes addPieces(PiecesJointes p) {
	        return this.piecesRepository.save(p);
	    }

	    @Override
	
	    public PiecesJointes editPiecesJointes(PiecesJointes g) {
	        return this.piecesRepository.save(g);
	    }

	

	    @Override
	
	    public void deletePiecesJointesById(Long id) {
	        this.piecesRepository.deleteById(id);
	    }
	    
	    @Override
	    public List<PiecesJointes> store(MultipartFile[] files) {
	        List<PiecesJointes> uploadedFiles = new ArrayList<>();
	        try {
	            for (MultipartFile file : files) {
	                String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	                PiecesJointes piecesJointes = new PiecesJointes();
	                piecesJointes.setName(fileName);
	                piecesJointes.setType(file.getContentType());
	                piecesJointes.setData(file.getBytes());

	                Path uploadPath = Paths.get(UPLOAD_DIR);
	                if (!Files.exists(uploadPath)) {
	                    Files.createDirectories(uploadPath);
	                }
	                Path filePath = uploadPath.resolve(fileName);
	                Files.write(filePath, file.getBytes());

	                piecesJointes.setFilePath(filePath.toString());

	                uploadedFiles.add(piecesJointes);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return uploadedFiles;
	    }
	    @Override
	    public PiecesJointes getFile(Long id) {
	        return piecesRepository.findById(id).orElse(null);
	    }

		public Stream<PiecesJointes> getAllFiles() {
		
			return this.piecesRepository.findAll().stream();
					 
		}

	    
	    
		
	      
	      
}
