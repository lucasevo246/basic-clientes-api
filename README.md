<h1><b> API - CRUD de clientes em Java </b> </h1>
<br>
<br>
Desenvolvido em Spring Boot , Jpa, banco H2(memória) <br>

<h1> <b> Inicialização Rápida pelo CMD </b>  </h1><br> <br>
 Baixar código fonte, rodar os seguintes comandos no cmd : <br>
  -cd target 
  <br>
  -java -jar algacrm-api-0.0.1-SNAPSHOT.jar
  <br>
  
  
<br>
<h1> <b> Chamadas Api </b>  </h1>
 <br>

-----
URL - http://localhost:8080/clientes <br>
Request Method - GET <br>

Resposta : Listagem de clientes <br>

-----

URL - http://localhost:8080/clientes  <br>
Request Method - POST <br>
Body: <br>
{ <br>
    "nome" : "Lucas", <br>
    "cel" : "(11) 2222-2222" <br>
}
<br>
Resposta :  <br>
{  <br>
    "id": 1, <br>
    "nome": "Lucas", <br>
    "cel": "(11) 2222-2222", <br>
    "data_cadastro": "2021-01-29T21:41:51.445+00:00" <br>
} 

------
<br>
URL - http://localhost:8080/clientes/update/1 <br>
Request Method - PUT <br>
Body: <br>
{ <br>
    "nome" : "Lucas", <br>
    "cel" : "(11) 5555-5555"<br>
}
<br>

Resposta : 200 OK <br>

------ 

URL - http://localhost:8080/delete/1  <br>
Request Method - PUT <br>
Resposta : 200 OK <br>

