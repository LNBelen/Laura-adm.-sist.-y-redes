import requests

url = "https://source.unsplash.com/collection/881002"
response = requests.get(url)

archivo = open("archivo.py","w")
archivo.write(response.text)
archivo.close()

print(response.text)
input()