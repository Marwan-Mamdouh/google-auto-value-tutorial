package com.marwan.dev.model;

import java.util.Objects;

public class Employee {

  private final int id;
  private final String fName;
  private final String lName;
  // Add fields like you want to

  public Employee(int id, String fName, String lName) {
    this.id = id;
    this.fName = fName;
    this.lName = lName;
  }

  public int getId() {
    return id;
  }

  public String getfName() {
    return fName;
  }

  public String getlName() {
    return lName;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Employee employee)) {
      return false;
    }
    return getId() == employee.getId() && Objects.equals(getfName(), employee.getfName())
        && Objects.equals(getlName(), employee.getlName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getfName(), getlName());
  }

  @Override
  public String toString() {
    return "Employee{id=" + id + ", fName='" + fName + "', lName='" + lName + "'}";
  }
}