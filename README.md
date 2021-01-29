<b> API - CRUD de clientes em Java </b>

Desenvolvido em Spring Boot , Jpa, banco H2(memória) <br>

========== <b> Inicialização Rápida pelo CMD </b> ======= <br>
 Baixar código fonte, rodar os seguintes comandos no cmd : <br>
  -cd target
  -java -jar algacrm-api-0.0.1-SNAPSHOT.jar
  
  
<br>
========= <b> Chamadas Api </b> ================= <br>

-----
URL - http://localhost:8080/clientes
Request Method - GET

Resposta : Listagem de clientes

-----

URL - localhost:8080/clientes
Request Method - POST
Body:
{
    "nome" : "Lucas",
    "cel" : "(11) 2222-2222"
}

Resposta : 
{
    "id": 1,
    "nome": "Lucas",
    "cel": "(11) 2222-2222",
    "data_cadastro": "2021-01-29T21:41:51.445+00:00"
}

------

URL - localhost:8080/clientes/update/1
Request Method - PUT
Body:
{
    "nome" : "Lucas",
    "cel" : "(11) 5555-5555"
}

Resposta : 200 OK

------ 

URL - localhost:8080/clientes/delete/1
Request Method - PUT
Resposta : 200 OK

