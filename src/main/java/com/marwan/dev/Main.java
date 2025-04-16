package com.marwan.dev;

import com.marwan.dev.model.Employee;

public class Main {

  public static void main(String[] args) {
    Employee employee1 = Employee.create(90, "Mohamed", "Ayman");

    System.out.println(employee1);
  }
}