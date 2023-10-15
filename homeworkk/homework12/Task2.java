package homework12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Task2{
    public static void main(String[] args) throws FileNotFoundException, RuntimeException {
        Scanner sc = new Scanner(System.in);
        StringBuilder line = new StringBuilder();
        String document;
        try {
            System.out.print("Укажите путь к файлу: ");
            String name = sc.nextLine();
            document = Serializator.deserialization(name);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        String[] d = document.split("\n");
        for(int i = 0; i< d.length; i++){
            line.setLength(0);

            if(d[i].length() !=15)
                line.append("   Длина номера не равна 15");
            else if (d[i].contains("!" + "@" + "#" +"$" +"%"+"^"+"&+"+
                    "*"+"("+")"+"_"+"+"+"\"" +"№" +";"+";"+":"+"?"+"("+"_"+"+"+"/"+"|"+"\\"+"/"+"}"+"{"+"]"+
                    "["+"'"+"."+","+"<"+">"+"№"+"~"+""))
                line.append("   Номер содержит служебные символы");

            if(line.length() == 0)
                Serializator.serialization(d[i],"Valid");
            else
                Serializator.serialization(d[i] + line, "NotVlid");
        }
    }
}
