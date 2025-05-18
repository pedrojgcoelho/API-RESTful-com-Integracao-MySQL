
# API RESTful - Gerenciamento de Alunos

Este projeto consiste em uma API RESTful simples desenvolvida com Spring Boot, que realiza operações CRUD sobre a tabela de alunos em um banco de dados MySQL.

## 👨‍🏫 Desenvolvedor
- Nome: Pedro José Guimarães Coelho
- Data de entrega: 20/05/2025

---

## 🚀 Como Executar a Aplicação

### 1. Pré-requisitos
- Java 17+
- Maven
- MySQL Server
- VSCode com Extensão Spring Boot (ou IDE de sua preferência)
- Postman para testes

### 2. Banco de Dados

Use o script `create_db.sql` (fornecido com o projeto) para criar o banco de dados e a tabela no MySQL:

```sql
CREATE DATABASE escola;
USE escola;

CREATE TABLE aluno (
    matricula INT PRIMARY KEY,
    nome VARCHAR(100),
    idade INT,
    email VARCHAR(100)
);
```

### 3. Configurar `application.properties`

No arquivo `src/main/resources/application.properties`, ajuste a URL e as credenciais do seu banco de dados:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/escola
spring.datasource.username=root
spring.datasource.password=SUA_SENHA
```

### 4. Rodar a Aplicação

No terminal, execute:

```bash
mvn spring-boot:run
```

---

## 📡 Endpoints da API

| Método | Endpoint                      | Descrição                   |
|--------|-------------------------------|-----------------------------|
| GET    | `/alunos`                    | Listar todos os alunos      |
| GET    | `/alunos/{matricula}`      | Buscar aluno por matrícula  |
| POST   | `/alunos`                    | Inserir novo aluno          |
| PUT    | `/alunos/{matricula}`      | Atualizar dados do aluno    |
| DELETE | `/alunos/{matricula}`      | Remover aluno               |

### Exemplo de JSON (para POST e PUT)

```json
{
  "matricula": 1,
  "nome": "João Silva",
  "idade": 18,
  "email": "joao@email.com"
}
```

---

## 📦 Conteúdo do Projeto para Entrega

- Pasta do projeto (`api-alunos/`)
- Script SQL: `create_db.sql`
- Prints ou vídeo de testes no Postman:
  - POST /alunos ✅
  - GET /alunos ✅
  - GET /alunos/{matricula} ✅
  - PUT /alunos/{matricula} ✅
  - DELETE /alunos/{matricula} ✅
- Este arquivo `README.txt`

---

## ✅ Testado e funcionando com sucesso
