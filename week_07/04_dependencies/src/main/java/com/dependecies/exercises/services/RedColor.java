package com.dependecies.exercises.services;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  @Override
  public String printColor() {
    return "It is red in color...";
  }

}
