package project.connectro;

import project.entity.Airplane;
import project.entity.AirplaneType;

import java.io.*;

public class Connector {

    public void writeObject(Airplane airplane) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("Airplane.txt"))) {
            outputStream.writeObject(airplane);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Airplane readObject() {
        Airplane airplane = null;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Airplane.txt"))) {
            airplane = (Airplane) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return airplane;
    }
}
