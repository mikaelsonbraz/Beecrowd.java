// https://www.beecrowd.com.br/judge/en/problems/view/1049
package Beginner;

import java.util.Objects;
import java.util.Scanner;

public class beginner1049 {

    public static void main(String[] args){

        Scanner entrada =  new Scanner(System.in);

        String tipagem = entrada.nextLine();
        String famiglia = entrada.nextLine();
        String alimento = entrada.nextLine();

        System.out.println(achaAnimal(tipagem, famiglia, alimento));
    }

    public static String achaAnimal(String tipo, String familia, String comida){
        String animal = "";
        if (Objects.equals(tipo, "vertebrado")){
            if (Objects.equals(familia, "ave")){
                animal = (Objects.equals(comida, "carnivoro")) ? "aguia" : "pomba";
            } else if (Objects.equals(familia, "mamifero")){
                animal = (Objects.equals(comida, "onivoro")) ? "homem" : "vaca";
            }
        } else if (Objects.equals(tipo, "invertebrado")){
            if (Objects.equals(familia, "inseto")){
                animal = (Objects.equals(comida, "hematofago")) ? "pulga" : "lagarta";
            } else if (Objects.equals(familia, "anelideo")){
                animal = (Objects.equals(comida, "hematofago")) ? "sanguessuga" : "minhoca";
            }
        }

        return animal;
    }
}
