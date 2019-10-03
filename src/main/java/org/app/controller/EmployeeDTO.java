package org.app.controller;

import java.time.LocalDate;

public class EmployeeDTO {
    private String code;
    private String fullname;
    private LocalDate startDate;


    public String getCode() {
        return code;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "code='" + code + '\'' +
                ", fullname='" + fullname + '\'' +
                ", startDate=" + startDate +
                '}';
    }
}
