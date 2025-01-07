import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    ServerSocket server;
    Socket client;
    String messaggio;
    String operazione;
    int op1, op2, res;
    BufferedReader input;
    DataOutputStream output;
    public void avvia() throws IOException {
        System.out.println("avvio");
        server = new ServerSocket(6789);
        client = server.accept();
        server.close();
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        output = new DataOutputStream(client.getOutputStream());
    }

    public void trasmissione() throws IOException {
        messaggio = input.readLine();
        System.out.println("Numero 1 ricevuto dal cliente: " + messaggio);
        op1 = Integer.parseInt(messaggio);
        messaggio = input.readLine();
        System.out.println("Operando ricevuto dal cliente: " + messaggio);
        operazione = messaggio;
        messaggio = input.readLine();
        System.out.println("Numero 2 ricevuto dal cliente: " + messaggio);
        op2 = Integer.parseInt(messaggio);
        res = calcolo(op1,op2,operazione);
        output.writeBytes(String.valueOf(res));
        client.close();
    }

    private int calcolo(int op1, int op2, String operazione) {
        int result = 0;
        switch(operazione){
            case "+":
                result = op1 + op2;
            break;
            case "-":
                result = op1 - op2;
            break;
            case "*":
                result = op1 * op2;
            break;
            case "/":
                result = op1 / op2;
            break;
        }
        return result;
    }
}