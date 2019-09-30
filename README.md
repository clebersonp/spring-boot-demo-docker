#Projeto spring-boot demo utilizando mysql e openjdk 8 e docker

##Steps usando o terminal e OS Linux Ubuntu:

##Imagens utilizadas:
- mysql:5.7.19
- openjdk:8
- clebersonp/spring-boot-docker:latest

___

###Step 1 - Entrar no do diretorio raiz do projeto:
cleberson@note-dell:~$ cd workdirectory/spring-boot-docker/

___

###Step 2 - Listar o conteudo da raiz do projeto:
cleberson@note-dell:~/ambienteDesenv/github-repo/spring-boot-docker$ ls
database  docker-compose.yml  Dockerfile  HELP.md  mvnw  mvnw.cmd  pom.xml  src  target
___

###Step 3 -  Execute o Step 3.1 utilizando o plugin do maven ou o Step 3.2 utilizando plugin do docker:
    
####Step 3.1 - Compilar o projeto com plugin do maven:
cleberson@note-dell:~/ambienteDesenv/github-repo/spring-boot-docker$ mvn clean install 

####Step 3.2 - Compilando e gerando imagem do projeto com o plugin docker:build do maven:
cleberson@note-dell:~/ambienteDesenv/github-repo/spring-boot-docker$ mvn clean install docker:build

___

###Step 4 - Construindo imagens e executando multiplos containers definido no docker-compose: 
cleberson@note-dell:~/ambienteDesenv/github-repo/spring-boot-docker$ docker-compose up