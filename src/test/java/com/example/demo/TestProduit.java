package com.example.demo;

import com.example.demo.controller.ProduitController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
@SpringBootTest
@AutoConfigureMockMvc
public class TestProduit {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProduitController produitController;

    @Test
    public void testHome() throws Exception {
        // Définissez le comportement attendu de la méthode home()
        when(produitController.home()).thenReturn("This is Home page");

        // Effectuez la requête HTTP GET pour l'URL "/"
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("This is Home page"));
    }

    @Test
    public void testArjuncodes() throws Exception {
        // Définissez le comportement attendu de la méthode arjuncodes()
        when(produitController.arjuncodes()).thenReturn("This is my page");

        // Effectuez la requête HTTP GET pour l'URL "/arjuncodes"
        mockMvc.perform(MockMvcRequestBuilders.get("/arjuncodes"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("This is my page"));
    }
}

