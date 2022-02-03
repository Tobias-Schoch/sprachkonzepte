import requests
import json

response = requests.get("https://feiertage-api.de/api/?jahr=2022&nur_land=BW")

y = str(json.dumps(response.json()))
y = y[1:]
print(y.replace("\"},", "}\n"))

# dynamische typisierung | Implizit typisierte Variablen
# automatische Speicherverwaltung durch die initalisierung von variablen
# keine main
# keine klasse
# variablen
# einfachen source code haben