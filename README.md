<h1>Controle de cadastro</h1>

<img src="https://cdn.discordapp.com/attachments/766798638139179031/1081993109501644831/cadastroGif.gif"/>

<p>Nessa atividade deve ser desenvolvido um programa que
controla o cadastro das pessoas que trabalham em uma Empresa Pública.
As pessoas que trabalham nessa empresa podem ser Técnico
Administrativos ou Professores. O chefe máximo é “Jener de Souza
Novais”. Ao se cadastrar uma nova pessoa deve ser cadastrado seu chefe,
e se ela é uma pessoa com habilitação para ser Chefe ou apenas um
subordinado. Apenas quem tem habilitações de Chefe podem ter
funcionários subordinados. A seguir temos a tela de cadastro das pessoas
da empresa</p>

<p>A seguir é apresentado um diagrama com uma lista de pessoas e seus
dependentes. Os que estão marcados com um asterisco (*) são Empregados,
todos os outros são chefes.</p>

<img src="https://cdn.discordapp.com/attachments/766798638139179031/1081994692981424299/Screenshot_2.png"/>

<p>Na tela de relatórios deve ser possível mostrar os subordinados e os chefes de
uma determinada pessoa escolhida.</p>

<p>O sistema deve ser feito orientado a objeto. Deve conter uma Classe abstrata
funcionário e os tipos concretos Professor e Técnico Administrativo. Um
funcionário pode ter habilitação de Chefe ou ser apenas um Subordinado. A
classe funcionário deve ter um método abstrato que retorna a lista de
subordinados e a lista de chefes. Aqui temos a ideia de herança múltipla que
deve ser implementada através de Interfaces. Chefe e Subordinado são
classes que implementam Habilitação. E a classe Funcionário é abstrata e tem
um atributo função do tipo Habilitação, que deve ser ou Subordinado ou
Chefe.</p>
