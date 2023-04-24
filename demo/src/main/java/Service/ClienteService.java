package Service;

import Model.Clientes;

public interface ClienteService {

	Iterable<Clientes> buscarTodos();

	Clientes buscarPorId(Long id);

	void inserir(Clientes cliente);

	void atualizar(Long id, Clientes cliente);

	void deletar(Long id);

}
