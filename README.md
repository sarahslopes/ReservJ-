# ReservJa

# API REST utilizando Spring Boot

A ReservJa molda um sistema de gerenciamento de hotéis e apartamentos completo por meio requisições restfull mapeadas por módulos.
A api permite que sejam feitos cadastros de novos hotéis, listagem dos hotéis cadastrados por filtros (podendo ser id/ nome / quartos), atualização e deleção dos cadastros.

## Métodos
Requisições para a API devem seguir os padrões:
| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |

## Requisições personalizadas
As ações de `listar` permitem o envio dos seguintes parâmetros:

| Parâmetro | Descrição |
|---|---|
| `id` | Filtra dados pelo id informado. |
| `name` | Filtra dados pelo nome informado. |
| `room` | Filtra dados pelo número de quartos informado. |


## Respostas

| Código | Descrição |
|---|---|
| `200` | Requisição executada com sucesso (success).|
| `201` | Requisição executada com sucesso (created).|
| `400` | Erros de validação ou os campos informados não existem no sistema.|
| `400` | Erro ao processar requisição.|
| `405` | Método não implementado.|

A ReservJa possui uma classe para tratamento personalizado de excessões portanto, os erros citados acima serão capturados e retornados como "erro ao processar requisição" ou "erro campo inválido". Para adequação da resposta a requisição basta verificar e alterar os dados fornecidos durante a solicitação.

# Configuração banco de dados

A api utiliza do banco de dados MySql, para utilizar o seu banco com usuário local basta  clonar o repositório na sua máquina, localizar o arquivo "application.properties" e mudar o user, nome do banco e senha. É necessário que o banco citado na classe de configuração esteja vazio para que o hibernate possa fazer a persistência dos dados pré-configurados na aplicação.


# Documentação Swagger

Com o servidor embarcado startado, a documentação personalizada da Api com o Swagger ficará disponível na url: http://localhost:8090/swagger-ui/index.html para ser acessada após autenticação com as credenciais de teste listadas no módulo anterior. Na documentação estão listados todos os métodos detalhadamente com seus parâmetros requeridos bem como na Figura 1 abaixo.




