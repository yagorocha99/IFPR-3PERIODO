package com.example.atividadeweb1803;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//O número de acessos foi aumentando a cada F5, e está funcionando em mais de um navegador
//Casos úteis: Manter o estado do usuário e armazenar dados temporários
//Não é seguro se for para algo importante, no caso pode ser contornado ou manipulado

@WebServlet(name = "ContadorDeAcessos", value = "/contador-de-acessos")
public class ContadorDeAcessos extends HttpServlet {

    private int contador = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                contador++;
                response.setContentType("text/html");
                response.getWriter().println("<h1>Contador de Acessos</h1>");
                response.getWriter().println("<p>Número de acessos: " + contador + "</p>");
    }
}
