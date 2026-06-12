package br.dev.matheus.security.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/manager")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, Object> privateManageEndpoint() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Manager Endpoint: Area Apenas para ADMINS!!!");
        return model;
    }

    // Apenas Logados podem ter acesso
    @GetMapping("/private")
    @PreAuthorize("isAuthenticated()")
    public Map<String, Object> privateEndpoint() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Private Endpoint: Area Restrita!");
        return model;
    }
    // Todos podem ter acesso

    @GetMapping("/public")
    @PreAuthorize("permitAll()")
    public Map<String, Object> publicEndpoint() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Public Endpoint: Area Publica!");
        return model;
    }

}
