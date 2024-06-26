package com.example.ommpproject.projectommp.services;

import com.example.ommpproject.projectommp.models.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.multipart.MultipartFile;



public interface PiecesService  {

	List<PiecesJointes> getAllPieces();

	PiecesJointes addPieces(PiecesJointes p);

	PiecesJointes editPiecesJointes(PiecesJointes g);



	void deletePiecesJointesById(Long id);

	

	PiecesJointes getFile(Long id);

	Stream<PiecesJointes> getAllFiles();

	

	List<PiecesJointes> store(MultipartFile[] files);
}
