package com.company;
// Jesse's code with Jacob Cedar's Seating Chart
public abstract class Person {
    // Fields
    private String firstName, familyName;

    // Constructor
    public Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;
    }

    // Methods

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getFamilyName() {
        return familyName;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * @param p Person object to compare to.
     * @return true if first and family name are equal.
     */

    public boolean equals(Person p) {
        return (p.firstName.equals(firstName)) && (p.familyName.equals(familyName));
    }
}