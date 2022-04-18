package ro.unibuc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 TODO:
 scrieti o clasa java care sa returneze toate cuvinetele de lungime > n dintr-un fisier text
 Lungimea n trebuie introdusa de la tastatura.
 In plus fata de lungime, care trebuie introdusa de la tastatura, putem filtra si dupa alte conditii(vedeti testele)
 */
public class FileWordCounter {

    //HINT: you could make one generic method to reuse for all three methods above
    //HINT2: think about functional interfaces, one that verifies things in particular

    public List<String> countN(String fileName, int n)
    {
        List<String> lista = new ArrayList<String>();
            try{
                File file = new File(fileName);
                Scanner sc = new Scanner(file);

                while (sc.hasNextLine())
                    //System.out.println(sc.nextLine());
                {
                    String cuv = sc.next();
                    if(cuv.length() > n)
                    {
                        //System.out.println(cuv);
                        lista.add(cuv);
                    }
                }

            }catch(FileNotFoundException e){
                System.out.println("an error occured");
        }
            return lista;
    }

    public List<String> getSizeOne(String fileName) {
        List<String> lista = new ArrayList<String>();

        try{

            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String cuv = sc.next();
                if(cuv.length() == 1)
                {
                    lista.add(cuv);
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("an error occured");
        }
        return lista;
    }

    public List<String> getSizeLessThan3(String fileName) {
        List<String> lista = new ArrayList<String>();

        try{

            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String cuv = sc.next();
                if(cuv.length() < 3)
                {
                    lista.add(cuv);
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("an error occured");
        }
        return lista;
    }

    public List<String> countWordAppearances(String fileName, String word) {
        List<String> lista = new ArrayList<String>();

        try{

            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String cuvCurr = sc.next().split("[!?.]")[0];
                if(cuvCurr.matches(word))
                {
                    lista.add(word);
                }
            }

        }catch(FileNotFoundException e){
            System.out.println("an error occured");
        }
        return lista;
    }
}