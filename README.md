# Desafio PicPay

Este projeto foi desenvolvido como parte de um desafio para praticar a linguagem Java, seguindo as especificações do teste para a posição de desenvolvedor júnior na empresa PicPay no ano de 2023.

## Descrição

O desafio consiste em criar API para transações entre usuários e lojas, seguindo as regras e requisitos fornecidos pelo teste da PicPay. O objetivo é demonstrar habilidades em desenvolvimento backend utilizando Java.

## Funcionalidades

- **Registro de Usuários e Lojas:** Implementação de endpoints para cadastro de usuários e lojas.
- **Transações:** APIs para realizar transações financeiras entre usuários e lojas, respeitando as regras estabelecidas no teste.
- **Autenticação e Autorização:** Utilização de métodos de autenticação e autorização para garantir a segurança das transações.
- **Documentação:** Descrição clara dos endpoints disponíveis e exemplos de requisições e respostas.

## Tecnologias Utilizadas

- Java
- Spring Framework (Spring Boot, Spring MVC)
- Banco de dados  MySQL

## Instalação e Uso

Para utilizar este projeto localmente, siga as instruções abaixo:

1. **Clone o repositório:**
   ```
   git clone https://github.com/gabrielfteixeira/desafio-picpay.git
   ```
   
2. **Configuração do Banco de Dados:**
   - A aplicação possui dentro da pasta /docker uma image de banco de dados MySQL, para usar apenas abra o terminal na pasta e rode o seguinte comando
     ```
     docker compose up 
     ``` 
   - Configure o banco de dados conforme especificado no arquivo de configuração (`application.properties` ou similar).
     

3. **Compilação e Execução:**
   - Compile o projeto e execute utilizando sua IDE favorita ou via linha de comando.

4. **Endpoints Disponíveis:**
   - Cadastrar novo usuario, sendo do tipo USER ou MERCHANT
   ```
   /wallets
   ```
   **possui validações**
   
  - Consulte a documentação gerada para verificar os endpoints disponíveis e exemplos de uso.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT) - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
