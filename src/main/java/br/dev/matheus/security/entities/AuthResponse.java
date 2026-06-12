/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.matheus.security.entities;

/**
 *
 * @author sesi3dib
 */
public class AuthResponse {
    private String email;
    private String acessToken;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcessToken() {
        return acessToken;
    }

    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }

    public AuthResponse(String email, String acessToken) {
        this.email = email;
        this.acessToken = acessToken;
    }

    public AuthResponse() {
    }
}
