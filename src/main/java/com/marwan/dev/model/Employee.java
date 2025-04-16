package com.marwan.dev.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Employee {

  abstract int getId();

  abstract String getFName();

  abstract String getLName();

  // Add fields like you want to
  public static Employee create(int id, String fName, String lName) {
    return new AutoValue_Employee(id, fName, lName);
  }
}