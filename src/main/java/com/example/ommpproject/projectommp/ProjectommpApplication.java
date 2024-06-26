package com.example.ommpproject.projectommp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.ommpproject.projectommp.models.*;
import com.example.ommpproject.projectommp.repositories.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ProjectommpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectommpApplication.class, args);
    }

    }
