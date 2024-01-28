package com.registration.model;

import com.registration.constants.Role;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Integer mobileNumber;
    private String dateOfBirth;
    private String emailId;
    private Role role;

    //PARAMETERIZED CONSTRUCTOR
    public UserRegistration(Integer userId, String username, String password, String firstName, String lastName, Integer mobileNumber, String dateOfBirth, String emailId, Role role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.emailId = emailId;
        this.role = role;
    }

    //GETTER SETTER

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //TOSTRING

    @Override
    public String toString() {
        return "UserRegistration{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", emailId='" + emailId + '\'' +
                ", role=" + role +
                '}';
    }
}
