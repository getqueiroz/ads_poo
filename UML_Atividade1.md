- Sistema de Gestão Acadêmica

- Representação de uma classe
- Associação / Agregação / Composição / Herança / Dependência
- Cardinalidade (Multiplicidade) 1
- DrawIo: https://drive.google.com/file/d/1NYfdHNzp4LLDyt7Is10R3teSbTMp5nur/view?usp=sharing

class Curso
    - código
    - nome
    - duração
    - area
    - formato
    - descrição
    - carga horária
    - valor mensal

class Disciplina
    - codigo
    - curso
    - nome
    - professor
    - ementa
    - carga horária

class Professor
    - código
    - nome
    - sexo
    - cpf
    - data de nascimento
    - email
    - telefone
    - endereço
    - área
    - formação
    - data de contratação
    - salário

class Turma
    - codigo
    - curso
    - sala
    - data de inicio
    - data de conclusão

class Aluno
    - código
    - turma
    - nome
    - sexo
    - cpf
    - data de nascimento
    - email
    - telefone
    - endereço
    - responsável