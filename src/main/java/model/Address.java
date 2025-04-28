package model;

import java.util.Objects;

public class Address {

  private String street;
  private String city;
  private String houseNumber;
  private String postalCode;
  private String country;

  public Address(String street, String city, String houseNumber, String postalCode, String country) {
    this.street = street;
    this.city = city;
    this.houseNumber = houseNumber;
    this.postalCode = postalCode;
    this.country = country;
  }

  public String toString() {
    return houseNumber + ", " + street + ", " + city + ", " + postalCode + ", " + country;
  }


  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass())
      return false;
    Address address = (Address) o;
    return Objects.equals(street, address.street) && Objects.equals(city, address.city)
        && Objects.equals(houseNumber, address.houseNumber) && Objects.equals(postalCode,
        address.postalCode) && Objects.equals(country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, houseNumber, postalCode, country);
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  }