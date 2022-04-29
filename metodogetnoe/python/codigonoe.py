import requests

url = "https://source.unsplash.com/collection/881002"
response = requests.get(url)

archivocuerpo = open("archivocuerpo.txt","w")
archivocuerpo.write(str(response.json()))
archivocuerpo.close()

print(response.text)

print(response.headers)
archivoencabezado= open("archivoencabezado.txt","w")
archivoencabezado.write(str(response.headers))
archivoencabezado.close()

input()