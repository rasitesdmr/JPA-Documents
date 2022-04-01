package Model;

import javax.persistence.*;
import java.util.*;


@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personnelId;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.TIME)
    private Date birthOfDate;

    @ElementCollection(fetch = FetchType.LAZY) // İlişkili tablodaki verileri getirme
    @CollectionTable(name = "personnelEmail" ,joinColumns = @JoinColumn(name = "personnelId"))
    @Column(name = "email")
    private List<String> emails = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)   // İlişkili taplodaki verileri getirme 
    @CollectionTable(name = "phoneNumbers", joinColumns = @JoinColumn(name = "personnelId"))
    @MapKeyColumn(name = "phoneType")
    @MapKeyEnumerated(EnumType.STRING) // verileri 0 ,1,2 değilde string tipinde tutar
    @Column(name = "PhoneNumber")
    private Map<phoneTypes, String> phoneNumbers = new HashMap<>();

    public Personnel() {
    }

    public Personnel(String firstName, String lastName, Date birthOfDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;

    }
    public void addEmail(String email){
        this.emails.add(email);
    }

    public void addPhoneNumber(phoneTypes phoneTypes, String phoneNumber) {
        this.phoneNumbers.put(phoneTypes, phoneNumber);
    }

    public int getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(int personnelId) {
        this.personnelId = personnelId;
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

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public Map<phoneTypes, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<phoneTypes, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getEmail() {
        return emails;
    }

    public void setEmail(List<String> email) {
        this.emails = email;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "personnelId=" + personnelId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", emails=" + emails +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
