package net.therap.javafest.currencyconverter.controller;

import net.therap.javafest.currencyconverter.service.CurrencyConverterService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Mushfekur Rahman
 * @since 1.0
 */
public class ConverterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Double amountInBdt = Double.valueOf(request.getParameter("bdt"));
        Double amountInUsd = new CurrencyConverterService().bdtToUsd(amountInBdt);

        PrintWriter out = response.getWriter();
        out.println(
                "<html> \n" +
                        "<head> \n" +
                            "<title> BDT To USD Converter  </title> \n" +
                        "</head> \n" +
                                "<body> <div align='center'> \n" +
                                    "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                                        "Amount in USD: " + amountInUsd.toString() + " <br> " +
                                    "</style>" +
                                "</body> \n" +
                "</html>"
        );
    }
}
