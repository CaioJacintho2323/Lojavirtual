package com.jpasite;

import com.jpasite.domain.CarrinhoCompras;
import com.jpasite.domain.Lojavirtual;
import com.jpasite.domain.Produto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lojavirtual lojavirtual = new Lojavirtual();
        System.out.println("PRODUTOS DA LOJA");
        Lojavirtual produto1 = new Lojavirtual("tv","tv smart",200, 5);
        Lojavirtual produto2= new Lojavirtual("arroz","1kg",10, 5);
        Lojavirtual produto3 = new Lojavirtual("notebook", "m1", 5000,5);
        Lojavirtual produto4 = new Lojavirtual("dunk", "panda", 500,20);

        lojavirtual.addProduto(produto1);
        lojavirtual.addProduto(produto2);
        lojavirtual.addProduto(produto3);
        lojavirtual.addProduto(produto4);

        lojavirtual.exibeLista();

        System.out.println("---------------------------------");



        CarrinhoCompras c = new CarrinhoCompras();
        c.add(produto1);
        c.add(produto2);
        c.remove(produto1);


        System.out.println("Itens no carrinho");
        //c.exibeLista();
        System.out.println(c);
        c.calcularTotal();

        File file = new File("test.txt");
        try(FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(String.valueOf(c));
            bw.flush();
        }catch (IOException e ){
            e.printStackTrace();
        }

    }
}