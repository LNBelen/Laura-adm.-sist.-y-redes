import requests

url = 'https://pokeapi.co/api/v2/berry-firmness/'
response = requests.get(url)

print(response.text)
input()