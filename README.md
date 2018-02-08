GET /hello
 - Vastab "Hello, World!"

GET /calculate?num1=3&num2=5&op=sum
 - Vastab summaga 8

POST /calculate {"num1": 3, "num2': 5, "op": "sum"}
 - Vastab {"num1": 2, "num2": 6, "op": "sum", "result": 8}
 
GET /employees
 - Vastab nimekirjaga igast töötajast JSON formaadis.
 
GET /employees/lisa?nimi=Kaur&ulemus=BitWeb
 - Lisab töötaja Kaur ning seab tema ülemuseks BitWeb. Vastab töötaja andmetega JSON formaadis. 
   {"id": 1, "name": "Kaur", "supers": ["BitWeb"]}
   
GET /employees/ulemus?id=1&ulemus=Juht
 - Lisab töötajale IDga 1 ülemuse Juht. Vastab töötaja andmetega JSON formaadis. 
   {"id": 1, "name": "Kaur", "supers": ["BitWeb", "Juht"]}