import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@ManagedBean
@SessionScoped
public class JogosBean {
    
    private Jogos jogo = new Jogos();
    private List<Jogos> jogosRegistrados = new ArrayList<Jogos>();
    private static int idCount = 1;

    public void salvarJogo() {
        jogo.setId(idCount++);
        jogo.setData(new Date()); // Define a data atual
        jogo.setNumeroSecreto(new Random().nextInt(5) + 1); // Número secreto de 1 a 5
        jogo.setResultado(jogo.getNumeroAposta().equals(jogo.getNumeroSecreto()) ? "acertou" : "não acertou");
        jogosRegistrados.add(jogo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Jogo gravado com sucesso!", null));
        jogo = new Jogos(); // Reinicia o objeto para novo cadastro
    }

    public Jogos getJogo() {
        return jogo;
    }

    public void setJogo(Jogos jogo) {
        this.jogo = jogo;
    }

    public List<Jogos> getJogosRegistrados() {
        return jogosRegistrados;
    }

    public void setJogosRegistrados(List<Jogos> jogosRegistrados) {
        this.jogosRegistrados = jogosRegistrados;
    }

    public void excluir(Jogos jogo) {
        jogosRegistrados.remove(jogo);
    }
}
