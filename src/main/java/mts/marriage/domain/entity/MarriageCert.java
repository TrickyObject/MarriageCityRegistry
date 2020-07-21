package mts.marriage.domain.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "ro_marriage_certificate")
@Entity
// В NamedQuery нужно указать имя класса (!)
@NamedQuery(name = "MarriageCert.findByNum",
        query = "SELECT mc FROM MarriageCert mc WHERE mc.number = :number")
public class MarriageCert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "marriage_certificate_id")
    private Long marriageCertId;
    @Column(name = "marriage_number")
    private String number;
    @Column(name = "date_issue")
    private LocalDate issueDate;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "husband_id")
    private PersonMale husband;
    @ManyToOne(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "wife_id")
    private PersonFemale wife;
    @Column(name = "active")
    private boolean active;
    @Column(name = "end_date")
    private LocalDate endDate;

    public Long getMarriageCertId() {
        return marriageCertId;
    }

    public void setMarriageCertId(Long marriageCertId) {
        this.marriageCertId = marriageCertId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public PersonMale getHusband() {
        return husband;
    }

    public void setHusband(PersonMale husband) {
        this.husband = husband;
    }

    public PersonFemale getWife() {
        return wife;
    }

    public void setWife(PersonFemale wife) {
        this.wife = wife;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
