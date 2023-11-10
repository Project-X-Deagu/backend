package com.projectx.dododoc;

import com.projectx.dododoc.domain.Korean;
import com.projectx.dododoc.repository.KoreanRepository;
import com.projectx.dododoc.service.KoreanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class DododocApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DododocApplication.class, args);
	}
}
