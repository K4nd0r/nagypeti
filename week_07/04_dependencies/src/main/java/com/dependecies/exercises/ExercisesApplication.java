package com.dependecies.exercises;

import com.dependecies.exercises.services.MyColor;
import com.dependecies.exercises.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor color;

  @Autowired
  public ExercisesApplication(Printer printer, MyColor color) {
    this.color = color;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(ExercisesApplication.class, args);

  }

  @Override
  public void run(String... args) {
    this.printer.log(color.printColor());
  }

}

