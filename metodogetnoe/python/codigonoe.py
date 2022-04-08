import requests

url = "https://rickandmortyapi.com/api/character/5"
response = requests.get(url)

print(response.text)
input()