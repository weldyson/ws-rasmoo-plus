
  <h1>📦 ws-rasmoo-plus</h1>
  <p>API REST desenvolvida com <strong>Spring Boot 3.2</strong>, parte prática do curso de backend com foco em <em>boas práticas</em>, <em>segurança</em>, <em>documentação</em>, <em>testes automatizados</em>, <em>cache com Redis</em>, <em>integração com meios de pagamento</em> e <em>deploy em nuvem (AWS Elastic Beanstalk)</em>.</p>

  <h2>🧩 Objetivo do Projeto</h2>
  <ul>
    <li>Gestão de usuários</li>
    <li>Controle de planos e assinaturas</li>
    <li>Pagamento com integração externa (Raspay)</li>
    <li>Segurança com autenticação via <strong>JWT</strong></li>
    <li>Recuperação de senha com envio de e‑mail e Redis</li>
    <li>Upload/download de imagem de perfil</li>
    <li>Documentação via Swagger</li>
  </ul>

  <h2>🛠️ Tecnologias Utilizadas</h2>
  <ul>
    <li>Java 17</li>
    <li>Spring Boot 3.2</li>
    <li>Spring Security + JWT</li>
    <li>Spring Data JPA + Hibernate</li>
    <li>Springdoc OpenAPI (Swagger 3)</li>
    <li>Docker e Docker Compose</li>
    <li>MySQL + Redis</li>
    <li>Amazon AWS (Elastic Beanstalk, RDS, S3, VPC)</li>
    <li>JUnit + Mockito</li>
    <li>Maven</li>
  </ul>

  <h2>🧱 Módulos do Curso Implementados</h2>
  <p>O projeto aborda diversos módulos do curso:</p>
  <ul>
    <li>Criação de projeto com Maven</li>
    <li>Integração com Docker e Docker Compose</li>
    <li>CRUD completo com DTOs, validações e tratamento de erros</li>
    <li>Versionamento de API</li>
    <li>Documentação da API com Swagger</li>
    <li>Cache com Redis e invalidadores automáticos</li>
    <li>Integração com API de pagamento externa (Raspay)</li>
    <li>Envio de e‑mail para recuperação de conta</li>
    <li>Autenticação e autorização com JWT</li>
    <li>Testes automatizados com foco em Service e Controller</li>
    <li>Deploy completo na AWS com Redis, RDS e Beanstalk</li>
  </ul>

  <h2>🧪 Como Rodar o Projeto</h2>
  <h3>Pré‑requisitos</h3>
  <ul>
    <li>Java 17</li>
    <li>Maven</li>
    <li>Docker + Docker Compose</li>
  </ul>
  <h3>Passos</h3>
  <pre><code>
# Clone o repositório
git clone https://github.com/weldyson/ws-rasmoo-plus
cd ws-rasmoo-plus
git checkout feature/atualizacao-springboot3

# Suba os containers do MySQL e Redis
docker-compose up -d

# Rode a aplicação
mvn spring-boot:run
  </code></pre>
  <p>A aplicação estará disponível em: <strong>http://localhost:8082</strong></p>
  <p>Documentação Swagger: <strong>http://localhost:8082/swagger-ui.html</strong></p>

  <h2>📌 Endpoints (exemplos)</h2>
  <ul>
    <li><code>POST /auth</code> – Geração de token JWT</li>
    <li><code>GET /subscriptions</code> – Listagem de planos</li>
    <li><code>POST /users</code> – Cadastro de novo usuário</li>
    <li><code>PATCH /users/photo</code> – Upload de foto</li>
    <li><code>POST /recover-password</code> – Envio de código por e‑mail</li>
    <li><code>POST /process-payment</code> – Integração com Raspay</li>
    <li><code>GET /v1/subscription-types</code> – Versionamento de API</li>
  </ul>
  <p>👉 Todos os endpoints protegidos exigem token JWT no header: <code>Authorization: Bearer &lt;token&gt;</code></p>

  <h2>🧪 Testes Automatizados</h2>
  <ul>
    <li>Cobertura de camada de serviço e controller</li>
    <li>Testes de exceção e comportamento com Mockito</li>
    <li>Utilização do H2 para testes integrados</li>
    <li>TDD aplicado na funcionalidade de upload de fotos</li>
  </ul>

  <h2>☁️ Deploy na Nuvem</h2>
  <ul>
    <li>Uso do AWS Elastic Beanstalk para deploy da aplicação</li>
    <li>Configuração de ambiente com VPC, Redis e RDS</li>
    <li>Deploy via <em>.jar</em> com configuração <code>application-prod.properties</code></li>
  </ul>

  <h2>📚 Sobre o Curso</h2>
  <p>Este projeto é parte de um curso de backend da Rasmoo, onde os alunos constroem uma API profissional com integrações reais, seguindo boas práticas modernas do ecossistema Spring.</p>

  <h2>✅ Concluído até aqui</h2>
  <ul>
    <li>Atualização para Spring Boot 3.2</li>
    <li>Integração com Docker</li>
    <li>CRUD com validações</li>
    <li>JWT Auth</li>
    <li>Integração com Raspay</li>
    <li>Upload de imagem</li>
    <li>Redis Cache</li>
    <li>Testes automatizados</li>
    <li>Deploy na AWS</li>
  </ul>

  <h2>📄 Licença</h2>
  <p>MIT</p>
</body>
</html>
