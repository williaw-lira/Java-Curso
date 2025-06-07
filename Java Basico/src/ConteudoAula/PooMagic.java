package ConteudoAula;
import java.util.Locale;
import java.util.Scanner;

/*
 * Nesse mini projeto utilizando Orientação a Objeto,
 * vamos criar um universo de personagens..
 */
public class PooMagic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("--- Bem-vindo ao Universo de Personagens! ---");

        // --- Criando e testando os personagens ---

        System.out.println("\n--- Criando um Demônio ---");
        // Demonio herda de Vilao, que herda de Personagem
        Demonio balrog = new Demonio("Balrog", 500, "Corrupção");
        balrog.exibirInformacoes();
        balrog.ameacar();
        balrog.invocarServos();
        balrog.atacar(new Personagem("Herói Qualquer", 30, 100, 50, "Espada", "Guerreiro"));
        System.out.println("-------------------------");

        System.out.println("\n--- Criando um Elfo ---");
        // Elfo herda diretamente de Personagem
        Elfo legolas = new Elfo("Legolas", 200, 800, 1000, "Arco Mágico", "Arco Longo");
        legolas.exibirInformacoes();
        legolas.lancarFlecha();
        legolas.atacar(balrog);
        System.out.println("-------------------------");

        System.out.println("\n--- Criando um Mago Nobre ---");
        // Nobre herda de Mago, que herda de Personagem
        Nobre gandalf = new Nobre("Gandalf", 300, "Magia Branca", "Elemental");
        gandalf.exibirInformacoes();
        gandalf.lancaFeitico();
        gandalf.usarEncantoReal();
        gandalf.atacar(balrog);
        System.out.println("-------------------------");

        System.out.println("\n--- Criando um Mago Plebeu ---");
        // Plebeu herda de Mago, que herda de Personagem
        Plebeu merlin = new Plebeu("Merlin", 150, "Ilusionismo", "Mental");
        merlin.exibirInformacoes();
        merlin.lancaFeitico();
        merlin.pedirAjuda();
        System.out.println("-------------------------");

        scanner.close();
    }
}

// --- CLASSE PAI: Personagem ---
class Personagem {
    // Atributos comuns a TODOS os personagens
    String nome;
    int idade;
    double vida;
    double mana;
    String poder; // Poder principal ou tipo de magia
    String classe; // Pode ser "Vilão", "Elfo", "Mago"

    // Construtor da classe Personagem
    public Personagem(String nome, int idade, double vida, double mana, String poder, String classe) {
        this.nome = nome;
        this.idade = idade;
        this.vida = vida;
        this.mana = mana;
        this.poder = poder;
        this.classe = classe;
    }

    // Método para exibir informações básicas do personagem
    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
        System.out.println("Poder: " + this.poder);
        System.out.println("Classe: " + this.classe);
    }

    // Método que todos os personagens podem ter
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " ataca " + alvo.nome + "!");
        
        alvo.vida -= 10; // Reduz a vida do alvo
        System.out.println(alvo.nome + " agora tem " + alvo.vida + " de vida.");
    }
}

// --- CLASSE FILHA: Vilao (herda de Personagem) ---
class Vilao extends Personagem {
    boolean chefeFinal;

    // Construtor de Vilão
    public Vilao(String nome, int idade, double vida, double mana, String poder, String classe, boolean chefeFinal) {
        super(nome, idade, vida, mana, poder, classe);
        this.chefeFinal = chefeFinal;
    }

    // Método específico de Vilão
    public void ameacar() {
        System.out.println(this.nome + " está ameaçando o Reino!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Chefe Final: " + (this.chefeFinal ? "Sim" : "Não"));
    }
}

// --- CLASSE FILHA: Demonio (herda de Vilao) ---
class Demonio extends Vilao {
    String tipoPacto;

    // Construtor de Demonio: define valores padrão e atributo extra
    public Demonio(String nome, int idade, String tipoPacto) {
        
        super(nome, idade, 10000, 5000, "Magia Negra", "Demônio", true);
        this.tipoPacto = tipoPacto;
    }

    // Método específico de Demonio
    public void invocarServos() {
        System.out.println(this.nome + " invoca seus servos demoníacos!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Pacto: " + this.tipoPacto);
    }
}

// --- CLASSE FILHA: Elfo (herda de Personagem) ---
class Elfo extends Personagem {
    String armaPreferida;

    // Construtor de Elfo: define valores padrão e atributo extra
    public Elfo(String nome, int idade, double vida, double mana, String poder, String armaPreferida) {
        // Classe padrão "Elfo"
        super(nome, idade, vida, mana, poder, "Elfo");
        this.armaPreferida = armaPreferida;
    }

    // Método específico de Elfo
    public void lancarFlecha() {
        System.out.println(this.nome + " lança uma flecha com sua " + this.armaPreferida + "!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Arma Preferida: " + this.armaPreferida);
    }
}

// --- CLASSE FILHA: Mago (herda de Personagem) ---
class Mago extends Personagem {
    String tipoDeMagia;

    // Construtor de Mago: a 'classe' (Nobre/Plebeu) virá das subclasses
    public Mago(String nome, int idade, double vida, double mana, String poder, String tipoDeMagia, String classe) {
        super(nome, idade, vida, mana, poder, classe);
        this.tipoDeMagia = tipoDeMagia;
    }

    // Método específico de Mago
    public void lancaFeitico() {
        System.out.println(this.nome + " lança um feitiço de " + this.poder + "!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Magia: " + this.tipoDeMagia);
    }
}

// --- CLASSE FILHA: Nobre (herda de Mago) ---
class Nobre extends Mago {
    // Construtor de Nobre: define valores de vida/mana e a classe
    public Nobre(String nome, int idade, String poder, String tipoDeMagia) {
        // Valores base de Mago (500 vida, 200 mana) + bônus de Nobre (500 vida, 200 mana)
        super(nome, idade, 500 + 500, 200 + 200, poder, tipoDeMagia, "Nobre");
    }

    // Método específico de Nobre
    public void usarEncantoReal() {
        System.out.println(this.nome + " usa um poderoso encanto real!");
    }
}

// --- CLASSE FILHA: Plebeu (herda de Mago) ---
class Plebeu extends Mago {
    // Construtor de Plebeu: define valores de vida/mana e a classe
    public Plebeu(String nome, int idade, String poder, String tipoDeMagia) {
        // Valores base de Mago (500 vida, 200 mana) + bônus de Plebeu (100 vida, 50 mana)
        super(nome, idade, 500 + 100, 200 + 50, poder, tipoDeMagia, "Plebeu");
    }

    // Método específico de Plebeu
    public void pedirAjuda() {
        System.out.println(this.nome + " pede ajuda aos cidadãos comuns!");
    }
}