package com.example.ExcelUploadDownload.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ExcelUploadDownload.entity.ExcelFileUpload;

@Repository
public interface ExcelFileRepository extends JpaRepository<ExcelFileUpload, Integer>
{

	Optional<ExcelFileUpload> findByFilename(String filename);

}
