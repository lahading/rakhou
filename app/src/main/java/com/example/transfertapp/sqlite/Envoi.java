package com.example.transfertapp.sqlite;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Envoi {
    private int id;

    public Envoi(int id, String nomEmetteur, String prenomEmetteur, String mobileEmetteur, String cniEmetteur, String nomDestinataire, String prenomDestinataire, String mobileDestinataire, float montant, String date, String transactionId) {
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String strDate = sdfDate.format(now);
        this.id = id;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
        this.mobileEmetteur = mobileEmetteur;
        this.cniEmetteur = cniEmetteur;
        this.nomDestinataire = nomDestinataire;
        this.prenomDestinataire = prenomDestinataire;
        this.mobileDestinataire = mobileDestinataire;
        this.montant = montant;
        this.date = strDate;
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Envoi{" +
                "id=" + id +
                ", nomEmetteur='" + nomEmetteur + '\'' +
                ", prenomEmetteur='" + prenomEmetteur + '\'' +
                ", mobileEmetteur='" + mobileEmetteur + '\'' +
                ", cniEmetteur='" + cniEmetteur + '\'' +
                ", nomDestinataire='" + nomDestinataire + '\'' +
                ", prenomDestinataire='" + prenomDestinataire + '\'' +
                ", mobileDestinataire='" + mobileDestinataire + '\'' +
                ", montant=" + montant +
                ", date='" + date + '\'' +
                ", transactionId='" + transactionId + '\'' +
                '}';
    }

    private String nomEmetteur;
    private String prenomEmetteur;
    private String mobileEmetteur;
    private String cniEmetteur;
    private String nomDestinataire;
    private String prenomDestinataire;
    private String mobileDestinataire;
    private float montant;
    private String date;
    private String transactionId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomEmetteur() {
        return nomEmetteur;
    }

    public void setNomEmetteur(String nomEmetteur) {
        this.nomEmetteur = nomEmetteur;
    }

    public String getPrenomEmetteur() {
        return prenomEmetteur;
    }

    public void setPrenomEmetteur(String prenomEmetteur) {
        this.prenomEmetteur = prenomEmetteur;
    }

    public String getMobileEmetteur() {
        return mobileEmetteur;
    }

    public void setMobileEmetteur(String mobileEmetteur) {
        this.mobileEmetteur = mobileEmetteur;
    }

    public String getCniEmetteur() {
        return cniEmetteur;
    }

    public void setCniEmetteur(String cniEmetteur) {
        this.cniEmetteur = cniEmetteur;
    }

    public String getNomDestinataire() {
        return nomDestinataire;
    }

    public void setNomDestinataire(String nomDestinataire) {
        this.nomDestinataire = nomDestinataire;
    }

    public String getPrenomDestinataire() {
        return prenomDestinataire;
    }

    public void setPrenomDestinataire(String prenomDestinataire) {
        this.prenomDestinataire = prenomDestinataire;
    }

    public String getMobileDestinataire() {
        return mobileDestinataire;
    }

    public void setMobileDestinataire(String mobileDestinataire) {
        this.mobileDestinataire = mobileDestinataire;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
