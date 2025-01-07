import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    Socket server;
    BufferedReader input;
    DataOutputStream output;
    String messaggio;

    public void start() throws IOException {
        System.out.println("inizio connessione");
        server = new Socket("localhost", 6789);
        input = new BufferedReader(new InputStreamReader(server.getInputStream()));
        output = new DataOutputStream(server.getOutputStream());
    }

    public void trasmissione() throws IOException {
        BufferedReader temp = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Invia numero 1 al server: ");
        messaggio = temp.readLine();
        output.writeBytes(messaggio + '\n');
        System.out.print("Invia operando al server (+ - * /): ");
        messaggio = temp.readLine();
        output.writeBytes(messaggio + '\n');
        System.out.print("Invia numero 2 al server: ");
        messaggio = temp.readLine();
        output.writeBytes(messaggio + '\n');
        System.out.println(input.readLine());
        server.close();
    }
}