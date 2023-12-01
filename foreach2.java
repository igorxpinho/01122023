import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class foreach2 {

    public static void main(String[] args) {
        // Amigos secretos participando
        String[] participantes = {"Igor", "Camily", "Arlindo", "Selma", "Henrique", "Gustavo", "Paulo", "Josy", "Salinet", "Julio", "Fer", "Oiram", "Jhonata", "Yohan", "Vitor", "Curry", "Tomita",};

        // Fazer sorteio do amigo secreto
        sortearAmigoSecreto(participantes);
    }

    // Forma/Método para realizar o sorteio
    public static void sortearAmigoSecreto(String[] participantes) {
        // Listagem provisória para mostrar/controlar quem já tirou quem
        List<String> participantesDisponiveis = new ArrayList<>();
        for (String participante : participantes) {
            participantesDisponiveis.add(participante);
        }

        // Fazer sorteio
        for (String participante : participantes) {
            // Embaralhar a lista de participantes disponíveis
            Collections.shuffle(participantesDisponiveis);

            // Aderir um amigo secreto diferente do participante atual
            String amigoSecreto = null;
            for (String possivelAmigo : participantesDisponiveis) {
                if (!possivelAmigo.equals(participante)) {
                    amigoSecreto = possivelAmigo;
                    break;
                }
            }

            // Mostrar o resultado do sorteio
            if (amigoSecreto != null) {
                System.out.println(participante + " tirou " + amigoSecreto);
                participantesDisponiveis.remove(amigoSecreto); // Tirar o amigo secreto que ja foi sorteado da lista
            } else {
                System.out.println("Ops! Não foi possível realizar o sorteio para " + participante);
                break;
            }
        }
    }
}