import java.io.*;
import java.net.*;
class ServidorTCP {
    public static void main(String argv[]) throws Exception
    {
        String ClienteFrase;
        String Mayus;
        ServerSocket socketrecep = new ServerSocket (6789);
        while(true){
            Socket socketConexion = socketrecep.accept();
            BufferedReader entradaC = new BufferedReader(new InputStreamReader(
                socketConexion.getInputStream()
            ));
            DataOutputStream salidaC = new DataOutputStream(
                socketConexion.getOutputStream()
            );
            ClienteFrase = entradaC.readLine();
            Mayus = ClienteFrase.toUpperCase() + '\n';
            salidaC.writeBytes(Mayus);
        }
    }
}