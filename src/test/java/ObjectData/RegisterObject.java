package ObjectData;

import java.util.HashMap;

public class RegisterObject {
    private String firstName;
    private String  lastName;
    private String adresa;
    private String email;
    private String phone;
    private String skills;
    private String country;
    private String yearDOB;
    private String monthDOB;
    private String dayDOB;
    private String user;
    private String password;
    private String language1;
    private String language2;
    private String language3;

    public RegisterObject(HashMap<String, String > testData) {
        populateData(testData);
    }
    public void populateData(HashMap<String, String >testData){
        for (String key:testData.keySet()){
            switch (key){
                case "firstName" :
                    setFirstName(testData.get(key));
                    break;
                case "lastName" :
                    setLastName(testData.get(key));
                    break;
                case "adresa" :
                    setAdresa(testData.get(key));
                    break;
                case "email" :
                    setEmail(testData.get(key));
                    break;
                case "phone" :
                    setPhone(testData.get(key));
                    break;
                case "skills" :
                    setSkills(testData.get(key));
                    break;
                case "country" :
                    setCountry(testData.get(key));
                    break;
                case "yearDOB" :
                    setYearDOB(testData.get(key));
                    break;
                case "monthDOB" :
                    setMonthDOB(testData.get(key));
                    break;
                case "dayDOB" :
                    setDayDOB(testData.get(key));
                    break;
                case "user" :
                    setUser(testData.get(key));
                    break;
                case "password" :
                    setPassword(testData.get(key));
                    break;
                case "language1" :
                    setLanguage1(testData.get(key));
                    break;
                case "language2" :
                    setLanguage2(testData.get(key));
                    break;
                case "language3" :
                    setLanguage3(testData.get(key));
                    break;
            }
        }
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

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYearDOB() {
        return yearDOB;
    }

    public void setYearDOB(String yearDOB) {
        this.yearDOB = yearDOB;
    }

    public String getMonthDOB() {
        return monthDOB;
    }

    public void setMonthDOB(String monthDOB) {
        this.monthDOB = monthDOB;
    }

    public String getDayDOB() {
        return dayDOB;
    }

    public void setDayDOB(String dayDOB) {
        this.dayDOB = dayDOB;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage1() {
        return language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public String getLanguage2() {
        return language2;
    }

    public void setLanguage2(String language2) {
        this.language2 = language2;
    }
    public String getLanguage3() {
        return language3;
    }

    public void setLanguage3(String language3) {
        this.language3 = language3;
    }
}
