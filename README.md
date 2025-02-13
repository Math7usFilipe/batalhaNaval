## Jogo: Sink a Dot Com (Estilo Batalha Naval)

Construiremos um jogo no estilo Batalha Naval: **"Sink a Dot Com"**.

Será você contra o computador, mas diferente do jogo de Batalha Naval real, aqui nenhum navio será nosso. Em vez disso, sua tarefa será afundar os navios do computador no menor número de tentativas.

> **Nota:** Não afundaremos navios, mas eliminaremos *Dot Coms* (empresas na Internet). Isso demonstra a importância das empresas para que você possa avaliar o custo deste livro.

### 🎯 Objetivo
Afundar todas as *Dot Coms* do computador no menor número de tentativas. Você receberá uma classificação ou nível, baseado em como foi seu desempenho.

### 🛠️ Preparação
- Quando o programa do jogo for iniciado, o computador inserirá três *DotComs* em uma grade virtual **7 x 7**.
- Concluída essa etapa, o jogo solicitará seu primeiro palpite.

### 🕹️ Como Jogar
- Esta versão funcionará **na linha de comando**, pois ainda não aprendemos a construir uma GUI.
- O computador solicitará que você insira um palpite (uma célula), que deve ser digitado na linha de comando, como:
    - `A3`
    - `C5`
- Em resposta ao seu palpite, você verá um resultado na linha de comando:
    - `Correto`
    - `Errado`
    - `Você afundou a Pets.Com` (ou qualquer que seja a Dot Com do dia)

### 🏁 Fim do Jogo
- O jogo termina quando você eliminar todas as três *Dot Coms*.
- Ao final, será exibida sua classificação baseada no número de tentativas utilizadas.

---
**Divirta-se afundando as Dot Coms e testando suas habilidades! 🚀**

<br>
<br>

## O jogo SimpleDotCom

### 📝 Introdução
Esta é uma versão simplificada do jogo **Sink a Dot Com**, chamada **SimpleDotCom**. Começaremos com essa versão para construir, posteriormente, o jogo completo.

### 🚀 Conceito
- Teremos **duas classes principais:** `SimpleDotComTestDrive` e `SimpleDotCom`.
- **Simplificação:** Em vez de uma grade 2D e três DotComs, usaremos **apenas uma DotCom** oculta em uma **única linha de 7 células**.

### 🎯 Objetivo
Adivinhar todas as células ocupadas pela Dot Com. O jogo terminará quando todas as células forem descobertas.

### 🛠️ Estrutura
- A classe **`SimpleDotComTestDrive`** conterá todo o código no método `main()`.
- O jogo criará **uma instância única de `SimpleDotCom`** e selecionará **3 células consecutivas** (em uma linha virtual de **7 posições**, de `0` a `6`).
- O usuário fornecerá palpites, e o jogo verificará se acertou.

### 🧠 Conceito da Linha Virtual
- Não é necessário implementar uma matriz de 7 posições.
- Basta armazenar as **3 células ocupadas** pela Dot Com.
- O jogo saberá que as células são consecutivas e estarão entre as 7 posições possíveis.

### 🕹️ Ciclo do Jogo
1. O jogo cria uma **instância da DotCom**.
2. **Atribui 3 células consecutivas** para a Dot Com.
3. **Solicita palpites** ao usuário.
4. **Verifica o acerto** e repete até eliminar todas as células.

<br>
<br>
