package model;

public class Employment {
    public String id;
    public String name;
    public int age;
    public String course;
    public String address;
    public float mediumscore;

    public Employment() {
    }

    public Employment(String id, String name, int age, String course, String address, float mediumscore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumscore = mediumscore;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumscore() {
        return mediumscore;
    }

    public void setMediumscore(float mediumscore) {
        this.mediumscore = mediumscore;
    }
}

