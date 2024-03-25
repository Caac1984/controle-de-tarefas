package Controle.controle.de.tarefas.Task;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descricao;
    private boolean completo;
    
    public Object getTitle() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getTitle'");
    }
    public void setTitle(Object title2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }
    public Object getDescription() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getDescription'");
    }
    public void setDescription(Object description2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setDescription'");
    }
    public Object isCompleted() {
        
        throw new UnsupportedOperationException("Unimplemented method 'isCompleted'");
    }
    public void setCompleted(Object completed2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setCompleted'");
    }
}