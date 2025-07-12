package com.learn.RestWithRepository.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
  private int id;
  @NotBlank(message = "First name can not be empty")
  private String firstName;
  @NotBlank(message = "Last name can not be empty")
  private String lastName;
  private String email;

  public Employee() {}
  public Employee(int id, String firstName, String lastName, String email) {
    this.id = 0;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}
