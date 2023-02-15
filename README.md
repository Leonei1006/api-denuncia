## API de denúncias

API desenvolvida para moradores realizarem denúncias de situações públicas, assim eles terão um canal direto com a prefeitura ou orgão responsável. o endereço será informado através de cordenadas GPS.

Para o desenvolvimento desta aplicação foram utilizados:
* Java na versão 17
* Springboot
* Maven
* PostgreSQL

Pra rodar está aplicação na sua máquina você deverá:
* Clonar o repositório
* Entrar no arquivo pom.xml e setar a versão correta do Java 17
* Ir no aplication.properties e configurar o seu banco de dados com usuário e senha, neste caso foi utilizado  o PostgreSQL, caso utilize outro banco deverá trocar o drive para o do banco que escolher
* E por ultimo dar o build no projeto, como utilizei o Maven, podem fazer via IDE ou via terminal (pelo terminal você deverá abrir ele no repositório do projeto e dará o comando "mvn clean package".
