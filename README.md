# Instagram para ZUP Bootcamp

##### Desenvolvedora

[Luciana Araújo](https://github.com/laas84)



> Status do Projeto: Em desenvolvimento 🚧

### Tópicos

:ballot_box_with_check: Descrição do projeto

:ballot_box_with_check:  O que a plataforma é capaz de fazer

:ballot_box_with_check: Pré-requisitos e como rodar a aplicação

:ballot_box_with_check: Dependências instaladas​ 

:ballot_box_with_check: Features​

:ballot_box_with_check: Problemas encontrados​ 

:ballot_box_with_check: Diário de bordo

:ballot_box_with_check: ​  Tarefas em aberto

#### Descrição do Projeto 

Desenvolver uma API com framework Spring que serve uma rede social chamada Instagram para interação entre usuários por meio de publicações.

#### O que a Plataforma é capaz de fazer?  

:star: Publicar conteúdo em formato de imagem ou vídeo

:star: Editar as publicações com efeitos visuais

:star: Interagir em publicações por meio de curtida, comentário, compartilhamento

:star: Buscar por novos seguidores

:star: Publicar histórias, publicação que tem duração de 24h, permitindo ao usuário compartilha seu momento atual

:star: Marcar outros usuários em publicação, bem como marcar localização da publicação

:star: Ter conversas privadas com seguidores ou com outros usuários

:star: Fazer vídeos ao vivo de até 60 minutos permitindo comentários e reações dos expectadores

:star: Publicar microvídeos com efeitos audiovisuais

:star: Salvar publicações em que se tem interesse em uma espécie de repositório para visualização futura

:star: Adicionar uma descrição ao perfil do usuário

:star: Guardar as publicações no perfil com ideia de um album de fotos visualizados por seguidores

:star: Escolher entre conta privada ou pública, esta, por sua vez, entre pessoal e comercial

:star: Desativar temporariamente a conta 



#### Pré-requisitos e como rodar a aplicação

- [JDK11: Necessário para executar o projeto Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Spring Initializr : Para fornecer a interface com configurações pré estabelecidas](https://start.spring.io/)
- [Eclipse:  IDE para desenvolvimento do projeto](https://www.eclipse.org/downloads/)
- [H2:  Banco de dados escolhido pela simplicidade e praticidade](https://www.h2database.com)


`` # Clone este repositório $ git clone <https://github.com/laas84/Bootcampzup.git> ``

`` # Acesse a pasta do projeto no terminal/cmd $ cd git `` 

`` # Vá para a pasta server $ cd server ``

`` # Execute a aplicação em modo de desenvolvimento $ npm run dev:server ``

`` # O servidor inciará na porta:8080 - acesse <http://localhost:8080/> ``

#### Depências instaladas

###### Framework: Spring boot

<p align="left">
 <a href="#objetivo">Data JPA</a> •
 <a href="#roadmap">Security</a> • 
 <a href="#tecnologias">DevTools</a> • 
 <a href="#contribuicao">H2</a> • 
 </p>


###### Externas: 

<p align="left">
 <a href="#objetivo">Jjwt</a> •
 <a href="#roadmap">springfox-swagger2</a> • 
 <a href="#tecnologias">swagger-ui</a> • 
 </p>

 ### Features  
 
> Tarefas planejadas na *Sprint* 1

- [x] Conectar o  banco de dados ao código 
- [x] Inserção de usuário
- [ ] Validação de usuário
- [x] Exclusão de usuário
- [x] Postar conteúdo
- [x] Editar conteúdo
- [x] Buscar conteúdo
- [x] Comentar conteúdo
- [x] Excluir comentário
- [x] Segurança da aplicação
- [ ] Acesso a aplicação
- [x] Documentação

### Problemas encontrados

O problema encontrado no projeto foi que, ao tentar acessar o swagger pela porta 8080, pela url http://localhost:8080/swagger-ui.html o navegador direciona automaticamente para a url de login: http://localhost:8080/login , no entanto todas as alterações de código foram feitas na classe SecurityConfiguration.java: 

```
.and().csrf().disable()
.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
```
O código foi revisado, reimplementado e o erro persistiu. Sem tempo hábil para demais soluções, visto que esse problema foi detectado no 4º dia da *Sprint* 1, ao analisar o quão primordial ela é para o andamento das próximas *Sprints*, foi decidido 
### Diário de bordo

------

###### Dia 1 - 24/08/2020

Nesse dia, ao receber o e-mail, entendi a tarefa e analisei as palavras chaves para decidir como organizaria o meu projeto: "5 dias" e "prioridades", logo, decidi basear meu projeto em um projeto ágil, pois sabia que não conseguiria terminar o projeto em 5 dias, mas poderia documentar os próximos passos a cada semana (As sprints). Para o meu projeto, de forma lúdica, eu mesma fui o Product Owner, o Scrum Master e o time de desenvolvimento.

- Coleta de dados: O diferencial do instagram e suas funcionalidades
- Planejamento da *Sprint*:
  - Entender como eu organizaria o Backlog do Produto e o que seria prioridade diante das funcionalidades que eu levantei
  - Estimei em 4 *Sprints* o projeto, com a primeira *release* com 1 *sprint* (o código postado)



###### Dia 2 - 25/08/2020

- Criei as histórias
- Medi a prioridade em alta, média e baixa
- Estimei as histórias
- Quebrei as histórias em tarefas

###### Dia 3 - 26/08/2020

>*Dia 1 da primeira sprint*

- Revisei as histórias com a técnica MOSCOW para saber quais iriam entrar na minha primeira sprint, quais mudariam a prioridade para próximas sprints e quais seriam descartadas
- Definição das duas primeiras *sprints*
- Inicio da documentação
- Início da implementação do código
  - Criar e configurar projeto usando Spring 
  - Criar pacotes Model; Service; Controller e Repository
  
###### Dia 4 - 27/08/2020

>*Dia 2 da primeira sprint*
  - Criação de classes e interfaces
  - Implementação de CRUD
  - Estudo de documentação de Spring Security
  
 ###### Dia 5 - 28/08/2020 
 
 >*Dia 3 da primeira sprint*
  - Implementação da validação e segurança;
  - Implementação do Swagger;

**** PROXIMAS SPRINTS : TESTES e DTO explicar pq nao teve
