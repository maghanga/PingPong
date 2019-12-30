//import models.PingPong;
import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number:");
        try {
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            PingPong pingPong = new PingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
            System.out.println(pingPongResult);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
