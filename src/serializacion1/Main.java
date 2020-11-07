package serializacion1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mclase m,m2;
        m = new Mclase("ola",-7,2.7e10);
        m2=null;
        ObjectOutputStream out;
        ObjectInputStream in;
        try {
            out = new ObjectOutputStream(new FileOutputStream("serial"));
            out.writeObject(m);
            out.close();
        }catch (IOException e){
            System.out.println("no se pudo abrir el archivo");
        }
        System.out.println(m);
        try{
            in=new ObjectInputStream(new FileInputStream("serial"));
            m2=(Mclase)in.readObject();
            in.close();
        }catch(IOException e2){
            System.out.println("No se pudo abrir para leer el archivo");
        }catch (Exception ce){
            System.out.println("Objeto no encontrado");
        }

        System.out.println(m2);
    }
}
