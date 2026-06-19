## Primeiro Exercicio Resolvido

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Programa
{
    public static void main(String[] args) {
        PrimeiraClasse pc = new PrimeiraClasse();
        
        pc.ola();
    }
}

public class PrimeiraClasse{
    public void ola(){
    System.out.println("Bem-vindo a orientação à objetos");
}
    
}

/*Segundo Exercicio Resolvido*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Programa
{
    public static void main(String[] args) {
        PrimeiraClasse pc = new PrimeiraClasse();
        
        pc.curso = "Java - Orientação a objetos";
        pc.descricao = "Desafio do curso de Java Orientação à objetos";
        
        System.out.println(pc.curso);
        System.out.println(pc.descricao);
    }
}

public class PrimeiraClasse{
    public String descricao;
    public String curso;
}