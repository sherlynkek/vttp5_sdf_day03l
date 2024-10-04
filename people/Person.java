package people;

public class Person {
    private String region;
    private Integer yearOfBirth;
    
    public Person(String region, Integer yearOfBirth) {
        this.region = region;
        this.yearOfBirth = yearOfBirth;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }
    
    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    
}
