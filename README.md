# atividades-estrutura-de-dados

# Atividade 15/05
    Sistema de Atendimento Hospitalar

Você será responsável por desenvolver um algoritmo para controlar a fila de atendimento em um hospital. O sistema deve ser capaz de adicionar pacientes à fila, atender pacientes de acordo com a prioridade e exibir informações sobre a fila de atendimento.

Requisitos:

Implemente uma classe chamada "GestaoHospital" que represente um módulo de gestão de antendimento no hospital. Algumas funcionalidades devem ser observadas:

1. Quando um paciente é adicionado na fila de espera, o algoritmo deve perguntar seu nome, cpf e o nível de prioridade: 0 - normal, 1 - leve, 2 - moderado, 3 - severo.

2. O sistema deve sempre chamar para atendimento um paciente de acordo com a regra a seguir:

    Chama 1 paciente severo
    Chama 1 paciente moderado
    Chama 1 paciente leve
    Chama 1 paciente severo
    Chama 1 paciente moderado
    Chama 1 paciente severo
    Chama 1 paciente normal

O sistema deve repetir essa sequência sempre que precisar chamar um paciente. Crie um código main de demonstração que utilize a classe "GestaoHospital" para simular o atendimento de pacientes. O programa deve permitir as seguintes operações:

* Adicionar um paciente à fila, especificando sua prioridade.

* Atender o próximo paciente de acordo com a prioridade.

* Exibir o número de pacientes na fila.

Dicas:

    Você pode utilizar uma ou mais estruturas de dados como uma lista encadeada ou um array para implementar a(s) fila(s) e/ou pilha(s).
    Considere utilizar diferentes estruturas de dados para armazenar pacientes de diferentes prioridades, como listas separadas ou uma única lista ordenada por prioridade.
    Lembre-se de tratar os casos em que a estrutura de dados está vazia ou quando o usuário tenta atender um paciente sem que haja pacientes na fila.

# ------------------------------------------------------------------------------

# Atividade 17/05

Questão 1. Um supermercado está passando por problemas de organização e espera nas filas
dos caixas. Como especialista em filas, você foi contratado para ajudar a melhorar o design do
sistema de filas do supermercado. Proponha um plano de ação para solucionar o problema,
considerando fatores como tempo médio de espera, número de caixas, distribuição de clientes,
entre outros.

Questão 2. Em uma empresa de serviços ao cliente, há um alto volume de chamadas recebidas
diariamente, causando filas e tempos de espera longos para os clientes. Desenvolva uma
proposta para otimizar o sistema de atendimento, levando em consideração estratégias como
atendimento prioritário, distribuição equitativa de chamadas entre os atendentes, utilização de
chatbots, entre outros, a fim de reduzir o tempo de espera dos clientes e melhorar a satisfação
geral.

Questão 3: Uma empresa de tecnologia está enfrentando problemas com a gestão das filas de
atendimento do seu suporte técnico. Os clientes têm relatado longos tempos de espera e
insatisfação com o serviço. Desenvolva um plano para melhorar o sistema de filas de
atendimento técnico, considerando aspectos como triagem de chamados, encaminhamento
para especialistas, tempo de atendimento por chamado, entre outros, visando otimizar o
tempo de espera e aumentar a eficiência do suporte.

Questão 4. Uma cidade está enfrentando problemas com as filas nos pontos de ônibus,
principalmente em horários de pico. Como especialista em filas, você foi chamado para propor
soluções que melhorem o fluxo de passageiros e reduzam os tempos de espera. Desenvolva um
plano que envolva estratégias como aumento do número de ônibus em horários de pico,
adoção de sistemas de controle de fluxo, criação de filas organizadas nos pontos de embarque,
entre outras, para melhorar a eficiência do sistema de transporte público da cidade.

# ------------------------------------------------------------------------------