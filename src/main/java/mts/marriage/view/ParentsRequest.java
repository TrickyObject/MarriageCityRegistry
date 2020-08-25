package mts.marriage.view;

import mts.marriage.domain.LocalDateAdapter;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDate;

public class ParentsRequest implements Serializable {

    private String fatherSurName;
    private String fatherFirstName;
    private String fatherPatronymicName;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate fatherDateOfBirth;
    private String fatherPassportSerial;
    private String fatherPassportNumber;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate fatherPassportDate;

    private String motherSurName;
    private String motherFirstName;
    private String motherPatronymicName;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate motherDateOfBirth;
    private String motherPassportSerial;
    private String motherPassportNumber;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate motherPassportDate;

    private String childSurName;
    private String childFirstName;
    private String childPatronymicName;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate childDateOfBirth;

    private String birthCertNumber;
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate birthCertDate;


    @Override
    public String toString() {
        return "ParentsRequest{" +
                "fatherSurName='" + fatherSurName + '\'' +
                ", fatherFirstName='" + fatherFirstName + '\'' +
                ", fatherPatronymicName='" + fatherPatronymicName + '\'' +
                ", fatherDateOfBirth=" + fatherDateOfBirth +
                ", fatherPassportSerial='" + fatherPassportSerial + '\'' +
                ", fatherPassportNumber='" + fatherPassportNumber + '\'' +
                ", fatherPassportDate=" + fatherPassportDate +
                ", motherSurName='" + motherSurName + '\'' +
                ", motherFirstName='" + motherFirstName + '\'' +
                ", motherPatronymicName='" + motherPatronymicName + '\'' +
                ", motherDateOfBirth=" + motherDateOfBirth +
                ", motherPassportSerial='" + motherPassportSerial + '\'' +
                ", motherPassportNumber='" + motherPassportNumber + '\'' +
                ", motherPassportDate=" + motherPassportDate +
                ", childSurName='" + childSurName + '\'' +
                ", childFirstName='" + childFirstName + '\'' +
                ", childPatronymicName='" + childPatronymicName + '\'' +
                ", childDateOfBirth=" + childDateOfBirth +
                ", birthCertNumber='" + birthCertNumber + '\'' +
                ", birthCertDate=" + birthCertDate +
                '}';
    }

    public String getFatherSurName() {
        return fatherSurName;
    }

    public void setFatherSurName(String fatherSurName) {
        this.fatherSurName = fatherSurName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getFatherPatronymicName() {
        return fatherPatronymicName;
    }

    public void setFatherPatronymicName(String fatherPatronymicName) {
        this.fatherPatronymicName = fatherPatronymicName;
    }

    public LocalDate getFatherDateOfBirth() {
        return fatherDateOfBirth;
    }

    public void setFatherDateOfBirth(LocalDate fatherDateOfBirth) {
        this.fatherDateOfBirth = fatherDateOfBirth;
    }

    public String getFatherPassportSerial() {
        return fatherPassportSerial;
    }

    public void setFatherPassportSerial(String fatherPassportSerial) {
        this.fatherPassportSerial = fatherPassportSerial;
    }

    public String getFatherPassportNumber() {
        return fatherPassportNumber;
    }

    public void setFatherPassportNumber(String fatherPassportNumber) {
        this.fatherPassportNumber = fatherPassportNumber;
    }

    public LocalDate getFatherPassportDate() {
        return fatherPassportDate;
    }

    public void setFatherPassportDate(LocalDate fatherPassportDate) {
        this.fatherPassportDate = fatherPassportDate;
    }

    public String getMotherSurName() {
        return motherSurName;
    }

    public void setMotherSurName(String motherSurName) {
        this.motherSurName = motherSurName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public String getMotherPatronymicName() {
        return motherPatronymicName;
    }

    public void setMotherPatronymicName(String motherPatronymicName) {
        this.motherPatronymicName = motherPatronymicName;
    }

    public LocalDate getMotherDateOfBirth() {
        return motherDateOfBirth;
    }

    public void setMotherDateOfBirth(LocalDate motherDateOfBirth) {
        this.motherDateOfBirth = motherDateOfBirth;
    }

    public String getMotherPassportSerial() {
        return motherPassportSerial;
    }

    public void setMotherPassportSerial(String motherPassportSerial) {
        this.motherPassportSerial = motherPassportSerial;
    }

    public String getMotherPassportNumber() {
        return motherPassportNumber;
    }

    public void setMotherPassportNumber(String motherPassportNumber) {
        this.motherPassportNumber = motherPassportNumber;
    }

    public LocalDate getMotherPassportDate() {
        return motherPassportDate;
    }

    public void setMotherPassportDate(LocalDate motherPassportDate) {
        this.motherPassportDate = motherPassportDate;
    }

    public String getChildSurName() {
        return childSurName;
    }

    public void setChildSurName(String childSurName) {
        this.childSurName = childSurName;
    }

    public String getChildFirstName() {
        return childFirstName;
    }

    public void setChildFirstName(String childFirstName) {
        this.childFirstName = childFirstName;
    }

    public String getChildPatronymicName() {
        return childPatronymicName;
    }

    public void setChildPatronymicName(String childPatronymicName) {
        this.childPatronymicName = childPatronymicName;
    }

    public LocalDate getChildDateOfBirth() {
        return childDateOfBirth;
    }

    public void setChildDateOfBirth(LocalDate childDateOfBirth) {
        this.childDateOfBirth = childDateOfBirth;
    }

    public String getBirthCertNumber() {
        return birthCertNumber;
    }

    public void setBirthCertNumber(String birthCertNumber) {
        this.birthCertNumber = birthCertNumber;
    }

    public LocalDate getBirthCertDate() {
        return birthCertDate;
    }

    public void setBirthCertDate(LocalDate birthCertDate) {
        this.birthCertDate = birthCertDate;
    }
}
