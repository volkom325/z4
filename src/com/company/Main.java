package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        programmaperedax.raspisanie first = new programmaperedax.raspisanie("РОССИЯ 1","Новости");
        programmaperedax.raspisanie second = new programmaperedax.raspisanie("РОССИЯ 1","Следствие вели");
        programmaperedax.raspisanie third = new programmaperedax.raspisanie("РПЦ","просвящение");
        programmaperedax.raspisanie fourth = new programmaperedax.raspisanie("Условно","ДаДа");
    }
class programmaperedax {
    static class raspisanie {
        String nameTV;
        String namePeredax;
        ArrayList<raspisanie> aboba = new ArrayList<>();
        public raspisanie(String nameTV, String namePeredax) {
            this.nameTV = nameTV;
            this.namePeredax = namePeredax;
            aboba.add(this);
        }
    }

}}
