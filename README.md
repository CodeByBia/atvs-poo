# 📘 Lista de Exercícios – Programação Orientada a Objetos (Unidade 2)

## ✅ Q1: Hierarquia de Animais
- Criar classe `Animal` com método `som()`.
- Subclasses:
  - `Cachorro`: sobrescreve `som()` para exibir "Au Au".
  - `Gato`: sobrescreve `som()` para exibir "Miau".
- Classe `Zoologico` instancia um `Cachorro` e um `Gato`.
- Criar uma `Main` para testar.

---

## ✅ Q2: Hierarquia de Veículos
- Classe base `Veiculo` com `marca`, `modelo`, `ano`, e método `informacoes()`.
- Subclasses:
  - `Carro` com atributo `numeroDePortas`.
  - `Motocicleta` com atributo `tipoDeGuidão`.
- Ambas sobrescrevem `informacoes()`.
- Criar uma `Main` para testar.

---

## ✅ Q3: Sistema de Funcionários
- Classe base `Funcionario`: `nome`, `salarioBase`, método `calcularSalario()`.
- Subclasses:
  - `Gerente`: salário base + bônus fixo.
  - `Desenvolvedor`: salário base * produtividade.
  - `Estagiario`: salário base.
- Classe `Empresa`: gerencia lista de funcionários, método `calcularFolhaDePagamento()`.
- Criar uma `Main` para testar.

---

## ✅ Q4: Loja de Produtos Eletrônicos
- Classe base `Produto`: `nome`, `preco`, método `calcularGarantia()` (1 ano).
- Subclasses:
  - `Computador`: 3 anos.
  - `Smartphone`: 2 anos.
  - `Tablet`: 1 ano.
- Classe `Loja`: lista de produtos, método `listarGarantias()`.
- Criar uma `Main` para testar.

---

## ✅ Q5: Hierarquia de Contas Bancárias
- Classe `Conta`: `titular`, `saldo`; métodos `depositar()`, `sacar()`.
- Subclasses:
  - `ContaCorrente`: taxa no saque.
  - `ContaPoupanca`: método `adicionarRendimento()`.
  - `ContaSalario`: limite de saques mensais.
- Classe `Banco`: lista de contas, métodos `adicionarConta()` e `gerarRelatorio()`.
- Criar uma `Main` para testar.

---

## ✅ Q6: Sistema de Pagamento com Métodos de Pagamento
- Classe abstrata `MetodoPagamento`: atributo `taxa`, métodos `processarPagamento()`, `calcularTaxa()`.
- Subclasses:
  - `CartaoCredito`: taxa < 0.02.
  - `Pix`: sem taxa.
  - `Boleto`: taxa fixa de 5%.
- Classe `SistemaPagamento`: método `efetuarPagamento()`.

---

## ✅ Q7: Sistema de Transporte com Tipos de Veículo
- Classe abstrata `Veiculo`: `capacidade`, `velocidadeMaxima`, métodos `calcularTempo()`, `tipoDeCombustivel()`.
- Subclasses:
  - `Carro`: "Gasolina".
  - `Avião`: "Querosene de aviação".
  - `Navio`: "Diesel marítimo".
- Classe `GestorDeTransporte`: método `calcularViagem()`.

---

## ✅ Q8: Sistema de Biblioteca com Empréstimos
- Classe abstrata `MaterialBiblioteca`: `titulo`, `prazoDevolucao`, método `calcularMulta()`.
- Subclasses:
  - `Livro`: taxa 1.0.
  - `Revista`: taxa 2.0.
  - `DVD`: taxa fixa de 5.0.
- Classe `SistemaBiblioteca`: métodos `registrarEmprestimo()`, `calcularMulta()`.

---

## ✅ Q9: Sistema de Processamento de Imagens
- Classe abstrata `Imagem`: `largura`, `altura`; métodos `calcularTamanho()`, `processar()`.
- Subclasses:
  - `ImagemColorida`: filtro de saturação.
  - `ImagemPretoBranco`: preto e branco.
  - `ImagemTransparente`: máscara de transparência.
- Classe `EditorImagem`: métodos `exibirInformacoes()`, `ajustarImagem()`.

---

## ✅ Q10: Sistema de Gestão de Projetos
- Classe abstrata `MembroEquipe`: `nome`, `projeto`; métodos `trabalhar()`, `obterDetalhes()`.
- Subclasses:
  - `Desenvolvedor`, `Designer`, `GerenteDeProjetos`.
- Classe `GestorProjeto`: `adicionarMembro()`, `exibirRelatorio()`, `listarEquipePorProjeto()`.

---

## ✅ Q11: Sistema de Mensagens com Tipos de Envio
- Interface `EnvioMensagem`: métodos `enviar()`, `obterStatus()`.
- Implementações:
  - `EnvioEmail`
  - `EnvioSMS`
  - `EnvioWhatsApp`
- Classe `GestorMensagens`: método `enviarMensagem()`.

---

## ✅ Q12: Sistema de Descontos com Estratégias
- Interface `EstrategiaDesconto`: método `calcularDesconto()`.
- Implementações:
  - `DescontoFidelidade` (5%)
  - `DescontoSazonal` (10%)
  - `DescontoPromocional` (R$ 20 fixo)
- Classe `GestorDeDescontos`: método `aplicarDesconto()`.

---

## ✅ Q13: Sistema de Pagamento com Processadores
- Interface `ProcessadorPagamento`: `autorizarPagamento()`, `processarPagamento()`.
- Implementações:
  - `ProcessadorCartao`
  - `ProcessadorPix`
  - `ProcessadorBoleto`
- Classe `SistemaPagamento`: método `realizarPagamento()`.

---

## ✅ Q14: Sistema de Relatórios com Formatos de Exportação
- Interface `ExportadorRelatorio`: método `exportar()`.
- Implementações:
  - `ExportadorPDF`
  - `ExportadorCSV`
  - `ExportadorXML`
- Classe `SistemaRelatorios`: método `exportarRelatorio()`.

---

## ✅ Q15: Veículos Autônomos com Controle de Navegação
- Interface `ControleAutonomo`: `iniciarRota()`, `ajustarVelocidade()`.
- Implementações:
  - `ControleCarro`
  - `ControleDrone`
  - `ControleNavio`
- Classe `SistemaAutonomo`: método `navegar()`.

---

## ✅ Q16: Restaurante com Pratos e Ingredientes
- Classe abstrata `Ingrediente`: `nome`, `quantidade`, método `informar()`.
- Subclasses:
  - `Proteina`
  - `Carboidrato`
  - `Tempero`
- Classe `Prato`: `adicionarIngrediente()`, `listarIngredientes()`.
- Interface `Preparo`, implementação: `PratoSimples`.

---

## ✅ Q17: Biblioteca com Usuários e Empréstimos
- Classe abstrata `Material`: `titulo`, método `informarMaterial()`.
- Subclasses:
  - `Livro`, `Revista`, `DVD`
- Interface `Emprestavel`: `emprestar()`, `devolver()`.
- Classe `Usuario`: `adicionarMaterial()`, `listarMateriaisEmprestados()`.

---

## ✅ Q18: Inventário com Produtos e Fornecedores
- Classe abstrata `Produto`: `nome`, `preco`, método `calcularDesconto()`.
- Subclasses:
  - `Eletronico` (10%)
  - `Alimento` (5%)
  - `Vestuario` (15%)
- Interface `Fornecimento`: `fornecerProduto()`.
- Classe `Fornecedor`: `adicionarProduto()`, `listarProdutosFornecidos()`.

---

## ✅ Q19: Gestão de Times e Tarefas
- Classe abstrata `Tarefa`: `descricao`, método `realizarTarefa()`.
- Subclasses:
  - `Desenvolvimento`, `Design`, `Teste`
- Interface `Papel`: método `executarPapel()`.
- Classe `MembroEquipe`: `adicionarTarefa()`, `listarTarefas()`.

---

## ✅ Q20: Reservas de Transporte com Rotas
- Classe abstrata `Veiculo`: `modelo`, `capacidade`, método `calcularTempo()`.
- Subclasses:
  - `Onibus`, `Carro`, `Moto`
- Interface `Reservavel`: `reservar(data, rota)`
- Classe `Rota`: `origem`, `destino`, `adicionarVeiculo()`, `listarVeiculos()`

---
