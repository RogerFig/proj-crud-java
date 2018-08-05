CRUD-JAVA-SERVLETS 
=================
Projeto Simples em Java com Servlets

CRUD para gerenciamento de usuários. 

Como configurar no Eclipse:
	1. File -> Open Projects from File System... -> 
		1.1 Selecionar a pasta onde está o projeto e depois clicar em finish;
	2. Menu Project -> Properties -> Projects Facets -> Convert to faceted form...
		2.1 Selecione a opção Dynamic Web Module -> Apply and Close
	3. Botão direito no projeto -> Propriedades
		3.1 Selecione "Java Build Path"
		3.2 Clique na aba "Libraries"
		3.3 Clique em "Add Libraries"
		3.4 Select "Server Runtime" -> Next...
		3.5 Selecione ou crie um Servidor para uso. (Em caso de criação e adição de servidor seguir o passo a passo neste link: https://goo.gl/fBnrvb)
	4. Para executar o projeto, selecione o projeto -> clique no menu Run -> Run as... -> Run on Server -> Selecione um servidor e Finish.

Observações:

1. Se ocorrer erro ao encontrar a biblioteca do mysql, seguir os passos abaixo:
	- Project-> Properties-> Deployment Assembly-> Add-> Archives From File System -> Next -> Add

	- Navegar para a pasta onde está localizado o mysql-connector-java, selecione o arquivo e clique em OK;
	- Click Finish. Depois em OK.
	
2. Ver arquivo banco.sql para geração do bd do projeto.