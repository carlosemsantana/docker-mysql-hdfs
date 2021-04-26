# Importando Dados do MySQL para o HDFS com Sqoop


### Resumo


Esta página foi elaborada, com informações básicas, sobre como importar dados do MySQL para o HDFS com Apache Sqoop, em um ambiente de desenvolvimento e testes local.


### Pré-requisitos:    

- Máquina com sistema operacional Linux;
- Java(TM) SE Runtime Environment (build 1.8.0_281-b09)
- Docker instalado e configurado; 
- [MySQL Server instalado e configurado em um container Docker ou na máquina local;](https://github.com/carlosemsantana/docker-mysql-server)
- [Apache Hadoop Pseudo Cluster instalado e configurado em um container Docker ou máquina local;](https://github.com/carlosemsantana/docker-hadoop)
- [Conector/JDBC do MySQL](https://dev.mysql.com/downloads/connector/j/)
- [Apache Sqoop 1.4.7 instalado e configurado](https://sqoop.apache.org/)


### Atenção: 


O Sqoop versão 1.4.7 não é homologado para funcionar com Hadoop versão 3 ou superior. Por esse motivo, temos que incluir manualmente um pacote que está faltando, ```commons-lang-2.6```,  para que funcione normalmente.


Você pode baixar este pacote no endereço: https://github.com/dsacademybr/Libs


Descompacte o pacote e copie o arquivo <b>commons-lang-2.6.jar</b> para o diretório LIB do sqoop. No meu ambiente o sqoop foi instalado em /opt/sqoop.

<!-- #region -->
```bash
$ cp commons-lang-2.6.jar /opt/sqoop/lib/
``` 
<!-- #endregion -->

Você também precisa baixar e copiar o <b>Connector/J 8.0.24</b> para a pasta LIB do Apache Sqoop 

<!-- #region -->
```bash
$ cp mysql-connector-java-8.0.24.jar /opt/sqoop/lib/
``` 
<!-- #endregion -->

### Importar dados MySQL e gravar no HDFS: 


Para ilustração do exemplo de importação de dados no HDFS com Sqoop, criei previamente uma base de testes no MySQL com alguns registros.


### Teste sua conexão


Testaremos a conexão do Sqoop com o banco de dados MySQL, criando uma "string" de conexão que liste todos os bancos de dados.

<!-- #region -->
```bash
$ sqoop list-databases --connect jdbc:mysql://ip_servidor_mysql:3306/ --username seu_usuário -P
```
<!-- #endregion -->

![](img/list-databases.png)


A conexão foi realizada com sucesso, os bancos de dados listados. Temos algumas mensagens de WARNINGS mas isto não é um problema, porque vamos conseguir realizar as operações de importações.


### Importação dos dados

<!-- #region -->
```bash 
$ sqoop import --connect jdbc:mysql://ip_servidor_mysql:3306/banco_dados?serverTimezone=UTC \
               --username usuário -P \
               --table tabela_do_banco --m 1
``` 
<!-- #endregion -->

O Sqoop conecta no banco de dados MySQL, executa um "select" na tabela indicada, gera um job mapreduce e envia para o HDFS, o Yarn gerencia a execução dos jobs, e a importação será realizada com sucesso.


![](img/job.png)


Job enviado para HDFS


![](img/mapreduce.png)


E lá está! job executado com sucesso. 


### HDFS


Agora, confirmaremos o JOB que foi gravado no HDFS.

<!-- #region -->
```bash 
$ hdfs dfs -ls /user/hadoop/pedido
```
<!-- #endregion -->

![](img/ls1.png)


E lá está! o job foi executado com sucesso e gravado no diretório /user/hadoop/pedido/part-m-00000


Baixaremos o arquivo gerado e gravado Hadoop HDFS no diretório da máquina local.

<!-- #region -->
```bash
$ hdfs dfs -get /user/hadoop/pedido/part-m-00000
```
<!-- #endregion -->

![](img/dados_importados.png)


Listaremos o coteúdo do arquivo.

<!-- #region -->
```bash 
$ nano part-m-00000 
```
<!-- #endregion -->

![](img/arquivo.png)


Eis um fragmento dos dados que foram importados do MySQL para o HDFS via Sqoop.


Finalizando, vou copiar os dados do container Hadoop para minha máquina local.


### Copiar dados do Container Hadoop para máquina local.


Copiarei os dados, e o JOB que o Apache Sqoop gerou para gravar no HDFS. Como estou trabalhando em container Docker, uma das formas é listar os volumes compartilhados, para saber onde os arquivos do Hadoop foram gravados 
na máquina local.

<!-- #region -->
```bash 
$ docker volume ls
$ docker volume inspect hadoop_home
```
<!-- #endregion -->

![](img/volumes.png)


Lá está! o conteúdo do diretório home/hadoop do container está sendo gravado na máquina local em <b>/var/lib/docker/volumes/hadoop_home/_data</b>


![](img/volume_hadoop.png)


Listagem do diretório compartilhado entre a máquina local e o container.


Copiaremos os aquivos: <b>part-m-00000</b> onde foi gravado os dados da tabela do MySQL, e o arquivo <b>pedido.java</b> que é a classe java, que gerou o JOB mapreduce e que gravou os dados no HDFS.

<!-- #region -->
```bash
$ sudo cp  /var/lib/docker/volumes/hadoop_home/_data/part-m-00000  ~/home/
$ sudo cp  /var/lib/docker/volumes/hadoop_home/_data/pedido.java  ~/home/


```
<!-- #endregion -->

![](img/cp.png)


Feito! os arquivos foram copiados do "container" para máquina local.


### Conclusão


Realizamos teste com Apache Sqoop, importamos tabela do servidor MySQL para o Apache Hadoop e gravamos os dados no HDFS. Por fim, copiamos os dados do container Hadoop para máquina local. 

Apache Sqoop (TM) é uma ferramenta projetada para transferir dados em massa de maneira eficiente entre o Apache Hadoop e armazenamentos de dados estruturados, como bancos de dados relacionais.

Espero ter contribuido com o seu desenvolvimento de alguma forma.


[Carlos Eugênio](https://carlosemsantana.github.io/)


### Referências


[Data Science Academy](https://www.datascienceacademy.com.br/)

[Instalação e configuração do MySQL Communit Server no Linux com Docker](https://github.com/carlosemsantana/docker-mysql-server)

[Instalação e Configuração de um container Docker Apache Hadoop](https://github.com/carlosemsantana/docker-hadoop)

[Dumping Data in SQL Format with mysqldump](https://dev.mysql.com/doc/refman/5.7/en/mysqldump-sql-format.html)

```python

```
