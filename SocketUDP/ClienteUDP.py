import time
import socket
i = 0

for ping in range(15):
    
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

    client_socket.settimeout(1.0)
    mensaje = b'Testeo'
    direc = ("127.0.0.1", 12000)

    inicio = time.time()
    client_socket.sendto(mensaje, direc)
   
    i = i +1
    print(i, "\n", "Tiempo actual: ", inicio)


    try:
        data, server = client_socket.recvfrom(1024)
        fin = time.time()
        elapsed = fin - inicio
        print(f'{data} {ping} {elapsed}')

    except socket.timeout:
        print('Necesito mas Tiempo')