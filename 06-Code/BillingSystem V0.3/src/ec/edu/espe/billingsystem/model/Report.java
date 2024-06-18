
package ec.edu.espe.billingsystem.model;
import java.util.Objects;
/**
 *
 * @author David Pantoja, JavaSquad, DCCO-ESPE
 */
public class Report {
    private int id;
    private String type;
    private String content;

    public Report(int id, String type, String content) {
        if (id < 0) {
<<<<<<< HEAD
            throw new IllegalArgumentException("Debe ingresar un número positivo");
=======
            throw new IllegalArgumentException("El ID del informe no puede ser negativo");
>>>>>>> 947e8e8b567d8ea6453ad7e427a783eeb8ea36df
        }
        this.id = id;
        this.type = Objects.requireNonNull(type, "El tipo no puede ser nulo");
        this.content = Objects.requireNonNull(content, "El contenido no puede ser nulo.");
    }

    @Override
    public String toString() {
        return "Report{" + "id=" + id + ", type=" + type + ", content=" + content + '}';
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
