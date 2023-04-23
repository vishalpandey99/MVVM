package com.example.mvvm.models;

public class MovieModel {

    String BranchCode;
    String BranchName;
    String CityName;
    String BranchState;
    String BranchPhone;
    String BranchEmail;
    String BranchContactPerson;
    String BranchContactNumber;
    String BranchMobileNumber;
    String BranchEmailId;
    String BranchLATI;
    String BranchLong;
    String BranchAddress;

    public MovieModel() {
    }

    public MovieModel(String branchCode, String branchName, String cityName, String branchState, String branchPhone,
                      String branchEmail, String branchContactPerson, String branchContactNumber, String branchMobileNumber,
                      String branchEmailId, String branchLATI, String branchLong, String branchAddress) {
        this.BranchCode = branchCode;
        this.BranchName = branchName;
        this.CityName = cityName;
        this.BranchState = branchState;
        this.BranchPhone = branchPhone;
        this.BranchEmail = branchEmail;
        this.BranchContactPerson = branchContactPerson;
        this.BranchContactNumber = branchContactNumber;
        this.BranchMobileNumber = branchMobileNumber;
        this.BranchEmailId = branchEmailId;
        this.BranchLATI = branchLATI;
        this.BranchLong = branchLong;
        this.BranchAddress = branchAddress;
    }

    public String getBranchCode() {
        return BranchCode;
    }

    public void setBranchCode(String branchCode) {
        BranchCode = branchCode;
    }

    public String getBranchName() {
        return BranchName;
    }

    public void setBranchName(String branchName) {
        BranchName = branchName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getBranchState() {
        return BranchState;
    }

    public void setBranchState(String branchState) {
        BranchState = branchState;
    }

    public String getBranchPhone() {
        return BranchPhone;
    }

    public void setBranchPhone(String branchPhone) {
        BranchPhone = branchPhone;
    }

    public String getBranchEmail() {
        return BranchEmail;
    }

    public void setBranchEmail(String branchEmail) {
        BranchEmail = branchEmail;
    }

    public String getBranchContactPerson() {
        return BranchContactPerson;
    }

    public void setBranchContactPerson(String branchContactPerson) {
        BranchContactPerson = branchContactPerson;
    }

    public String getBranchContactNumber() {
        return BranchContactNumber;
    }

    public void setBranchContactNumber(String branchContactNumber) {
        BranchContactNumber = branchContactNumber;
    }

    public String getBranchMobileNumber() {
        return BranchMobileNumber;
    }

    public void setBranchMobileNumber(String branchMobileNumber) {
        BranchMobileNumber = branchMobileNumber;
    }

    public String getBranchEmailId() {
        return BranchEmailId;
    }

    public void setBranchEmailId(String branchEmailId) {
        BranchEmailId = branchEmailId;
    }

    public String getBranchLATI() {
        return BranchLATI;
    }

    public void setBranchLATI(String branchLATI) {
        BranchLATI = branchLATI;
    }

    public String getBranchLong() {
        return BranchLong;
    }

    public void setBranchLong(String branchLong) {
        BranchLong = branchLong;
    }

    public String getBranchAddress() {
        return BranchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        BranchAddress = branchAddress;
    }
}
