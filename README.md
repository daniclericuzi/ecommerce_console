# Automação de Testes site lojas Americanas

Projeto de Automação de Teste criado com a API Selenium WebDriver e framework JUnit para estruturação dos casos de teste, verificação das saídas e testes. Utilização do padrão PageObject, em linguagem Java (utilizando a IDE Eclipse), com o objeto de solucionar o desafio abaixo:

- 1- Acessar o site www.americanas.com
- 2- Buscar por "PS4"
- 3- Selecionar o Primeiro console
- 4- Digitar o CEP e imprimir os valores dos fretes disponíveis
- 5- Clicar em comprar
- 6- Selecionar garantia +12meses
- 7- Clicar em continuar
- 8- Verificar se o produto se encontra na cesta

Para gerenciar as dependências, foi utilizado o Maven. 

### Requisitos

..* Navegador Chrome Driver instalado;
..* Realizar o download do 'chromedriver'(com base na versão do browser instalado);
..* Java versão 8+.

### Como configurar o ambiente:

1) Fazer o clone do projeto utilizando o comando Git a seguir:
``` 
git clone https://github.com/daniclericuzi/ecommerce_console.git
```
2) Importar o projeto no Eclipse (ou na IDE de preferência)
3) Configurar o WebDriver
..* No projeto, abrir a classe BaseTest.java e alterar o valor da propriedade "webdriver.chrome.driver" para o caminho do diretório que se encontra o executável do chrome driver:
```
System.setProperty("webdriver.chrome.driver", "C:\\caminho\\para\\chromedriver.exe");
```
### Como executar o Teste

Na Classe HomePageTests, clicar botão direito > Run as > JUnit test.
