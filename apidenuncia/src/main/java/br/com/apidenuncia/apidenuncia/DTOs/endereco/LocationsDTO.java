package br.com.apidenuncia.apidenuncia.DTOs.endereco;

public class LocationsDTO {

    private String street;
    private String adminArea6;
    private String adminArea5;
    private String adminArea3;
    private String adminArea1;
    private String postalCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAdminArea6() {
        return adminArea6;
    }

    public void setAdminArea6(String adminArea6) {
        this.adminArea6 = adminArea6;
    }

    public String getAdminArea5() {
        return adminArea5;
    }

    public void setAdminArea5(String adminArea5) {
        this.adminArea5 = adminArea5;
    }

    public String getAdminArea3() {
        return adminArea3;
    }

    public void setAdminArea3(String adminArea3) {
        this.adminArea3 = adminArea3;
    }

    public String getAdminArea1() {
        return adminArea1;
    }

    public void setAdminArea1(String adminArea1) {
        this.adminArea1 = adminArea1;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
