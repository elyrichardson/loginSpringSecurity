# loginSpringSecurity
App for login authentication using Spring boot Security:

- To register account:
http://localhost:8080/api/auth/register
use JSON format at Body, ex:
{
    "nome": "Mariah",
    "email": "mariah@email.com",
    "senha": "1234"
}

- To login account:
http://localhost:8080/api/auth/authenticate
use JSON format at Body, ex:
{
    "email": "mariah@email.com",
    "senha": "1234"
}

The token is valid for 60 seconds and can be tested at:
http://localhost:8080/api/demo-controller
Authorization Type Bearer Token passing the token generated. 
