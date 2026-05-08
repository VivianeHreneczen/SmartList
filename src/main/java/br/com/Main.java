package br.com;


import br.com.controller.ListaDeComprasController;
import br.com.model.ListaDeCompras;
import br.com.view.ListaDeComprasView;


//A classe Main é o ponto de entrada do programa, onde o model, view e controller são inicializados.
public class Main {
    public static void main(String[] args) {
        ListaDeCompras model = new ListaDeCompras();
        ListaDeComprasView view = new ListaDeComprasView();
        ListaDeComprasController controller = new ListaDeComprasController(model, view);

        controller.iniciar();
    }
}