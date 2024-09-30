package dio.padroes.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dio.padroes.projeto.model.Cliente;
import dio.padroes.projeto.service.impl.ClienteServiceImpl;

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping("/buscarTodos")
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteServiceImpl.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteServiceImpl.buscarPorId(id));
    }

    @PostMapping("/inserir")
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteServiceImpl.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        clienteServiceImpl.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        clienteServiceImpl.deletar(id);
        return ResponseEntity.ok().build();
    }


}
