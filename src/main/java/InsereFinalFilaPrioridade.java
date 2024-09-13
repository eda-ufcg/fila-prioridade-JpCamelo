import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
        Pair pair = new Pair(elemento, prioridade);
        this.fila.add(pair);
    }


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
        for(int i = 0; i < this.fila.size(); i++){
            maior = this.lista.get(0).getElemento();
        }
		return maior;
	}

    //Dica: faça seus próprios testes

}
