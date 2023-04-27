package com.example.tp55;

public class Centre {
    private int id;
    private String nom,ville,latitude,longitude;

    public Centre(int id, String nom, String ville, String latitude, String longitude) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Centre(String nom, String ville, String latitude, String longitude) {
        this.nom = nom;
        this.ville = ville;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Centre() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
