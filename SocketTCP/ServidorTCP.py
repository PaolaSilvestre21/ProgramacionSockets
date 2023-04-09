from socket import *
serverName = "localhost"
serverPort = 15000
serverSocket = socket(AF_INET, SOCK_STREAM)
serverSocket.bind(('', serverPort))
serverSocket.listen(1)
print ('Servidor listo para recibir')
while True:
    connectionSocket, addr = serverSocket.accept()
    sentence = connectionSocket.recv(1024).decode()
    capitalizedSentence = "ACK "+sentence.upper()
    connectionSocket.send(capitalizedSentence.encode())

connectionSocket.close()