import java.io.*;
import java.net.*;
class ClienteTCP {
    public static void main(String argv[]) throws Exception
    {
        String frase;
        String frasemodi;
        BufferedReader entradaUsuario = new BufferedReader(
            new InputStreamReader(System.in)
        );
    Socket socketCliente = new Socket("localhost", 6789);
    DataOutputStream salidaServidor = new DataOutputStream(
        socketCliente.getOutputStream()
    );
    BufferedReader entradaServidor =
    new BufferedReader(new InputStreamReader(
        socketCliente.getInputStream()
    ));
    frase = entradaUsuario.readLine();
    salidaServidor.writeBytes(frase + '\n');
    modifiedSentence = entradaServidor.readLine();
    System.out.println("Servidor; " + frasemodi);
    socketCliente.close();
        }
    }

